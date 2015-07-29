/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    this is a small utility for reading from project files and creating and saving
    the files inside it into corresponding text files for reading in ipad or mobile devices.
*/
package forcodereading;

import java.io.File;    //THIS IS THE CONTROL PANEL

/**
 *
 * @author SreeraG
 */
public class ForCodeReading {
    public static void main(String[] args) {
        ui_frontEnd g = new ui_frontEnd(); 
        g.setVisible(true);
        worker_backEnd w = new worker_backEnd();
    //    w.create_tree(w.root);
       // File [] root = new File("C:\\Users\\SreeraG\\Documents\\NetBeansProjects\\ForCodeReading").listFiles();
     //   thisisaPLAYGROUND t = new thisisaPLAYGROUND();
     //   t.pgtest();
    }
    
}
