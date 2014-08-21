/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gea.system.nofitifcation;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Vipul
 */
public class TestClass {

    public static void main(String args[]){
       try{

           System.out.println("Program start...");

           InputStream im = new FileInputStream(new File(""));
           BufferedInputStream bf = new BufferedInputStream(im);


//       while(1==1){
//            System.out.println("Program Running.....");
//            try {
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//
//        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
