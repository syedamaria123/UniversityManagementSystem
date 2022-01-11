package university.management.system;




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TeacherDetails extends JFrame implements ActionListener{
 
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Class X(%)", "Class XII(%)", "Aadhar No","Course","Department", "Employee Id"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    TeacherDetails(){
        super("Teacher Details");
        setSize(1260,650);
        setLocation(200,200);
        setLayout(null);
        
        l1 = new JLabel("Enter roll number to delete Teacher : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);
            
        l2 = new JLabel("Add New Teacher");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2 = new JButton("Add");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        add(b2);
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        try{
            File myObj = new File("TeacherDetails.txt");
            FileWriter myWriter = new FileWriter("TeacherDetails.txt");
            String s1 = "select * from teacher";
            myWriter.write(s1);
            myWriter.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
       
    
        if(ae.getSource() == b1){
            try{
                FileWriter myWriter = new FileWriter("TeacherDetails.txt");
                String a = t2.getText();
                String q = "delete from teacher where emp_id = '"+a+"'";
                myWriter.write(a);
                myWriter.close();
                this.setVisible(false);
                new TeacherDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddTeacher().f.setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new TeacherDetails().setVisible(true);
    }
    
}

