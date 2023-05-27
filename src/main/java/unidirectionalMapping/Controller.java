package unidirectionalMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		Table1 t1=new Table1();
		t1.setPhone(23456789);
		t1.setName("priyanka");
		t1.setAdds("yalanduru");
		
		Table2 t2=new Table2();
		t2.setName("bhagya");
		t2.setPhone(23456789);
		t2.setProfile_name("santu");
		
		t1.setT2(t2);
		
		
		et.begin();
		
		em.persist(t2);
		em.persist(t1);
		et.commit();
		System.out.println("done");
	}

}
