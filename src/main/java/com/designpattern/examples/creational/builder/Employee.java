package com.designpattern.examples.creational.builder;

public class Employee {
	private long id;
	private String name;
	private String address;
	private String department;
	private long salary;
	private long experience;

	@Override
	public String toString() {
		return "id - " + this.getId() + " name - " + this.getName() + " address - " + this.getAddress()
				+ " department - " + this.getDepartment() + " salary - " + this.getSalary() + " experience = "
				+ this.getExperience();

	}

	public static class EmployeeBuilder {
		private long id;
		private String name;
		private String address;
		private String department;
		private long salary;
		private long experience;

		public EmployeeBuilder(long id, String name) {
			this.id = id;
			this.name = name;
		}

		public EmployeeBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public EmployeeBuilder withDepartment(String department) {
			this.department = department;
			return this;
		}

		public EmployeeBuilder withSalary(long salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeBuilder withexperience(long experience) {
			this.experience = experience;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	public Employee(EmployeeBuilder employeeBuilder) {
		setId(employeeBuilder.id);
		setName(employeeBuilder.name);
		setAddress(employeeBuilder.address);
		setDepartment(employeeBuilder.department);
		setExperience(employeeBuilder.experience);
		setSalary(employeeBuilder.salary);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

}
