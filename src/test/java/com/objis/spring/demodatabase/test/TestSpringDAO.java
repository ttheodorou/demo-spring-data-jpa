package com.objis.spring.demodatabase.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.spring.dao.IEmployeDao;
import com.objis.spring.dao.IGarsDao;
import com.objis.spring.domaine.Employe;
import com.objis.spring.domaine.Gars;

import junit.framework.TestCase;

public class TestSpringDAO extends TestCase {

	private Employe emp;
	private IEmployeDao springDao;
	private ClassPathXmlApplicationContext appContext;
	private Gars gars;
	private IGarsDao garsDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		emp = new Employe("douglas", "mdpdoug", "Douglas", "MBIANDOU", "douglas.mbiandou@objis.com", "employe");
		gars = new Gars("Stanley", "Marley", "stan");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (IEmployeDao) appContext.getBean("IEmployeDao");
		garsDao = (IGarsDao) appContext.getBean("IGarsDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		emp = null;
		appContext = null;
		springDao = null;
	}

	public void testSaveEmploye() {
		springDao.save(emp);
	}
/*
	public void testFindOne() {
		Employe employe = springDao.findOne(1);
		assertNotNull(employe);
	}
*/	
	public void testFindByEmail() {
		List<Employe> employe = springDao.findByEmail(emp.getEmail());
		for(Employe e : employe) {
			System.out.println(e.getEmail());
		}
		assertNotNull(employe);
	}
	public void testSaveGars() {
		garsDao.save(gars);
	}
	
	public void testFindBySurnom(){
		List<Gars> copains = garsDao.findBySurnom(gars.getSurnom());
		for (Gars e : copains){
			System.out.println(e.getSurnom());
		}
		assertNotNull(copains);
	}
}
