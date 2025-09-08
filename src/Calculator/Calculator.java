package calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Calculator {
    public Calculator(){
        JTextField jTextField = new JTextField();

        JButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
                buttonNine, buttonPlus, buttonMinus, buttonTimes, buttonDivide, buttonEquals, buttonDot;
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
        buttonDot = new JButton(".");

        JPanel jPanel0 = new JPanel();
        jPanel0.setLayout(new GridLayout(1,4));
        jPanel0.add(buttonPlus);
        jPanel0.add(buttonMinus);
        jPanel0.add(buttonTimes);
        jPanel0.add(buttonDivide);
        jPanel0.add(buttonDot);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(buttonSeven);
        jPanel1.add(buttonEight);
        jPanel1.add(buttonNine);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(buttonFour);
        jPanel2.add(buttonFive);
        jPanel2.add(buttonSix);


        JPanel jPanel3 = new JPanel();
        jPanel3.add(buttonOne);
        jPanel3.add(buttonTwo);
        jPanel3.add(buttonThree);

        JPanel panel = new JPanel();
        panel.add(jPanel0);
        panel.add(jPanel1);
        panel.add(jPanel2);
        panel.add(jPanel3);


        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(400, 400);
        jFrame.add(BorderLayout.PAGE_START, jTextField);
        jFrame.add(BorderLayout.CENTER, panel);
        jFrame.add(BorderLayout.EAST, buttonEquals);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    public static void main (String[] args){
        new Calculator();

        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;

        System.out.print("Enter first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        number2 = scanner.nextDouble();

        switch (operator){
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("invalid operator entered!");
                break;
        }
        scanner.close();
    }
}