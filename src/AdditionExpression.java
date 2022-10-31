public class AdditionExpression extends CompoundExpression {


    public AdditionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2); //inheriting 2 expression from
    }

    public double calculate(){
        return num + secondNum;
    }

    @Override
    public String toString() {
        return this.num +" + " + this.secondNum;
        // this.setNum(String.format("%04d", rand.nextInt( 9999))); //4 digits format.
    }

  //  @Override
//    public boolean equals(Object other) {
//        if((other instanceof AdditionExpression)) // Checks whether the parameter inserted is Fish as needed.
//            return this.calculate() == ((AdditionExpression) other).calculate();
//        CompoundExpression b = (CompoundExpression)other; // Casting from Object to Fish.
//        return super.equals(b);
//    }
}
