/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author MNCEDISI
 */
public class FormaFrame extends JFrame
{
    private JPanel mainPNL;
    private JPanel frstContactInforContianerPNL;
    private JPanel secondContactInforContianerPNL;
    private JPanel thirdContactInforContianerPNL;
    private JPanel mainHeadingPNL1;
    private JPanel mainHeadingPNL2;
    private JPanel mainHeadingPNL3;
    private JPanel headingPNL1;
    private JPanel headingPNL2;
    private JPanel headingPNL3;
    private JPanel subHeadingPNL1;
    private JPanel subHeadingPNL2;
    private JPanel subHeadingPNL3;
    private JPanel gridTablePNL1;
    private JPanel gridTablePNL2;
    private JPanel gridButtonPNL;
    private JPanel buttPNL;
    private JPanel checkBoxPNL;
    
    private JLabel cntHeadingLBL;
    private JLabel cntSubHeadingLBL;
    private JLabel question1;
    private JLabel question2;
    private JLabel question3;
    private JLabel question4;
    private JLabel question5;
      
    private JLabel rsdHeadingLBL;
    private JLabel rsdSubHeadingLBL;
    private JLabel residenceQuestion;
    
    private JLabel disHeadingLBL;
    private JLabel disSubHeadingLBL;
 
    private JComboBox optionMenuCBB1;
    private JComboBox optionMenuCBB2;
    
    private JTextField txtQuestion2;
    private JTextField txtQuestion3;
    private JTextField txtQuestion4;
    private JTextField txtQuestion5;
    
    private JCheckBox disCheckBox;
    
    private JButton nextBTN;
    private JButton backBTN;

    public FormaFrame() 
    {
        setTitle("Application Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(580, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        
        mainPNL = new JPanel(new GridLayout(3, 0));
        checkBoxPNL = new JPanel(new GridLayout(2, WIDTH));
        frstContactInforContianerPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        secondContactInforContianerPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        thirdContactInforContianerPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        mainHeadingPNL1 = new JPanel(new GridLayout(2, WIDTH));
        mainHeadingPNL2 = new JPanel(new GridLayout(2, WIDTH));
        mainHeadingPNL3 = new JPanel(new GridLayout(2, WIDTH));
        
        headingPNL1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingPNL2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingPNL3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        subHeadingPNL1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        subHeadingPNL2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        subHeadingPNL3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        gridTablePNL1 = new JPanel(new GridLayout(5, 2));     
        gridTablePNL2 = new JPanel(new GridLayout(1, 1)); 
        buttPNL = new JPanel(new GridLayout(1, 2 , 10, 10));
        gridButtonPNL = new JPanel(new GridLayout(2, 0 , 0 , 10));
        
        cntHeadingLBL = new JLabel("Contract Information");
        cntHeadingLBL.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 20));
        cntHeadingLBL.setForeground(Color.blue);
        
