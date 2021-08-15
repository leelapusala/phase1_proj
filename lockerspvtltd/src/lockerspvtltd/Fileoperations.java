package lockerspvtltd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Fileoperations {
	
	
	
	public static List<String> retrieveAllFiles(String filePath)
	{
		try {
			
		File f1 = new File(filePath);
		String[] fileList = f1.list();
		
		List files= Arrays.asList(fileList);
		
		Collections.sort(files);
		return files ;
	
	}
	
	catch(Exception e) {
		System.out.println("IO Exception occured");
	}
		return new ArrayList<>();
		
	}
	
	
	
	
	public static boolean createAndAddcontenttoFile(String filePath,String fileName ,List<String> contentList)
	{
		
		
		try {
			if(fileName != null || fileName.length() != 0) {
				File fnew = new File(filePath,fileName);
			
			    FileWriter fw = new FileWriter(fnew);
			    System.out.println("File created successfully");
			      for(String s:contentList)
				     {
				       fw.write(s+"\n");
				     }
			
			      	   fw.close();
			      	   return true;
			}else
			{
				System.out.println("File name is Empty or Null");
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static boolean deleteFile(String filePath, String fileName) {
		try {
			File f = new File(filePath + "\\" + fileName);
			return f.delete();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean searchFile(String filePath,String fileName){
		
		try {
	         File f = new File (filePath+"\\"+fileName);
	         if(f.exists())
	        	 return true;
	         else
	        	 return false; 
	        	 
		}catch(Exception e)
		{
		e.printStackTrace();
		return false;
		}
	}
}
