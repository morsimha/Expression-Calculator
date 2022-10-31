public class AtomicExpression extends Expression{

    public AtomicExpression(double num){
        this.num = num;
    }

    //calculate method will return the double attribute (num) of the expression
    public double calculate(){
        return this.num;
    }

    //toString method will return num as a String.
    @Override
    public String toString() {
        return this.num + ""; //In order to return String adding ""
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
