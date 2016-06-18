package main.cs;

import java.util.List;
 
import com.github.reinert.jjschema.Attributes;
 
@Attributes(title = "Employee", description = "Schema for an employee")
public class Employee {
 
    @Attributes(required = true, description = "ID of the employee")
    private int id;
 
    @Attributes(required = true, minLength = 1, maxLength = 15, description = "First name of the employee")
    private String firstName;
 
    @Attributes(required = true, minLength = 1, maxLength = 15, description = "Last name of the employee")
    private String lastName;
 
    @Attributes(required = true, description = "Age in years of the employee")
    private int age;
 
    //@Attributes(required = true, description = "Gender of the employee")
   // private Gender gender;
 
    @Attributes(required = true, minItems = 1, maxItems = 3, minLength = 1, maxLength = 30, description = "Address lines of the employee")
    private List address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List getAddress() {
		return address;
	}

	public void setAddress(List address) {
		this.address = address;
	}

	
    // setters and getters are omitted for convinience
 
}