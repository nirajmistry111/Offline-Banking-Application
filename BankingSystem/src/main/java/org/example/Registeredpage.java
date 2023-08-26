package org.example;

import java.util.HashMap;
import java.util.*;
public class Registeredpage extends RegisterationPage
{
    public int pn;

    private boolean glag =  true;
    public HashMap<Integer, Object> registered()

    {
        HashMap<Integer, Object> km = register();
        while (glag)
        {
            try {


                Scanner sc = new Scanner(System.in);
                // km reference of register


                System.out.println("Name is: " + km.get(1));
                System.out.println("dob is: " + km.get(2));
                System.out.println("sin is: " + km.get(3));
                System.out.println("Your account number generated is : " + km.get(4));

                System.out.println("Enter the password only in digit : ");
                int pn = sc.nextInt();
                System.out.println("Please confirm the password only in digit: ");
                int an = sc.nextInt();

                if (pn == an) {

                    km.put(5, pn);
                    System.out.println("Your account Password is : " + km.get(5));


                    System.out.println("Your account is successfully created ");
                    System.out.println("---------------------------------------------------------------------------------------");


                }
                else {
                    System.out.println(km.get(1) + "  Your password is incorrect ");
                }
                return km;
            }catch (Exception e ){
                System.out.println("Invalid input " + e );
                glag = false;
            }

        }
        return null;
    }

}


