package com.rais.core.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.rais.core.model.Person;




@ContextConfiguration(locations = { "file:/Users/rais.alam/workspace/my/myapp-web/src/main/webapp/WEB-INF/myapp/servlet-context.xml" })
public class PersonDAOTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	PersonDAO personDAO;

	@Autowired(required=true)
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	

	@Test
	public void testAddPerson() {
		
		Person p = new Person();
		p.setCountry("India");
		p.setName("rais");
		this.personDAO.addPerson(p);
	}

	
	
	

}
