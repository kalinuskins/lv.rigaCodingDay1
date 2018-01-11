/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lvworker_adress;

/**
 *
 * @author oleg
 */
public class Adress {
    
     public String valsts;
     public String pilseta;
     public String iela;
     public String majasNr;
     public String dzivoklaNr;
     
     public String pilnaAdrese(){
         String pilnaAdrese = "";
         
         if (valsts != null && valsts !=""){
             pilnaAdrese += valsts + ",";
             // same as --> pilnaAdrese = pilnaAdrese + Valsts ",";
         }
         if (pilseta != null && pilseta != ""){
           pilnaAdrese += pilseta + ",";
         }
         //"Latvia, Riga"
         if (pilnaAdrese.length()>0){
             pilnaAdrese = pilnaAdrese.substring(0, pilnaAdrese.length()-2);
             
            return pilnaAdrese; 
         }
     }
     
     
    
 
                 
     
}