package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Long id;
	
	@NotNull
	@Column(name = "name")
	String name;

	public Long getId() {
		return id;
	}

	public void setId(Long i) {
		this.id = i;
	}

	public String getname() {
		return name;
	}	

	public void setname(String name) {
		this.name = name;
	}
}