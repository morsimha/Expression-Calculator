public abstract class CompoundExpression extends Expression {
//    protected Expression exp1;
    protected String secondNum;


    public CompoundExpression(Expression exp1, Expression exp2) {
        super();
        this.num = exp1.num;
        this.secondNum = exp2.num;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object other) {
        if((other instanceof CompoundExpression)) { // Checks whether the parameter inserted is Fish as needed.
            CompoundExpression b = (CompoundExpression) other; // Casting from Object to Fish.
            return this.calculate() == b.calculate();
        }
        return false;
    }

}

