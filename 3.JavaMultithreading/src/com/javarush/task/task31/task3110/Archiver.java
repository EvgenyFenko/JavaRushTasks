package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String pathToArchString = bufferedReader.readLine();
        Path pathToArch = Paths.get(pathToArchString);
        ZipFileManager zipFileManager = new ZipFileManager(pathToArch);
        String pathToFileString = bufferedReader.readLine();
        Path pathToFile = Paths.get(pathToFileString);
        zipFileManager.createZip(pathToFile);

        ExitCommand exitCommand = new ExitCommand();
        exitCommand.execute();
    }
}
