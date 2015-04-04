package dateAndTime;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class MainDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		

		entityManager.close();
		entityManagerFactory.close();
		
	}
	
	

}
