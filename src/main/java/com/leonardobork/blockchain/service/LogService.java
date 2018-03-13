/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardobork.blockchain.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import org.springframework.stereotype.Service;

/**
 *
 * @author leonardobork
 */
@Service
public class LogService {

    private static PrintWriter writer;

    public LogService() throws FileNotFoundException, UnsupportedEncodingException {
        writer = new PrintWriter("../LOG.txt", "UTF-8");
    }
    
    public void write(String line){
        writer.println(line);
    }

    public String getLog() {
        try {
            Scanner in = new Scanner(new FileReader("../LOG.txt"));
            StringBuilder sb = new StringBuilder();
            while (in.hasNext()) {
                sb.append(in.next());
            }
            in.close();
            return sb.toString();
        } catch (FileNotFoundException ex) {
            return "Problems with logger...";
        }
    }
}
