public class AtomicExpression extends Expression{
    //protected Expression expression;

    public AtomicExpression(double num){
        this.num = num;
    }

    public double calculate(){
        return num;
    }

    @Override
    public String toString() {
        return num + "";
    }

//    @Override
//    public boolean equals(Object other) {
//        if((other instanceof Expression)) { // Checks whether the parameter inserted is Fish as needed.
//            Expression b = (AtomicExpression) other; // Casting from Object to Fish.
//            return this.calculate() == b.calculate();
//        }
//        return false;
//    }
}
