package calculator;

import javax.swing.*;
import java.awt.*;

public class CalcView {
    public CalcView(){
        JButton buttonDot1, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
                buttonNine, buttonPlus, buttonMinus, buttonTimes, buttonDivide, buttonEquals, buttonDot2, buttonDot3;
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
        buttonDot3 = new JButton(".");

        JTextField jTextField = new JTextField();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4,4, 4, 4));
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
        jPanel.add(buttonDot3);


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
