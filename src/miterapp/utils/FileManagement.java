/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author begoingtodev
 */
public class FileManagement {
    public static String path = Paths.get("").toAbsolutePath().toString()+"/data";
    
    public static void createFile(String dir,String filename) throws IOException{
        if(createDir(dir)) System.out.println("Create folder successfully.");
        File folder = new File(path+dir+"/"+filename);
        
        if(folder.createNewFile()) System.out.println("File have been created.");
    }
    
    public static boolean createDir(String dir){
        File folder = new File(path+dir);
        if(!folder.exists()){
            return folder.mkdirs();
        }
        return false;
    }
    
    public static boolean createDirData(){
        File folder = new File(path);
        if(!folder.exists()){
            return folder.mkdirs();
        }
        return false;
    }
}
