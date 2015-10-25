package com.renzq.app.privilege.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue
	private long id;
	
	
	private String name;
	private String memo;
	
	@ManyToMany
	@JoinTable(name = "r_user_role", joinColumns = { @JoinColumn(name="roleid",referencedColumnName="id") }, 
	inverseJoinColumns = { @JoinColumn(name="userid",referencedColumnName="id") })
	private Set<User> user;


	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
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
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	

	
	
}
