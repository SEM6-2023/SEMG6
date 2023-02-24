package com.napier.sem;

public class Main {

        public static void main(String[] args) {
                // Create new Application
                App a = new App();
                // Connect to database
                a.connect("localhost: 33060");
                // Get Employee
                Country cny = a.getCountry();
                // Display results
                a.displayCountry(cny, "country.md");
                // Disconnect from database
                a.disconnect();
        }
}