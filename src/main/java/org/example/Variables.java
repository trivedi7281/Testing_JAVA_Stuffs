package org.example;

public class Variables {
    protected static int j = 20; //instance variable
    public static void main(String[] args) {


        //type variableName = variable

        int myNumber = 10;
        int secondNum = 20;
        char ch = 'A';
        char ch2 = 'B';

        String str1 = "RCV";
        System.out.println(str1+ " "+ myNumber);
        System.out.println(secondNum+myNumber);
        System.out.println(ch+" "+ch2);
        System.out.println(j);

        // - assignment operator

        //How we use if else conditions
        //() inside this everytime expressions

        //values(expressions) used to make a conditions
        int ii = 0;
        int ij = -1;

        if (ii<ij){
            System.out.println("ii is less then ij");
        }else if(ii>ij){
            System.out.println("ii is greater then ij");
        }else if(ii == ij){
            System.out.println("ii is equals then ij");
        }
        else{
            System.out.println("no one");
        }

        //Conditional Operators
        // Ternary Operators

        // AND, OR,  If-then-else statement

        //variable = (condition) ? TrueExpression = true : FalseExpression;

        //checkbox if it is checked then return true , if it is un-checked then it return false;

        int ik = 10;
        int il = 20;
        if (ik>il){
            System.out.println("ik>il");
        }else{
            System.out.println("ik<il");
        }

        String result = (ik>il) ? "ik>il" : "ik<il";
        System.out.println(result);

        int result1 = (ik>il) ? 1 : 2;
        System.out.println(result1);

        boolean result2 = (ik>il) ? true : false;
        System.out.println(result2);

        //Switch statement
        /*
        switch(experssion){
        cases 1:
        statment
        case 2:
        statement
        }
         */
        int day = 3;
        String web = "firefox";
        switch (web)
        {
            case "chrome":
                System.out.println("Monday");
                break;
            case "firefox":
                System.out.println("Tuesday");
                break;
            case "IE":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("None of the day is from this week");
        }




    }








    public void MJMethod(){
        int i = 20;
        System.out.println(i);
    }


}
