package com.renzq.app.privilege.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue
	private long id;
	
	private String username;
	private String password;
	private String realname;
	private String email;
	private String mobile;
	private boolean gender;
	private String phone;
	private String QQ;
	
    @ManyToMany(targetEntity=com.renzq.app.privilege.model.Role.class,
            cascade = {javax.persistence.CascadeType.PERSIST, javax.persistence.CascadeType.MERGE}  
            )
    @JoinTable(name="r_user_role",joinColumns=@JoinColumn(name="userid",referencedColumnName="id"),  
    inverseJoinColumns={@JoinColumn(name="roleid",referencedColumnName="id")})
	private Set<Role> roles;
	

	public Set<Role> getRoles() {
		return roles;
	}
    
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	
	
	
	
	
	
}
