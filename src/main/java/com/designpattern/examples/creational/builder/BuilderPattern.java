package com.designpattern.examples.creational.builder;

/**
 * The Builder Design Pattern is another creational pattern designed to deal
 * with the construction of comparatively complex objects.
 * 
 * When the complexity of creating object increases, the Builder pattern can
 * separate out the instantiation process by using another object (a builder) to
 * construct the object.
 * 
 * This builder can then be used to create many other similar representations
 * using a simple step-by-step approach.
 * 
 * @author Monika.Yadav
 *
 */

public class BuilderPattern {

	public static void main(String[] args) {
		Employee employee1 = new Employee.EmployeeBuilder(1, "e-1").withAddress("address-1").withexperience(1)
				.withDepartment("department - 1").withSalary(1).build();
		System.out.println(employee1.toString());
		Employee employee2 = new Employee.EmployeeBuilder(2, "e-2").withAddress("address-2").withexperience(2)
				.withDepartment("department - 2").withSalary(2).build();
		System.out.println(employee2.toString());
		Employee employee3 = new Employee.EmployeeBuilder(3, "e-3").withAddress("address-3").withexperience(3)
				.withDepartment("department - 3").withSalary(3).build();
		System.out.println(employee3.toString());
	}
}
