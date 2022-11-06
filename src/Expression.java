/**
 * Maman 12, question 1.
 * Mor simha, 206029993.
 */

public abstract class Expression {
    // Any kind of expression must contain at least one number.
    // for that reason, num will be inherited to all classes from here

    //Abstract method must be overridden
    protected abstract double calculate();

    @Override
    public abstract String toString();

    //Equals method is the same for all kind of Expressions.
    @Override
    public boolean equals(Object other) {
        if ((other instanceof Expression)) { // Checks that the argument is indeed any kind of Expression
            Expression b = (Expression) other; //Casting in order to compare
            return this.calculate() == b.calculate();
        }
        return false;
    }
}