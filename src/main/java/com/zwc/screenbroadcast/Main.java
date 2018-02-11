package com.zwc.screenbroadcast;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 主入口函数
 */
public class Main {

    public static void main(String[] args) throws Exception {
        new AppUI();
        new WebServer();
        new MouseCapture();
        new Push();
    }

}