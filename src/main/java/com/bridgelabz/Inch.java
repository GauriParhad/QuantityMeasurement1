package com.bridgelabz;

public class Inch {
    private final double value;

    public Inch(double value) {
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
        if(o == null||getClass()!=o.getClass())
            return false;
        Inch inch= (Inch) o;
        return Double.compare(inch.value, value)==0;

    }
}
