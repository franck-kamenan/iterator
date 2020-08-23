package be.intecbrussel.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("VW");
        cars.add("Audi");
        System.out.println(cars);

        Iterator<String> iterateur = cars.iterator();
        System.out.println(iterateur.next());

        while (iterateur.hasNext())
        {
            System.out.println(iterateur.next());
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(4);
        numbers.add(24);
        System.out.println(numbers);

        Iterator<Integer> nrIterateur = numbers.iterator();
        System.out.println(nrIterateur.next());

        while (nrIterateur.hasNext())
        {
            Integer i = nrIterateur.next();
            if (i < 10)
            {
                nrIterateur.remove();
            }
        }
        System.out.println(numbers);
    }
}
