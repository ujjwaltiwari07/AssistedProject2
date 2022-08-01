import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class writeFile {
	public static void main(String args[]) throws IOException
	{
//create a file
		 File f=new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\File.txt");
			if(f.createNewFile())
			{
			System.out.println("created the new file  "+f.getName());
				}
			else
			{
			System.out.println("alredy exist");
				}
		//write in file
			FileWriter fw=new FileWriter("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\File.txt");
			fw.write("hello this ujjwal  ");
			fw.close();
			System.out.println("successfully write in file");
		//appending
			FileWriter fw1=new FileWriter("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\File.txt",true);
			PrintWriter out=new PrintWriter(fw1);
			out.println("  by ujjwal this is append ");
			out.close();
			System.out.println("appending done");
			//Reading
			  File ff= new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\File.txt");
			   Scanner sc=new Scanner(f);
			    		 while(sc.hasNext())
			    		 {
			    			 String s = sc.nextLine();
			    			 System.out.println(s);
			    		 }}
	}
