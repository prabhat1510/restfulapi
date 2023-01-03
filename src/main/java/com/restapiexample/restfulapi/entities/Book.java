package com.restapiexample.restfulapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="books")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	private String publisher;
	
}
