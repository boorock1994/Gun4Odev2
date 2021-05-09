package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public Long nationalId;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, int dateOfBirth, Long nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public Long getNationalId() {
		return nationalId;
	}

}
