public class AdditionExpression extends CompoundExpression {


    public AdditionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2); //inheriting 2 expression from
    }

    public double calculate(){
        return this.first.calculate() + this.second.calculate();
    }

    @Override
    public String toString() {
        return this.first.calculate() +" + " + this.second.calculate() ;
    }

}
