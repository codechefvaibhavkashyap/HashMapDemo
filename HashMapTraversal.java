/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapDemo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import sun.net.www.content.image.gif;


/**
 *
 * @author Vaibhav
 */
public class HashMapTraversal {
   public static void main(String[] args)throws Exception {

        Car c1 = new Car();
        c1.setCompany("Astin martin");
        c1.setName("DB9");

        Car c2 = new Car();
        c2.setCompany("Isuzu");
        c2.setName("Trooper");

        Car c3 = new Car();
        c3.setCompany("BMW");
        c3.setName("M5");
 

        Car c4 = new Car();
        c4.setCompany("Isuzu");
        c4.setName("Trooper");

        HashMap<String,Car> map = new HashMap<String,Car>();

        map.put( "carOne",c1);

        map.put("carTwo",c2);

        map.put("carThree",c3);

        map.put("carTwoDuplicate",c4);
 

        //Iterate over HashMap
        Set st = map.entrySet();
        Iterator itr = st.iterator();
        System.out.println("Output using Map.Entry: \n");
        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry)itr.next();
            System.out.println("\nkey: "+me.getKey());
            Car car = (Car)me.getValue();
            System.out.print("Value Object -> Comapny : "+car.getCompany()+" *** Value: "+car.getName());
            
        }
       
        System.out.println("\n##################################################");
        
        System.out.println("Output using foreach loop: \n");

        for (Car c : map.values()) {

            System.out.println(c.getName() +" %%%% "+ c.getCompany());

        }        
    }  
}
