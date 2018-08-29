package itsol.intership02.security.manager.authentication;

import itsol.intership02.entities.Staff;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;


public class CustomUserDetails implements UserDetails {

	/**
	 *
	 */
	private static final long serialVersionUID = 1256711395932122675L;
	private Staff staff;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		System.out.println("ok in getAuth");
		return staff.getMap_role_userList().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole_id().getName()))
				.collect(Collectors.toList());
	}
	@Override
	public String getPassword() {
		return staff.getPassword();
	}

	@Override
	public String getUsername() {
		return staff.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
}
