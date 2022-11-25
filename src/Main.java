/**
 * Maman 12, question 1.
 * Mor Simha, 206029993.
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Expression> expressions = new ArrayList<>();

        //Different object with random values
        Expression a = new AtomicExpression(RandomizeNumber());
        Expression b = new AtomicExpression(RandomizeNumber());
        Expression c = new AtomicExpression(RandomizeNumber());
        Expression d = new AtomicExpression(RandomizeNumber());
        Expression e = new AtomicExpression(RandomizeNumber());
        AtomicExpression f = new AtomicExpression(RandomizeNumber());
        AtomicExpression g = new AtomicExpression(RandomizeNumber());
        AtomicExpression h = new AtomicExpression(RandomizeNumber());
        AdditionExpression num1 = new AdditionExpression(a,b);
        SubtractionExpression num2 = new SubtractionExpression(c,d);
        AdditionExpression num3 = new AdditionExpression(e,f);
        SubtractionExpression num4 = new SubtractionExpression(g,h);
        Expression num5 = new AtomicExpression(RandomizeNumber());
        Expression num6 = new AtomicExpression(RandomizeNumber());
        Expression num7 = new AdditionExpression(e,b);
        Expression num8 = new AdditionExpression(num1,num2);
        Expression num9 = new SubtractionExpression(num3,num4);
        Expression num10 = new SubtractionExpression(num5,num6);
        CompoundExpression num11 = new SubtractionExpression(num7,num8);
        CompoundExpression num12 = new SubtractionExpression(num9,num10);
        CompoundExpression num13 = new AdditionExpression(num11,num12);
        CompoundExpression num14 = new AdditionExpression(a,b);
        CompoundExpression num15 = new SubtractionExpression(c,d);
        CompoundExpression num16 = new SubtractionExpression(e,f);
        Expression num17 = new AtomicExpression(RandomizeNumber());
        Expression num18 = new AtomicExpression(RandomizeNumber());
        Expression num19 = new AdditionExpression(b,d);
        Expression num20 = new AdditionExpression(a,e);
        Expression num21 = new SubtractionExpression(num13,num14);
        Expression num22 = new SubtractionExpression(num15,num16);
        CompoundExpression num23 = new SubtractionExpression(num17,num18);
        CompoundExpression num24 = new SubtractionExpression(num19,num20);
        CompoundExpression num25 = new AdditionExpression(num21,num22);
        CompoundExpression num26 = new AdditionExpression(num23,num24);
        CompoundExpression num27 = new SubtractionExpression(num25,num26);
        CompoundExpression num28 = new SubtractionExpression(num1, num27);
        AdditionExpression num29 = new AdditionExpression(num2, num27);
        SubtractionExpression num30 = new SubtractionExpression(num3,num26);

        //Adding the object to arraylist
        expressions.add(num1);
        expressions.add(num2);
        expressions.add(num3);
        expressions.add(num4);
        expressions.add(num5);
        expressions.add(num6);
        expressions.add(num7);
        expressions.add(num8);
        expressions.add(num9);
        expressions.add(num10);
        expressions.add(num11);
        expressions.add(num12);
        expressions.add(num13);
        expressions.add(num14);
        expressions.add(num15);
        expressions.add(num16);
        expressions.add(num17);
        expressions.add(num18);
        expressions.add(num19);
        expressions.add(num20);
        expressions.add(num21);
        expressions.add(num22);
        expressions.add(num23);
        expressions.add(num24);
        expressions.add(num25);
        expressions.add(num26);
        expressions.add(num27);
        expressions.add(num28);
        expressions.add(num29);
        expressions.add(num30);

        //Print the expressions
        System.out.println("the expressions are:");

        for (int i = 0 ; i < expressions.size() ; i ++)
        {
            System.out.println("Expression" + i + " = " +  expressions.get(i).toString()  + " = " + (expressions.get(i).calculate()));
        }

        //Print the expressions with the equal values
        System.out.println("\nthe equalities are:");

        for (int i = 0 ; i < expressions.size() ; i ++)
        {
            for (int j = 0 ; j < expressions.size() ; j ++)
            {
                if (i != j && expressions.get(i).equals(expressions.get(j)))
                    System.out.println(expressions.get(i)
                            + " = "+ expressions.get(i).calculate()
                            +  " ,and " + expressions.get(j)
                            + " = "+ expressions.get(i).calculate()
                            + " are equal!");
            }
        }
    }


    //Generating a random number

    public static double RandomizeNumber()
    {
        Random rand = new Random();
        double number = (double)rand.nextInt(5);
        if (number == 0)
            number = (double)rand.nextInt(5);
        return number;
    }
}

