/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miterapp.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author begoingtodev
 */
public class FileManagement {

    public static String path = Paths.get("").toAbsolutePath().toString() + "/data";
    public static String reportPath = "/reports";

    public static void createFile(String dir, String filename) throws IOException {
        if (createDir(dir)) {
            System.out.println("Create folder successfully.");
        }
        File file;
        if (dir != null) {
            file = new File(path + dir + "/" + filename);
        } else {
            file = new File(path + "/" + filename);
        }
        if (file.exists()) {
            System.out.println("File: " + filename + " already existed.");
        } else {
            if (file.createNewFile()) {
                System.out.println("File have been created.");
            }
        }
    }

    public static boolean createDir(String dir) {
        File folder = new File(path + dir);
        if (!folder.exists()) {
            return folder.mkdirs();
        }
        return false;
    }

    public static boolean createReportDir(String dirName) {
        File folder = new File(path + reportPath +"/"+ dirName);
        if (!folder.exists()) {
            return folder.mkdirs();
        }
        return false;
    }

    public static boolean createDirData() {
        File folder = new File(path);
        if (!folder.exists()) {
            return folder.mkdirs();
        }
        return false;
    }

    public static List<String> folders(String dir) {
        File folder = new File(path + dir);
        File[] dirs = folder.listFiles(File::isDirectory);
        List<String> data = new ArrayList<>();
        for (File dir1 : dirs) {
            data.add(dir1.getName());
        }
        return data;
    }
    
    public static void renameDir(String oldDir,String toDir) throws Exception{
        File dir = new File(path+reportPath+oldDir);
        System.out.println("Dir: " + dir.getPath());
        File newDir = new File(path+reportPath+toDir);
        if(newDir.exists()){
            throw new Exception("Your folder already exist.");
        }
        dir.renameTo(newDir);
    }
}
