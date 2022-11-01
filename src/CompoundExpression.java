public abstract class CompoundExpression extends Expression {
    // CompoundExpression contains 2 numbers, so Adding another double attribute.
    // protected double secondNum;
    protected Expression first;
    protected Expression second;



    //In this constructor, we get 2 Expressions (each contains a double attribute),
    //and we
    public CompoundExpression(Expression exp1, Expression exp2) {
        super(); //inheriting the first num declaration from Expression.
//        this.num = exp1.num; //
//        this.secondNum = exp2.num;
        this.first = exp1;
        this.second = exp2;
    }

    @Override
    public abstract String toString(); //Will be overridden by Addition\Subtraction Expression class.

}

