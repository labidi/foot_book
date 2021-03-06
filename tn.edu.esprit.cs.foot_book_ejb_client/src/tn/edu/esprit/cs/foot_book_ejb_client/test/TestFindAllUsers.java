package tn.edu.esprit.cs.foot_book_ejb_client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.cs.foot_book_ejb.model.User;
import tn.edu.esprit.cs.foot_book_ejb.services.interfaces.ManagementServicesRemote;

public class TestFindAllUsers {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			String jndiName = "ejb:/tn.edu.esprit.cs.foot_book_ejb/ManagementServices!"
					+ ManagementServicesRemote.class.getCanonicalName();
			ManagementServicesRemote proxy = (ManagementServicesRemote) context
					.lookup(jndiName);

			User userFound = proxy.findUserById(1);
			System.out.println(userFound.getName());

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
