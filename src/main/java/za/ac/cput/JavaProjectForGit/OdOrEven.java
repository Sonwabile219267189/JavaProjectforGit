package za.ac.cput.JavaProjectForGit;
//Autohor Sn219104891
//Funtions determine if int is odd or even

import java.util.Scanner;

public class OdOrEven {

    public String check(int val){
        String ans="";
        if(val%2==0){
            ans="Even";

        }
        else {
            ans="not even";

        }

        return ans;
    }

    //Author 217299911
    //Function determines if number entered is lower or higher than set number

    public String compare(int num){
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter a number:");
        num = reader.nextInt();

        if(num>=10){
           return "Number higher than 10";
        }

        else{
            return "Number lower than 10";
        }


    }

}
