package ma.emsi.ProjetSpringMVC;
import java.util.Date;

import ma.emsi.ProjetSpringMVC.dao.PatientRepository;
import ma.emsi.ProjetSpringMVC.entities.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetSpringMvcApplication implements CommandLineRunner{

	@Autowired
	public PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		patientRepository.save(new Patient(null,"Mostafa", new Date(), false,8));
//		patientRepository.save(new Patient(null,"Karim", new Date(), true,10));
//		patientRepository.save(new Patient(null,"Issam", new Date(), false,9));
//		patientRepository.save(new Patient(null,"Houssam", new Date(), false,6));
//		patientRepository.save(new Patient(null,"Yassine", new Date(), true,7));
		System.out.println("-----------------------------------------------------");
		patientRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});;
		
	}

}