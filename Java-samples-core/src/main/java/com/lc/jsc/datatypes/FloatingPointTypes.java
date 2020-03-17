package com.lc.jsc.datatypes;

public class FloatingPointTypes {
    
    /**
     * 4bytes Approximately ±3.40282347E+38F (6-7 significant decimal digits) default 0.0f
     */
    float fooFloat = 234.5f; float barFloat = -123.45f;

    /**
     * 8bytes Approximately ±1.79769319486231570E+308 (15 significant decimal digits) default 0.0d
     */
    double fooDouble = 1.23d; double barDouble = -4.56d;


    public void demo(){
        Double x = 0.0d;

        if (x == Double.NaN) {
            System.out.println("Never print this line, because is never true");
        }

        if (!Double.isNaN(x)){
            System.out.println("check whether x is 'not a number'");
        }
    }

}
