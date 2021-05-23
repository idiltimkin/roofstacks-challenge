package com.roofstacks.util;

import java.io.File;

public class FileUtil {

    public static String getSampleFilePath(){
        return new File("sample.txt").getAbsolutePath();
    }
}
