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
    File creation = new File("C:\\Users\\SreeraG\\Documents\\NetBeansProjects\\ForCodeReading\\created");   //this is used to create from inside the code...
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
   // System.out.println(path);
    return path;
}

public void create_tree(File [] f) throws IOException{
    String breaker;
    String ko;
    String o;
    for(File k : f){
    if(k.isDirectory()){
        
        o = k.toString();
        ko = org_path.toString();
        breaker = o.substring(ko.length(), o.length());
        clone_dir(creation,breaker,0);
        create_tree(k.listFiles());
    }
    else{
        o = k.toString();
        ko = org_path.toString();
        breaker = o.substring(ko.length(), o.length());
        System.out.println(k.getName() + " is a file\n");
        clone_dir(creation,breaker,1);
    }
    
}
}

public void clone_dir(File destn,String dir_or_file,int flag) throws IOException{ // used to create a clone
    // of the working directory into another location
    if(flag == 0){      //flag is 0 if it is directory...
        File f = new File(destn + dir_or_file);
        f.mkdir();
    }
    else{
        File f = new File(destn + dir_or_file);
        f.createNewFile(); 
    }
    
}
}
