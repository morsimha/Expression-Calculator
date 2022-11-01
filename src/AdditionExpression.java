public class AdditionExpression extends CompoundExpression {

    //This class inheriting from CompoundExpression and adds a proper calculate and toString methods.
    public AdditionExpression(Expression exp1, Expression exp2) {
         super(exp1, exp2); //Inheriting the 2 Expressions from CompoundExpression.
    }

    /*  calculate returns a single double result , that sums the whole calculation of each Exp attributes.
        In this implementation we operate addition between the 2 Expressions. */
    public double calculate(){
        return this.firstExp.calculate() + this.secondExp.calculate();
    }

    /*  The full current Expression calculation, contains all the Atomic and compound Expressions from the beginning.
        A '+' char will be added to add addition to the string.  */
    @Override
    public String toString() {
        return this.firstExp +" + " + this.secondExp ;
    }

}
