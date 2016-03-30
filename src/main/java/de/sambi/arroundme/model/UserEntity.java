package de.sambi.arroundme.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * tous les classes de la package model doivent être implément la classe Serializable!!!!!
 * 
 *
 */
@Entity//REQUIRED
@Table (name="user")//OPTIONELLE
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5012625948444358261L;
	
	@Id
	@SequenceGenerator(name="seq_id_user", sequenceName="seq_id_user",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_user")
	private long id;
	@Column(name = "firstName")
	private String name;
	@ManyToOne
	@JoinColumn(name = "type_id") //ADD FOREIGN KEY (type_id) REFERENCES TypeUserEntity (ID);
    private TypeUserEntity typeUser;	

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TypeUserEntity getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(TypeUserEntity typeUser) {
		this.typeUser = typeUser;
	}
		
	
	

}
