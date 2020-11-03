package edu.eci.arep.leibnizserie.components;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class LeibnizSerie {
    public static BigDecimal calculatePi(BigInteger numberOfDecimals){
        BigDecimal bg = new BigDecimal("1");
        boolean flag = true;

        for(int i = 3;i<numberOfDecimals.intValue();i+=2){
            BigDecimal tmp = new BigDecimal("1").divide(new BigDecimal(Integer.toString(i)), MathContext.DECIMAL128);
            if(flag){
                bg = bg.subtract(tmp);
            } else {
                bg = bg.add(tmp);
            }
            flag = !flag;

        }
        bg = bg.multiply(new BigDecimal("4"));
        return bg;
    }
}
