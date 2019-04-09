package fr.docm.notes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import fr.docm.notes.dao.NoteRepository;
import fr.docm.notes.entities.Note;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceNotesApplication.class, args);
	}

	@Bean
	CommandLineRunner start(NoteRepository noteRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cn->{
				List<String> l = new ArrayList<String>();
				l.add("Tag1");
				l.add("Tag2");
				noteRepository.save(new Note(null,new Date(), l, "title", "body " + Math.round(Math.random()*100)));
			});
			
			noteRepository.findAll().forEach(System.out::println);
			
			/*
			noteRepository.findAll().forEach(note->{
				System.out.println(note.toString());
			});
			*/
			
		};
	}
	
}
