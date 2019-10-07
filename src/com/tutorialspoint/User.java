package com.tutorialspoint;
// prueba 2 para stash
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//comentario para curso de git
//comentario 2 para curso de git
@XmlRootElement(name="user")
public class User  implements Serializable{

	private static final long serialVersionUID =1L;
	private int id;
	private String name;
	private String profession;
	
	public User() { 
		
	}
	
	public User(int id, String name, String profession) {
		
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
