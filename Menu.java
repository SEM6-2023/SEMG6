package com.napier.sem;

import java.util.Scanner;

public class App
{
    public static void main(String[] args){

        menuMethod();
    }

        static void menuMethod() {
        // This will display welcome screen to link to the rest of the program, Name needs to be updated
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                      WORLD POPULATION SEARCH");
        System.out.println("-------------------------------------------------------------------");

        //Shows options the user can select to use the various features
        System.out.println("Please type the assigned number to select the feature you wish to use.");

        System.out.println("1. Sort Countries by Largest to Smallest Population");
        System.out.println("2. Sort Cities by Largest to Smallest Population");
        System.out.println("3. Sort Capital Cities by Largest to Smallest Population");
        System.out.println("4. Find the Population of People living in Cities VS Out of Cities");
        System.out.println("5. Find the Top X Populated Countries");
        System.out.println("6. Find the Top X Populated Cities");
        System.out.println("7. Find the Top X Populated Capital Cities");
        System.out.println("If you wish to exit the program, please type 999");


        Scanner userinput = new Scanner(System.in);
        int choice = 0;

        try {

            choice=userinput.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                      Sort Countries by Largest to Smallest Population");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                      Sort Cities by Largest to Smallest Population");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 3 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                     Sort Capital Cities by Largest to Smallest Population");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 4 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                      Find the Population of People living in Cities VS Out of Cities");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 5 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                      Find the Top X Populated Countries");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 6 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                      Find the Top X Populated Cities");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 7 -> {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                      Find the Top X Populated Capital Cities");
                    System.out.println("-------------------------------------------------------------------");
                }
                case 999 -> {
                    System.out.println("You have chosen to exit the program");
                    System.out.println("Thank you for using the World Population System!");
                    System.exit(25);
                }
                default -> {
                    System.out.println("An error has occured, please make sure you are entering a valid input!");
                    menuMethod();
                }
            }
        }
        catch (Exception e) {
            System.out.println("An error has occured, please make sure you are entering a valid input!");
            menuMethod();

        }

    }
    }
