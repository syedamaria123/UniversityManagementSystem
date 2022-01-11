/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Marks extends JFrame{

   JTextArea t1;
   JPanel p1;
   
   Marks(){}
   Marks(String str){
       setSize(500,600);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       t1 = new JTextArea(50,15);
       JScrollPane jsp = new JScrollPane(t1);
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(p1,"North");
       
       add(jsp,"Center");
       
       setLocation(450,200);
       mark(str);
   }
   
   public void mark(String s){
    try{
           File myObj = new File("Marks.txt");
           FileWriter myWriter = new FileWriter("Marks.txt");
           
           String s1 = "insert into subject values('"+t1.getText()+"')";
           
           t1.setText("\tResult of Examination\n\nSubject\n");
           
           
           myWriter.write("subject1");
           myWriter.write("subject2");
           myWriter.write("subject3");
           myWriter.write("subject4");
           myWriter.write("subject5");
           
           myWriter.write("marks1");
           myWriter.write("marks2");
           myWriter.write("marks3");
           myWriter.write("marks4");
           myWriter.write("marks5");
           myWriter.close();
           
           
           
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Marks().setVisible(true);
   }
}