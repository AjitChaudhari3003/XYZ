import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
//        Student student = new Student(1, "Ajit", "Pune");
//        Student student = new Student(2, "Rahul", "Mumbai");
//        Student student = new Student(3, "Priya", "Delhi");
    	Student student = new Student(4, "Ajit", "Palve");
        
        
        Configuration configuration = new Configuration();
        configuration.configure("cfg.xml");

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();

            System.out.println("Student saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
