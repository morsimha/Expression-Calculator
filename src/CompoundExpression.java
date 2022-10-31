public abstract class CompoundExpression extends Expression {
    //CompoundExpression contains 2 numbers, so Adding another double attribute.
    protected double secondNum;



    //In this constructor, we get 2 Expressions (each contains a double attribute),
    //and we
    public CompoundExpression(Expression exp1, Expression exp2) {
        super(); //inheriting the first num declaration from Expression.
        this.num = exp1.num; //
        this.secondNum = exp2.num;
    }

    @Override
    public abstract String toString(); //Will be overridden by Addition\Subtraction Expression class.

//    @Override
//    public boolean equals(Object other) {
//        if((other instanceof Expression)) { // Checks if the parameter inserted is Fish as needed.
//            Expression b = (Expression) other; // Casting from Object to Fish.
//            return this.calculate() == b.calculate();
//        }
//        return false
//    }

}

