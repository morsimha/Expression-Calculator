public class SubtractionExpression extends CompoundExpression{
    public SubtractionExpression(Expression num1, Expression num2) {
        super(num1, num2);
    }

    public double calculate(){
        return (Double.parseDouble(num) - Double.parseDouble(secondNum));

    }

    @Override
    public String toString() {
        return this.num +" - " + this.secondNum;
        // this.setNum(String.format("%04d", rand.nextInt( 9999))); //4 digits format.
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof SubtractionExpression)) // Checks whether the parameter inserted is Fish as needed.
            return false;
        SubtractionExpression b = (SubtractionExpression)other; // Casting from Object to Fish.
        return super.equals(b);
    }
}