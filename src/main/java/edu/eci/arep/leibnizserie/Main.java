package edu.eci.arep.leibnizserie;

import edu.eci.arep.leibnizserie.components.LeibnizSerie;

import java.math.BigInteger;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(4567);
        get("/pi",(req,res)->{
            try {
                String numbersOfDecimals = req.queryParams("numbers");
                System.out.println(numbersOfDecimals);
                return LeibnizSerie.calculatePi(new BigInteger(numbersOfDecimals));
            } catch (Exception e){
                e.printStackTrace();
                return "asdasdad";
            }
        });
    }
}
