/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.energydata.service.dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bingzhi
 */
public class FileDataLoader  implements DataLoader{

    @Override
    public boolean loadData(String dataSource) {
        
        FileReader fr=null;
     
        try {
            fr = new FileReader(dataSource);
           
            BufferedReader br=new BufferedReader(fr);
           
            String line ="";
            ArrayList arrs =null;
            while ((line=br.readLine())!=null) {
                //System.out.println(line);
                String[] split = line.split("\\t");
               
                for(int i=0;i<split.length;i++){
                
                 System.out.println(split[i]);
                
                
                }
                
               
            }
          
            br.close();
            fr.close();

        } catch (IOException ex) {
            Logger.getLogger(FileDataLoader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(FileDataLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

        
    }
    
    
    public static void main(String args[]){
    
        System.out.println("loadData");
        String dataSource = "C:\\Users\\Miage\\Projet2013\\EnergyData\\Data\\RawData\\1000080-2000900-3009906.txt";
        FileDataLoader instance = new FileDataLoader();
        //boolean expResult = false;
        boolean result = instance.loadData(dataSource);
    
    
    
    
    }
    
}
