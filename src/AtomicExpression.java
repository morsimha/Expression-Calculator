public class AtomicExpression extends Expression{
    protected double num;

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

}
