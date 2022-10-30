import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AtomicExpression a = new AtomicExpression(7);
        AtomicExpression b = new AtomicExpression(7);
        AtomicExpression c = new AtomicExpression(14);
        AdditionExpression d = new AdditionExpression(a,b); //14
        SubtractionExpression e = new SubtractionExpression(c,b); //7
      //  AdditionExpression f = new AdditionExpression(c,d.calculate());

        ArrayList<Object> list = new ArrayList<Object>();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(d +" " + d.calculate());
        System.out.println(e +" " + e.calculate());
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));



    }
}