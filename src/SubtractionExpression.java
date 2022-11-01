public class SubtractionExpression extends CompoundExpression{


    public SubtractionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    public double calculate(){
        return this.first.calculate() - this.second.calculate();
    }

    @Override
    public String toString() {
        return this.first.calculate() +" - " + this.second.calculate();
    }
}