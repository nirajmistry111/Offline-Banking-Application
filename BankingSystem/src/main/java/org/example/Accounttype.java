package org.example;
import java.util.*;


public class Accounttype  extends Registeredpage{
    HashMap<Integer, Object> mm = registered();
    Scanner sc = new Scanner(System.in);
    boolean clag = true;
    public int d ;
     double initialdeposite = 0;
    public void acntype() throws InvalidAcountOrPassword {



        System.out.println("*********************Login*********************");
        System.out.println("Enter the account number : ");
        int acn2 = sc.nextInt();
        System.out.println("Enter the account Password only in digit : ");
        int pn2 = sc.nextInt();

        if(acn2 == acn || pn2 == pn  )
        {
            System.out.println("You have successfully  Login ");

            System.out.println("Select 1 to create saving account ");
            System.out.println("Select 2 to create checking account ");
            int act = sc.nextInt();

                    while (clag)
                    {
                        try
                        {
                            if (act == 1) {
                                System.out.println("You selected saving account ");
                                System.out.println(" Select 1 for deposit amount ");
                                System.out.println(" Select 2 for withdraw amount ");
                                System.out.println(" Select 3 for  checking balance ");
                                d = sc.nextInt();

                                if (d == 1) {
                                    depoiste();
                                } else if (d == 2) {
                                    withdraw();
                                } else if (d == 3) {
                                    balance();
                                }else{
                                    System.out.println("Kindly choose option from 1 , 2 or 3 ");
                                }


                            } else if (act == 2) {
                                System.out.println("You selected checking account ");
                                System.out.println(" Select 1 for deposit amount ");
                                System.out.println(" Select 2 for withdraw amount ");
                                System.out.println(" Select 3 for  checking balance ");
                                d = sc.nextInt();

                                if (d == 1) {
                                    depoiste();
                                } else if (d == 2) {
                                    withdraw();
                                } else if (d == 3) {
                                    balance();
                                }else{
                                    System.out.println("Kindly choose option from 1 , 2 or 3 ");
                                }
                            }
                            else {

                                System.out.println("Account number or password you entered are incorrect ");

                            }
                        }catch (Exception e)
                        {
                            System.out.println("Incorrect input " + e);
                            clag = false;
                        }
                    }
        }else{
            throw  new InvalidAcountOrPassword("Account number or password you entered is incorrect");

        }

    }



    public Object depoiste() throws ExceedLimit {
        System.out.println("Enter amount to deposit : ");
        double depo_to_bank = sc.nextDouble();
        if(depo_to_bank > 5000){
            throw new ExceedLimit("you have exceed limit , limit is 5000");
        }
        initialdeposite = initialdeposite + depo_to_bank;

        return mm.put(6,initialdeposite);

    }

    public Object withdraw() {
        System.out.println("Enter amount to withdraw : ");
        double wido_to_bank = sc.nextDouble();
        initialdeposite = initialdeposite - wido_to_bank;
       return mm.put(7,initialdeposite);

    }

    public void balance() {

        System.out.println(initialdeposite);
    }


}
