package com.rais.api.service;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.rais.api.service.PersonService;
import com.rais.core.model.Person;



@ContextConfiguration(locations = { "file:/Users/rais.alam/workspace/my/myapp-web/src/main/webapp/WEB-INF/myapp/servlet-context.xml" })
public class PersonServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	private PersonService personService;
	
	@Autowired(required=true)
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	
	@Test
	public void testAddPerson() {
		
		Person p = new Person();
		p.setCountry("India");
		p.setName("rais");
		this.personService.addPerson(p);
	}

	

}