        rsdHeadingLBL = new JLabel("Residence Information");
        rsdHeadingLBL.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 20));
        rsdHeadingLBL.setForeground(Color.blue);
       
        disHeadingLBL = new JLabel("Disability Information");
        disHeadingLBL.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 20));
        disHeadingLBL.setForeground(Color.blue);
        
        cntSubHeadingLBL = new JLabel("   Please enter contract information");
        cntSubHeadingLBL.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 14));
        cntSubHeadingLBL.setForeground(Color.black);
        
        rsdSubHeadingLBL = new JLabel("   Please select whether you want to apply for residence");
        rsdSubHeadingLBL.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 14));
        rsdSubHeadingLBL.setForeground(Color.black);
        
        disSubHeadingLBL = new JLabel("   Please indicate whether you have any disability");
        disSubHeadingLBL.setFont(new Font("Calibri Light (Headings)", Font.BOLD, 14));
        disSubHeadingLBL.setForeground(Color.black);

        question1 = new JLabel("    Do you have a South Africa Telephone Number?");
        question2 = new JLabel("    Work Telephone Number");
        question2.setHorizontalTextPosition(PROPERTIES);
        
        question3 = new JLabel("    Home Telephone Number");
        question4 = new JLabel("    Email");
        question5 = new JLabel("    Verify Email");
       
        residenceQuestion = new JLabel("    Do you want to apply for a residence?");
        
        disCheckBox = new JCheckBox("   Do you have any disability or  impairment?"); 
        
        nextBTN = new JButton("Next");
        nextBTN.addActionListener(new Next());
        
        backBTN = new JButton("Back");
        backBTN.addActionListener(new Back());
       
        String userChoiceAnswr [] = {"----Please select----" , "Yes" , "No"};
        
        optionMenuCBB1 = new JComboBox(userChoiceAnswr);
        optionMenuCBB1.setSelectedItem(userChoiceAnswr[0]);
      
        optionMenuCBB2 = new JComboBox(userChoiceAnswr);
        optionMenuCBB2.setSelectedItem(userChoiceAnswr[0]);
        
        txtQuestion2 = new JTextField(10);
        txtQuestion3 = new JTextField(10);
        txtQuestion4 = new JTextField(20);
        txtQuestion5 = new JTextField(20);
            
        headingPNL1.add(cntHeadingLBL);
        subHeadingPNL1.add(cntSubHeadingLBL);
       
        headingPNL2.add(rsdHeadingLBL);
        subHeadingPNL2.add(rsdSubHeadingLBL);
        
        headingPNL3.add(disHeadingLBL);
        subHeadingPNL3.add(disSubHeadingLBL);
        
        mainHeadingPNL1.add(headingPNL1);
        mainHeadingPNL1.add(subHeadingPNL1);
        
        mainHeadingPNL2.add(headingPNL2);
        mainHeadingPNL2.add(subHeadingPNL2);
        
        mainHeadingPNL3.add(headingPNL3);
        mainHeadingPNL3.add(subHeadingPNL3);
       
        buttPNL.add(backBTN);
        buttPNL.add(nextBTN);
        
        checkBoxPNL.add(disCheckBox);
        checkBoxPNL.add(buttPNL);
        
        gridTablePNL1.add(question1 );
        gridTablePNL1.add(optionMenuCBB1);
        gridTablePNL1.add(question2 );
        gridTablePNL1.add(txtQuestion2);
        gridTablePNL1.add(question3);
        gridTablePNL1.add(txtQuestion3);
        gridTablePNL1.add(question4);
        gridTablePNL1.add(txtQuestion4);
        gridTablePNL1.add(question5);
        gridTablePNL1.add(txtQuestion5);
        
        gridTablePNL2.add(residenceQuestion);
        gridTablePNL2.add(optionMenuCBB2);
        
        gridButtonPNL.add(checkBoxPNL);
        
        frstContactInforContianerPNL.add(mainHeadingPNL1 , BorderLayout.NORTH);
        frstContactInforContianerPNL.add(gridTablePNL1 , BorderLayout.SOUTH);
        
        secondContactInforContianerPNL.add(mainHeadingPNL2 , BorderLayout.NORTH);
        secondContactInforContianerPNL.add(gridTablePNL2 , BorderLayout.SOUTH);
       
        thirdContactInforContianerPNL.add(mainHeadingPNL3 , BorderLayout.NORTH);
        thirdContactInforContianerPNL.add( gridButtonPNL, BorderLayout.SOUTH);
      
        mainPNL.add(frstContactInforContianerPNL );
        mainPNL.add(secondContactInforContianerPNL );
        mainPNL.add(thirdContactInforContianerPNL );
        
        add(mainPNL);
      
        setVisible(true);
    }

    private static class Next extends JFrame implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            setTitle("Next page");
            setSize(500, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            setVisible(true);
        }
    }

    private static class Back extends JFrame implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            setTitle("Back page");
            setSize(500, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            setVisible(true);
        }  
        
    }
}
