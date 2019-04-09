package fr.docm.notes.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.docm.notes.entities.Note;

/**
 * @RepositoryRestResource is used for making:
 * - REST Controller
 * - CRUD
 * - Paging, sorting and more !
 * 
 * MongoRepository<Note, String>: String is the type of Id in MongoDB
 * 
 * @author Romain Mathieu
 */
@RepositoryRestResource
public interface NoteRepository extends MongoRepository<Note, String>
{	
	List<Note> findByTagsLike(String tagLike);	
	List<Note> findByTitleLike(String titleLike);
	List<Note> findByBodyLike(String bodyLike);
}