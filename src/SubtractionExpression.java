public class SubtractionExpression extends CompoundExpression{


    public SubtractionExpression(Expression num1, Expression num2) {
        super(num1, num2);
    }

    public double calculate(){
        return num - secondNum;
    }

    @Override
    public String toString() {
        return this.num +" - " + this.secondNum;
    }
}