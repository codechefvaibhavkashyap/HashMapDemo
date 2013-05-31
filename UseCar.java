/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapDemo;

import java.util.HashMap;

/**
 *
 * @author pc
 */
public class UseCar {

 

    public static void main(String[] args) {

 

        Car c1 = new Car();
        c1.setCompany("Astin martin");
        c1.setName("DB9");

        Car c2 = new Car();
        c2.setCompany("Mazda");
        c2.setName("Ryuga");

        Car c3 = new Car();
        c3.setCompany("BMW");
        c3.setName("M5");
 

        Car c4 = new Car();
        c4.setCompany("Mazda");
        c4.setName("zombie");

 

        HashMap<Car, String> map = new HashMap<Car, String>();

        map.put(c1, "carOne");

        map.put(c2, "carTwo");

        map.put(c3, "carThree");

        map.put(c4, "carTwo");
 

        //Iterate over HashMap

        for (Car cr : map.keySet()) {

            System.out.println(map.get(cr).toString());

        }

    }

}
