package itsol.intership02.security.manager.authentication;


import itsol.intership02.dao.StaffDAO;
import itsol.intership02.entities.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private StaffDAO staffDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("load user 1: " + username);
		Staff staff = staffDAO.findByUsername(username).orElse(new Staff());
		System.out.println("load user : " + staff.getUsername() + " : "  + staff.getPassword());


		CustomUserDetails userDetails = null;
		if (staff != null) {
			userDetails = new CustomUserDetails();
			userDetails.setStaff(staff);


		} else {
			throw new UsernameNotFoundException("User not exist with name : " + username);
		}

		return userDetails;

	}

}
