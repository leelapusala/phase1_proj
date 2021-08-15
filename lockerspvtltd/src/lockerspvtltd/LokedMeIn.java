package lockerspvtltd;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LokedMeIn
{
	public static final String filePath = System.getProperty("user.dir"); 

	public static void main(String[] args) {
		
		processUserChoice();
		

	}

	public static int displayUserchoiceMenu() {
		
		int ch ;
		System.out.println("Please Enter your Choice: \n"
				+ "1. Get All Files \n"
				+ "2. Add new File \n"
				+ "3. Delete File \n"
				+ "4. Search File \n"
				+ "5. Exit Application \n");
		
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		
		return ch;
		
	}

	public static void processUserChoice() {
		
		
		do {
		
			int ch = displayUserchoiceMenu();
		switch(ch)
		{
		case 1:
		{
			 System.out.println("Retrieving Files\n");
			 Fileoperations.retrieveAllFiles(filePath)
			 				.forEach(x -> System.out.println(x));
	
			 System.out.println("**********************************************");
			 break;
		}
		case 2:
		{
			System.out.println("Adding files");
			Fileoperations.createAndAddcontenttoFile(filePath,
					                                 getFileNameFromUser(),
					                                 getContentFromUser());
			System.out.println("**********************************************");
		    break;
		}
		case 3:
		{
			System.out.println("Deleting Files");
			if (Fileoperations.deleteFile(filePath,getFileNameForDelete()))
				System.out.println("File Deleted...");
			else
				System.out.println("Unable to delete file");
			
			 break;
		}
		case 4:
		{
			System.out.println("Searching for File");
			if (Fileoperations.searchFile(filePath,getFileNameForSearch()))
				System.out.println("File Found...");
			else
				System.out.println("Unable to find file");
			 break;
		}
		case 5:
		{
			System.exit(0);
			System.out.println("Exit from application");
		}
			
		default:
			 System.out.println("Invalid Choice ..Please enter valid option");
		}
		
		
	}while(true);
	}
	
	
	public static String getFileNameFromUser()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the New File Name to create");
	String fileName = sc.next();
	return fileName;
	}
	
	public static List<String> getContentFromUser() {
		int lineCount = 0; 
		List<String> content = new ArrayList<String>();
		String enteredString = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many lines you need to enter:: ");
		lineCount= Integer.parseInt(sc.nextLine());
		for(int i=1;i<=lineCount;i++)
		{
			System.out.println("please enter line "+i);
			enteredString=sc.nextLine();
		    content.add(enteredString);
		
		
		}
		//sc.close();
		return content;
	}
	
public static String getFileNameForDelete()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the FileName for Delete");
	String f = sc.nextLine();
	return f ;
}

public static String getFileNameForSearch()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the FileName for search");
	String f = sc.nextLine();
	return f;
}
}
