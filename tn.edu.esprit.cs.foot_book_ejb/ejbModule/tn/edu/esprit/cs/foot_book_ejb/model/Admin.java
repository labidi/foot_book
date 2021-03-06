package tn.edu.esprit.cs.foot_book_ejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.edu.esprit.cs.foot_book_ejb.model.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private String accessLevel;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	
	public String getAccessLevel() {
		return this.accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
   
}
