package org.example;

import java.io.File;
import java.time.LocalDateTime;

public class FileProvider {

    private static final String FILE_NAME = "mortgage-report";
    private static final String FILE_EXTENSION = ".csv";

    public static File getFile(){
        //Get the path of jar files
        String rootPath= System.getProperty("user.dir");

        //To prevent error of creating files with same name, adding timestamp:
        return new File(rootPath + "/" + FILE_NAME + "-" + LocalDateTime.now().toString().replace(":","") + FILE_EXTENSION);
    }
}
