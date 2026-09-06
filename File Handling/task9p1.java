import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task9p1{
    public static void main(String[] args) {
        
        try{
        File file=new File("Saloni.txt");
        if(file.createNewFile()){
            System.out.println("File Successfully Created");
        }
        else{
            System.out.println("Already Created");
        }
    }
    catch(IOException e1){
        System.out.println(e1.getMessage());
    }

    try{
        FileWriter writer=new FileWriter(("Saloni.txt"));
        writer.write("Quiz Club Seceratary!");
        writer.close();
        System.out.println("writtern successfully");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    try{
        File file=new File("Saloni.txt");
        Scanner reader=new Scanner(file);
        while(reader.hasNextLine()){
            String line=reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    try{
        File file=new File("Saloni.txt");
        System.out.println("File Nmae : "+file.getName());
        System.out.println("File Path : "+file.getAbsolutePath());
        System.out.println("Length : "+file.length());
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    try{
        File file=new File("Saloni.txt");
        if(file.exists()){
            System.out.println("File Already Exist");
        }
        else{
            System.out.println("No such File Found");
        }
    }catch(Exception e){
        System.out.println(e);
    }
    try{
        File file=new File("Saloni.txt");
        if(file.delete()){
            System.out.println("File Deleted Successfully");
        }
        else{
            System.out.println("No such File Exist");
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
    
    }
