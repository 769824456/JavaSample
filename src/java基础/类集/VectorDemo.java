package java基础.类集;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/2
 * DESC:
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement("a");
        vector.addElement("b");
        vector.addElement("c");

        //elements()
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Object element = enumeration.nextElement();
            System.out.println(element);
        }

        //iterator()
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
