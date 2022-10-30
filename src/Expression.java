/**
 *
 */

public abstract class Expression {
    protected double num;

    public double getNum() {
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