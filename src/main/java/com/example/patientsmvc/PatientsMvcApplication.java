package com.example.patientsmvc;

import com.example.patientsmvc.entities.Patient;
import com.example.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
   //@Bean
CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"lamiaa", new Date(),false ,122 ));
            patientRepository.save(new Patient(null,"abir", new Date(),true ,132 ));
            patientRepository.save(new Patient(null,"yasmine", new Date(),true ,122 ));
            patientRepository.save(new Patient(null,"Hiba", new Date(),false ,124 ));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });

        };
}
@Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
}



}

