/**
 * GuessNumber class is responsible for each game's logic, calculations and attributes.
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class Expression {
    // protected String expression;
    protected String num;

    public String getNum() {
        return num;
    }

    public abstract double calculate();

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object other) {
        if ((other instanceof Expression)) { // Checks whether the parameter inserted is Fish as needed.
            Expression b = (Expression) other; // Casting from Object to Fish.
            return this.calculate() == b.calculate();
        }
        return false;
    }
}