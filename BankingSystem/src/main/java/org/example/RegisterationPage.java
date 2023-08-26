package org.example;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RegisterationPage {
    private boolean flag = true;
       public int acn ;
    public HashMap<Integer, Object> register() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        while (flag) {

            try {
                HashMap<Integer, Object> hm = new HashMap<>();


                System.out.println("Welcome to Bank of Canada Register Page");
                System.out.println("Enter the name: ");
                String n = sc.nextLine();
                System.out.println("Enter Date of birth (dd-mm-yy): ");
                String dof = sc.nextLine();
                System.out.println("Enter the SIN number: ");
                long sn = sc.nextLong();

                // Consume the remaining newline character
                sc.nextLine();

                // Account number
                int acn = r.nextInt(900000);

                hm.put(1, n);
                hm.put(2, dof);
                hm.put(3, sn);
                hm.put(4, acn);

                return hm;
            } catch (Exception e) {
                System.out.println("Incorrect input " + e);
                flag = false;
            }
        }
        return null;
    }
}
