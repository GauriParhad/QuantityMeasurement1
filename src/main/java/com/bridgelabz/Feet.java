package com.bridgelabz;

public class Feet {
    private final double value;

    public Feet(double value) {
        this.value=value;
    }

    boolean lengthcomparison(double ft, double in) {
        ft = 12 * ft;
        return ft == in;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o ==null||getClass()!=o.getClass())
            return false;
        Feet feet= (Feet) o;
        return Double.compare(feet.value, value)==0;

    }
}
