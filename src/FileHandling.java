import java.io.File;
import  java.util.Scanner;
public class FileHandling{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String s=ob.nextLine();
        File f1=new File(s);
        if(f1.exists()){

            System.out.println("File Name: "+f1.getName());
            System.out.println("Path: "+f1.getPath());
            System.out.println("Absolute Path: "+f1.getAbsolutePath());
            System.out.println("Parent: "+f1.getParent());
            System.out.println("Is File: "+f1.isFile());
            System.out.println("Is Directory: "+f1.isDirectory());
            System.out.println("Is Readable: "+f1.canRead());
            System.out.println("Is Writable: "+f1.canWrite());
            System.out.println("Is Absolute: "+f1.isAbsolute());
            System.out.println("File Last Modified: "+f1.lastModified());
            System.out.println("File Size: "+f1.length()+" bytes");
            System.out.println("Is Hidden: "+f1.isHidden());
        }
        else{
            System.out.println("File Not Found");
        }

    }
}

