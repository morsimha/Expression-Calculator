import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AtomicExpression a = new AtomicExpression(6);
        AtomicExpression b = new AtomicExpression(7);
        AtomicExpression c = new AtomicExpression(14);
        AdditionExpression d = new AdditionExpression(b,b); //14
        SubtractionExpression e = new SubtractionExpression(c,b); //7
      //  AdditionExpression f = new AdditionExpression(c,d.calculate());

        ArrayList<Object> list = new ArrayList<Object>();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        AdditionExpression e3exp = new AdditionExpression(a,d); //14
        System.out.println(e3exp + " == " + e3exp.calculate()); //21


        System.out.println(d +" " + d.calculate());
        System.out.println(e +" " + e.calculate());
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));


        // Create an ArrayList object
        ArrayList<Expression> expressions = new ArrayList<>();

        // Creating expressions of different types
        Expression a1 = new AtomicExpression(generateRandomNumber());
        Expression a2 = new AtomicExpression(generateRandomNumber());
        Expression a3 = new AtomicExpression(generateRandomNumber());
        Expression a4 = new AtomicExpression(generateRandomNumber());
        Expression a5 = new AtomicExpression(generateRandomNumber());
        AtomicExpression a6 = new AtomicExpression(generateRandomNumber());
        AtomicExpression a7 = new AtomicExpression(generateRandomNumber());
        AtomicExpression a8 = new AtomicExpression(generateRandomNumber());
        AtomicExpression a9 = new AtomicExpression(generateRandomNumber());
        AtomicExpression a10 = new AtomicExpression(generateRandomNumber());
        AdditionExpression num1 = new AdditionExpression(a1,a2);
        SubtractionExpression num2 = new SubtractionExpression(a3,a4);
        System.out.println("im num1 hamaniak "+ num1 +" "+ num1.calculate());
        System.out.println("im num2 hamaniak "+ num2 +" "+num2.calculate() );

        AdditionExpression num3 = new AdditionExpression(a5,a6);
        SubtractionExpression num4 = new SubtractionExpression(a7,a8);
        Expression num5 = new AtomicExpression(generateRandomNumber());
        Expression num6 = new AtomicExpression(generateRandomNumber());
        Expression num7 = new AdditionExpression(a9,a10);
        Expression num8 = new AdditionExpression(num1,num2);
        System.out.println("im num8 hamaniak "+ num8 +" "+ num8.calculate());
        Expression num9 = new SubtractionExpression(num3,num4);
        Expression num10 = new SubtractionExpression(num5,num6);
        CompoundExpression num11 = new SubtractionExpression(num7,num8);
        CompoundExpression num12 = new SubtractionExpression(num9,num10);
        CompoundExpression num13 = new AdditionExpression(num11,num12);
        CompoundExpression num14 = new AdditionExpression(a1,a10);
        CompoundExpression num15 = new SubtractionExpression(a2,a9);
        CompoundExpression num16 = new SubtractionExpression(a3,a8);
        Expression num17 = new AtomicExpression(generateRandomNumber());
        Expression num18 = new AtomicExpression(generateRandomNumber());
        Expression num19 = new AdditionExpression(a4,a7);
        Expression num20 = new AdditionExpression(a5,a6);
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

//Adding variables to ArrayList
        expressions.add(new AtomicExpression(0));
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

        // Print the expressions
        for (int i = 0 ; i < expressions.size() ; i ++)
        {
            System.out.println("Expression" + i + " = " +  expressions.get(i).toString()  + " = " + (expressions.get(i).calculate()));
        }

        System.out.println();
        //Print the expressions with the equal values
        for (int i = 0 ; i < expressions.size() ; i ++)
        {
            for (int j = 0 ; j < expressions.size() ; j ++)
            {
                if (i != j && expressions.get(i).equals(expressions.get(j)))
                    System.out.println("Expression" + i + " = " + expressions.get(i)
                            + " Expression" + j + " = " + expressions.get(j)
                            + "\nAre they equals? " + expressions.get(i).equals(expressions.get(j)) + "\n");
            }
        }
    }

    /*
    Generating a random number between minus 5 and 5
     */
    public static double generateRandomNumber()
    {
        Random rand = new Random();
        double number = (double)rand.nextInt(50);
        if (number == 0)
            number = (double)rand.nextInt(50);
        return number;

    }

    /*
    Round the number to two digits after the decimal point
     */
    public static double round(double number)
    {
        number = (Math.round(number*10));
        return number/10;
    }
}

