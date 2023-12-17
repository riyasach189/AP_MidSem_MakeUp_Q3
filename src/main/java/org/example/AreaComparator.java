package org.example;

import java.util.Comparator;

public class AreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        o1 = (Shape) o1;
        o2 = (Shape) o2;

        if (((Shape) o1).returnArea() > ((Shape) o2).returnArea())
        {
            return 1;
        }

        else if (((Shape) o1).returnArea() < ((Shape) o2).returnArea())
        {
            return -1;
        }

        else{
        return 0;}
    }
}
