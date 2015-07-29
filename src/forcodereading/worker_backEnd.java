/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcodereading;
import java.io.*;
import java.util.*;

public class worker_backEnd {
   // String p = convert_path(org_path);
    File [] root ;
    int i ;
    int k = 0;
    static String org_path;
    File creation = new File("C:\\Users\\SreeraG\\Documents\\NetBeansProjects\\ForCodeReading\\filePG\\createdCode");
public worker_backEnd(File[] root, int i) {
        this.root = root;
        this.i = i;
    }
public worker_backEnd(){
    
}
    
    
    
public static String convert_path(String op)       //this is used to convert the relative path to absolute path
{
   String path = "";
   for(int i = 0; i < op.length();i++){
       char a = op.charAt(i);
       if(a == '\\' )
       {
          path = path + "\\" + "\\"; 
       }
       else{
               path = path + a;
       }
   }
    System.out.println(path);
    return path;
}

public void create_tree(File [] f){
   // System.out.println("Inside...");
    System.out.print(f.toString().length() + "\n");
    System.out.print(creation.toString().length() + "\n");
    for(File k : f){
    if(k.isDirectory()){
        String o = k.toString();
        System.out.println("size of o : " +o.length()+ "and content is :" + o +"\n");
        o = o.substring((int) creation.toString().length(),o.length());
        System.out.println( o + " is a directory.\n");
        create_tree(k.listFiles());
    }
    else{
        System.out.println(k.getName() + " is a file\n");
    }
    
}
}

public void clone_dir(File [] root,String dir_or_file){
    
    String s= creation + "";
    
}
}
