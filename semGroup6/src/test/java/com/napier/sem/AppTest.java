package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void displayCountryTestNull()
    {
        app.displayCountry(null);
    }

    @Test
    void displayCountryTestEmpty()
    {
        Country cnyy = new Country();
        app.displayCountry(cnyy);
    }



    @Test
    void displayCountry()
    {
        Country cny = new Country();
        cny.Code = "CHN";
        cny.Name = "China";
        cny.Continent = "Asia";
        cny.Region = "Eastern Asia";
        cny.Population = 1277558000;
        cny.Capital = 1891;

        app.displayCountry(cny);
    }


}