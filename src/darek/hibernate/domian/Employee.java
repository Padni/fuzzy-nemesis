package darek.hibernate.domian;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pracownicy")
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "Imie", nullable = false, length = 10)
	private String firstName;
	@Column(name = "Nazwisko", columnDefinition = "VARCHAR(10) NOT NULL")
	private String lastName;
	@Column(name = "Pensja")
	private double salary;
	@Column(precision =10,scale=2)
	private BigDecimal salary2;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the salary2
	 */
	public BigDecimal getSalary2() {
		return salary2;
	}

	/**
	 * @param salary2 the salary2 to set
	 */
	public void setSalary2(BigDecimal salary2) {
		this.salary2 = salary2;
	}

	

}
