public class Calculator {

    //======instance fields======

    //======constructor======

    public Calculator(){

    }//end Calculator

    //======methods======

    public double calculate(double num1, double num2, String sign){

        if(sign.equals("+")){

            return num1 + num2;

        }//end if
        else if(sign.equals("*")){

            return num1 * num2;

        }//end else if
        else if(sign.equals("-")){

            return num1 - num2;

        }//end else if
        else if(sign.equals("/")){

            return num1 / num2;

        }//end else if
        else{

            return 0;

        }

    }//end calculate

}//end class
