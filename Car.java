/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapDemo;

/**
 *
 * @author Vaibhav
 */

public class Car {
  private String name, company;
        
        
        /*hashCode & equals methods are to be commented for first run to see the difference*/
        @Override
        public boolean equals(Object o) {
        Car m = (Car) o;
        return m.company.equals(this.company) && m.name.equals(this.name);
        }

        @Override
        public int hashCode() 
        {
            return name.hashCode() + company.hashCode();
        }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
}

