public abstract class CompoundExpression extends Expression {
    // CompoundExpression contains 2 Expressions as attributes.
    protected Expression firstExp;
    protected Expression secondExp;

    /*A contractor method that gets 2 Expressions and set them as attributes.
      A given Expressions may be either an AtomicExp (1 double), or an Expressions with 2 or more doubles in it. */
    public CompoundExpression(Expression exp1, Expression exp2) {
        this.firstExp = exp1;
        this.secondExp = exp2;
    }

    @Override
    public abstract String toString(); //Will be overridden by Addition\Subtraction Expression class.

}

