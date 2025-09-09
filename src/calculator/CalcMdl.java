package calculator;

public class CalcMdl {
    double numberOne;
    double numberTwo;
    double result;
    char operator;

    public void setN1Zero(){
        numberOne = 0;
    }

    public void setN2Zero(){
        numberTwo = 0;
    }

    public void setN1One(){
        numberOne = 1;
    }

    public void setN2One(){
        numberTwo = 1;
    }

    public void setN1Two(){
        numberOne = 2;
    }

    public void setN2Two(){
        numberTwo = 2;
    }

    public void setN1Three(){
        numberOne = 3;
    }

    public void setN2Three(){
        numberTwo = 3;
    }

    public void setN1Four(){
        numberOne = 4;
    }

    public void setN2Four(){
        numberTwo = 4;
    }

    public void setN1Five(){
        numberOne = 5;
    }

    public void setN2Five(){
        numberTwo = 5;
    }

    public void setN1Six(){
        numberOne = 6;
    }

    public void setN2Six(){
        numberTwo = 6;
    }

    public void setN1Seven(){
        numberOne = 7;
    }

    public void setN2Seven(){
        numberTwo = 7;
    }

    public void setN1Eight(){
        numberOne = 8;
    }

    public void setN2Eight(){
        numberTwo = 8;
    }

    public void setN1Nine(){
        numberOne = 9;
    }

    public void setN2Nine(){
        numberTwo = 9;
    }

    public void clearNumbers(){
        numberOne = 0;
        numberTwo = 0;
    }

    public void setPlus(){
        operator = '+';
    }

    public void setMinus(){
        operator = '-';
    }

    public void setTimes(){
        operator = '*';
    }

    public void setDivide(){
        operator = '/';
    }

    public String getResult(){
       switch (operator){
           case '+':
               result = numberOne + numberTwo;
               break;

           case '-':
               result = numberOne - numberTwo;
               break;

           case '*':
               result = numberOne * numberTwo;
               break;

           case '/':
               result = numberOne / numberTwo;
               break;
       }
       return String.valueOf(result);
    }

}