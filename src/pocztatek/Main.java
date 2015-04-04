package pocztatek;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pocztatek.domain.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		Employee employee = new Employee();
		
		employee.setFirstName("Darek");
		employee.setLastName("Brzostek");
		employee.setSalary(5000);
		employee.setSalary2(new BigDecimal("1234.5"));

		entityManager.getTransaction().begin();
		entityManager.persist(employee);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
