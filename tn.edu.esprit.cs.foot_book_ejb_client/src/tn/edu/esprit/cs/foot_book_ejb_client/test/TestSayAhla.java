package tn.edu.esprit.cs.foot_book_ejb_client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

public class TestSayAhla {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ManagementServices!"
					+ ManagementServicesRemote.class.getCanonicalName();
			ManagementServicesRemote proxy = (ManagementServicesRemote) context
					.lookup(jndiName);

			proxy.sayAhla("ronaldo");

			User user = new User();
			user.setName("foulen");

			proxy.save(user);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
