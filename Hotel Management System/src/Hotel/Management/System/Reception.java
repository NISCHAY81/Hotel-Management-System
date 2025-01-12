package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setBounds(280,5,1238,820);
      panel.setBackground(new Color(3,45,48));
      add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i22 = i111.getImage().getScaledInstance(1238,820, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(0,0,1238,820 );
        panel.add(label11);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(5,530,250,250 );
       panel1.add(label);

       JButton btnNCF = new JButton("New Customer form");
       btnNCF.setBounds(30,30,200,30);
       btnNCF.setBackground(Color.BLACK);
       btnNCF.setForeground(Color.WHITE);
       panel1.add(btnNCF);
       btnNCF.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
                  new NewCustomer();
               }catch (Exception E){
                   E.printStackTrace();
               }
           }
       });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    new Department();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.WHITE);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   new Employee();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("All Customer Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                 new CustomerInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manger Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                  new ManagerInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Check out");
        btnCO .setBounds(30,270,200,30);
        btnCO .setBackground(Color.BLACK);
        btnCO .setForeground(Color.WHITE);
        panel1.add(btnCO );
        btnCO .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CheckOut();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("Update Check-In Details");
        btnUC .setBounds(30,310,200,30);
        btnUC .setBackground(Color.BLACK);
        btnUC.setForeground(Color.WHITE);
        panel1.add(btnUC );
        btnUC .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   new UpdateCheck();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUR = new JButton("Update Room Status");
        btnUR .setBounds(30,350,200,30);
        btnUR .setBackground(Color.BLACK);
        btnUR.setForeground(Color.WHITE);
        panel1.add(btnUR);
        btnUR .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   new UpdateRoom();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick up Service");
        btnPUS  .setBounds(30,390,200,30);
        btnPUS .setBackground(Color.BLACK);
        btnPUS .setForeground(Color.WHITE);
        panel1.add(btnPUS );
        btnPUS .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   new PickUp();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR   .setBounds(30,430,200,30);
        btnSR .setBackground(Color.BLACK);
        btnSR .setForeground(Color.WHITE);
        panel1.add(btnSR  );
        btnSR  .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new SearchRoom();


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });








        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);


    }

    public static void main(String[] args) {
     new Reception();
    }
}
