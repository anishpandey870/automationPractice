package org.example.fileHandling;

import java.io.File;

public class FolderAction {
    //create the folder
    public static void createFolder(String folderPath) {
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("folder created :" + folderPath);
        }
    }

    //check the folder or not
    public static boolean checkExistedFolder(String folderPath) {
        File folder = new File(folderPath);
        return (folder.exists());
    }

    /*
     *@param old path and new path
     */
    public static void renameFolder(String oldPath, String newPath) {
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);
        if (oldFolder.exists()) {
            oldFolder.renameTo(newFolder);
            System.out.println("folder rename :" + newPath);
        }
    }

    //delete the folder
    public static void deleteFolder(String path) {
        File folderPath = new File(path);
        if (folderPath.exists()) {
            folderPath.delete();
            System.out.println("folder deleted successfully");
        }
    }


    public static void main(String[] args) {
        String path = "D:\\myNewFile";
          FolderAction.createFolder(path);
        boolean check = FolderAction.checkExistedFolder(path);
        System.out.println(check);
        String newFolderPath = "C:\\myNewFile";
        //FolderAction.renameFolder(path,newFolderPath);
        //FolderAction.deleteFolder(path);
    }
}
