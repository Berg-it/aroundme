package de.sambi.arroundme.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class ServiceEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7714625494289271157L;
	
	@Id
	@SequenceGenerator(name="seq_id_service", sequenceName="seq_id_service",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_service")	
	private long id;
	
	
	
	
	
}
