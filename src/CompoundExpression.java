public abstract class CompoundExpression extends Expression {
//    protected Expression exp1;
    protected double secondNum;


    public CompoundExpression(Expression exp1, Expression exp2) {
        super();
        this.num = exp1.num; //TODO: can use getters here.
        this.secondNum = exp2.num;
    }

    @Override
    public abstract String toString();

//    @Override
//    public boolean equals(Object other) {
//        if((other instanceof Expression)) { // Checks if the parameter inserted is Fish as needed.
//            Expression b = (Expression) other; // Casting from Object to Fish.
//            return this.calculate() == b.calculate();
//        }
//        return false;
//    }

}

