package fr.docm.notes.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Lombok @data creates Setters, Getters, toString method and more.
 * Lombok @AllArgsConstructor creates contructor with all parameters.
 * Lombok @NoArgsConstructor creates contructor with no parameters.
 * 
 * Do not add @Indexed(unique = true) to @Id because it already exist, no need index duplication.
 * 
 * @author Romain Mathieu
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "note")
public class Note
{ 
    @Id
    private String id;
    
    @Field(value = "Modification_Date")
    private Date modificationDate;
 
    @Field(value = "Tags")
    private List<String> tags;
    
    @Field(value = "Title")
    private String title;
 
    @Field(value = "Body")
    private String body;
}