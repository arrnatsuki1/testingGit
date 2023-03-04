/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author rossopt
 */
public class ClaseEscritura {
    
    void escribir() {
        try {
            FileWriter fw = new FileWriter("TXT.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("hello world");
            
            bw.close();
            fw.close();
            
        } catch (Exception e) {
        }
    }
    
}
