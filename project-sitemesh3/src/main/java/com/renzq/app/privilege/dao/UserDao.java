package com.renzq.app.privilege.dao;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.renzq.app.common.dao.GenericDAO;
import com.renzq.app.privilege.model.User;

@Repository
public class UserDao extends GenericDAO<User> implements IUserDao, UserDetailsService{

	final private static Log log = LogFactory.getLog(UserDao.class);

	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		log.info(username + " is loginin...");
		//AuthenticationFailureHandler
		Set<GrantedAuthority> grantedAuthorities =  new HashSet<GrantedAuthority>();
        boolean enables = true;  
        boolean accountNonExpired = true;  
        boolean credentialsNonExpired = true;  
        boolean accountNonLocked = true;
        
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		
		UserDetails userDetails = new org.springframework.security.core.userdetails.User
				(username, "null", enables, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);  
        return userDetails;
	}

}
