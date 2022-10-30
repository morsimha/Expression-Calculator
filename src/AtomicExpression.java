public class AtomicExpression extends Expression{
    //protected Expression expression;

    public AtomicExpression(double num){
        super();
        this.num = num +"";
    }

    public double calculate(){
        return Double.parseDouble(num);
    }

    @Override
    public String toString() {
        return this.num;
    }

    @Override
    public boolean equals(Object other) {
        if((other instanceof AtomicExpression)) { // Checks whether the parameter inserted is Fish as needed.
            AtomicExpression b = (AtomicExpression) other; // Casting from Object to Fish.
            return this.calculate() == b.calculate();
        }
        return false;
    }
}
