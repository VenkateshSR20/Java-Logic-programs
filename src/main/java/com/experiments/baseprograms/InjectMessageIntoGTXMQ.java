package main.java.com.experiments.baseprograms;

import java.io.File;

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
}
