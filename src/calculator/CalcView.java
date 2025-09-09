package calculator;

import javax.swing.*;
import java.awt.*;

public class CalcView {
    public final CalcCtrl ctrl;

    public CalcView(){
        ctrl = new CalcCtrl();
        JButton buttonDot1, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
                buttonNine, buttonPlus, buttonMinus, buttonTimes, buttonDivide, buttonEquals, buttonDot2, buttonClear;
        buttonDot1 = new JButton(".");
        buttonZero = new JButton("0");
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonTimes = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonDot2 = new JButton(".");
        buttonClear = new JButton("Clear");

        JTextField jTextField = new JTextField();

        buttonDot1.addActionListener(e -> jTextField.setText("."));

        buttonZero.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("0");
                ctrl.setN1Zero();
            } else{
                jTextField.setText("0");
                ctrl.setN2Zero();
            }
        });

        buttonClear.addActionListener(e -> {
            jTextField.setText("");
            ctrl.clearNumbers();
        });

        buttonDot2.addActionListener(e -> jTextField.setText("."));

        buttonOne.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("1");
                ctrl.setN1One();
            } else{
                jTextField.setText("1");
                ctrl.setN2One();
            }
        });

        buttonTwo.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("2");
                ctrl.setN1Two();
            } else{
                jTextField.setText("2");
                ctrl.setN2Two();
            }
        });

        buttonThree.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("3");
                ctrl.setN1Three();
            } else{
                jTextField.setText("3");
                ctrl.setN2Three();
            }
        });

        buttonFour.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("4");
                ctrl.setN1Four();
            } else{
                jTextField.setText("4");
                ctrl.setN2Four();
            }
        });

        buttonFive.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("5");
                ctrl.setN1Five();
            } else{
                jTextField.setText("5");
                ctrl.setN2Five();
            }
        });

        buttonSix.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("6");
                ctrl.setN1Six();
            } else{
                jTextField.setText("6");
                ctrl.setN2Six();
            }
        });

        buttonSeven.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("7");
                ctrl.setN1Seven();
            } else{
                jTextField.setText("7");
                ctrl.setN2Seven();
            }
        });

        buttonEight.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("8");
                ctrl.setN1Eight();
            } else{
                jTextField.setText("8");
                ctrl.setN2Eight();
            }
        });

        buttonNine.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("9");
                ctrl.setN1Nine();
            } else{
                jTextField.setText("9");
                ctrl.setN2Nine();
            }
        });

        buttonPlus.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("Enter a number first!");
            } else{
                jTextField.setText("+");
                ctrl.setPlus();
            }
        });

        buttonMinus.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("Enter a number first!");
            } else{
                jTextField.setText("-");
                ctrl.setMinus();
            }
        });

        buttonTimes.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("Enter a number first!");
            } else{
                jTextField.setText("*");
                ctrl.setTimes();
            }
        });

        buttonDivide.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("Enter a number first!");
            } else{
                jTextField.setText("/");
                ctrl.setDivide();
            }
        });

        buttonEquals.addActionListener(e -> {
            String text = jTextField.getText();
            if (text.isEmpty()){
                jTextField.setText("Enter a number first!");
            } else {
                jTextField.setText(ctrl.getResult());
            }
        });

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4,4, 10, 10));
        jPanel.add(buttonPlus);
        jPanel.add(buttonMinus);
        jPanel.add(buttonTimes);
        jPanel.add(buttonDivide);
        jPanel.add(buttonSeven);
        jPanel.add(buttonEight);
        jPanel.add(buttonNine);
        jPanel.add(buttonDot1);
        jPanel.add(buttonFour);
        jPanel.add(buttonFive);
        jPanel.add(buttonSix);
        jPanel.add(buttonDot2);
        jPanel.add(buttonOne);
        jPanel.add(buttonTwo);
        jPanel.add(buttonThree);
        jPanel.add(buttonClear);


        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(400, 400);
        jFrame.add(BorderLayout.PAGE_START, jTextField);
        jFrame.add(BorderLayout.CENTER, jPanel);
        jFrame.add(BorderLayout.EAST, buttonEquals);
        jFrame.add(BorderLayout.SOUTH, buttonZero);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

}
