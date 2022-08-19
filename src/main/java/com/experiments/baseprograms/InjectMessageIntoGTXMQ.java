package main.java.com.experiments.baseprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InjectMessageIntoGTXMQ {

	public static void main(String[] args) {
		String filePath = getPath(getPropertyValue("payloadFilePath", "envConfig.properties"));
		
		//MQ Name
		String mqName = getPropertyValue("mqName", "envConfig.properties");
		
		//Inject Message into MQ
		injectMessageIntoMQ(filepath, mqName);
	}
	
	static void injectMessageIntoMQ(String filePath, String mqName) throws Exception {
		String rootFolder = System.getProperty("user.dir");
		String arcFilePath = getPath(getPropertyValue("archivedPayloadFilePath", "envConfig.properties"));
		createDir(arcFilePath);
		File arcFolder = new File(rootFolder + arcFilePath);
		emptyDirectory(arcFolder);
		String srcFilePath = rootFolder + filePath;
		File srcFolder = new File(srcFilePath);
		File[] payloadFiles = srcFolder.listFiles();
		
		int fileCounter = 0;
		for(File payloadFile:payloadFiles) {
			if(!payloadFile.isFile()) {
				continue;
			}
			System.out.println("\nFile " + (fileCounter + 1) + ": " + payloadFile.getName());
			String message = readFileAsString(srcFilePath + payloadFIle.getName());
			writeMsgIntoMQ(message, mqName);
			fileCounter ++;
			payloadFile.renameTo(new File(rootFolder + arcFilePath + payloadFile.getName()));
		}
		System.out.prinln("\n********************");
		System.out.println("Total messages (payloads) injected into MQ: " + fileCounter);
	}

	static void injectMessageIntoMQ(String filePath, String fileName, String mqName) throws Exception {
		String targetFile = System.getProperty("user.dir") + filePath + fileName;
		String message = readTxtFile(targetFile);
		writeMsgIntoMQ(message, mqName);
	}
	
	public static String readFileAsString(String filePathAndName) throws Exception {
		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get(filePathAndName)));
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Failure! Unable to read the file and get data.");
			throw new Exception();
		}
		return data;
	}
	
	//READ INPUT TEXT FILE AND RETURN AS STRING
	public static String readTxtFile(String fileName) throws Exception {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
		}catch (FileNotFoundException e) {
			System.out.println("Not able to read the file. \n" +e.getMessage());
			throw new Exception();
		}
		try {
			StringBuilder sb = new StringBuilder();
			String line = null;
			try {
				line = br.readLine();
			}catch(IOException e){
				System.out.println("Not able to read the file. \n" + e.getMessage());
				throw new Exception();
			}
			
			while(line != null){
				sb.append(line);
				sb.append("\r\n");
				try {
					line = br.readLine();
				}catch(IOException e) {
					System.out.println("Not able to read the file. \n" + e.getMessage());
					throw new Exception();
				}
			}
			return sb.toString();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				System.out.println("Not able to read teh file. \n" +e.getMessage());
				throw new Exception();
			}
		}
	}
}
