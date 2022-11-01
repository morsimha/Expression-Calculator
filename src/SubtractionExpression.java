public class SubtractionExpression extends CompoundExpression{

    //SubtractionExpression comments are similar to AdditionExpression beside the actual math operation.
    public SubtractionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    //In this implementation we operate subtraction between the 2 Expressions.
    public double calculate(){
        return this.firstExp.calculate() - this.secondExp.calculate();
    }

    // A '-' char will be added to add subtraction to the string.
    @Override
    public String toString() {
        return this.firstExp +" - " + this.secondExp;
    }
}