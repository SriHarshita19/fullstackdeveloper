package com.cts.training.controller;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Actor;
import com.cts.training.model.Developer;
import com.cts.training.model.Movie;
import com.cts.training.model.PassportDetails;
import com.cts.training.model.Person;
import com.cts.training.model.Technology;

public class MappingController {
public static void main(String args[])
{
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
//	Person person=new Person();
//	person.setName("sri");
//	PassportDetails pDetails=new PassportDetails();
//	pDetails.setPassportNumber("BG8475757757");
//	person.setPassport(pDetails);
//	person.setPassport(pDetails);
//			session.save(person);
	
//	Criteria criteria=session.createCriteria(Person.class);
//    List<Person> persons=criteria.add(Restrictions.gt("id",30)).list();
//	for(Person p:persons)
//	{
//		System.out.println(p.getPassport().getPassportNumber());
//	}
	

	
	
	Movie movie= new Movie();
	movie.setName("Furious 7");
	
	Actor actor1 = new Actor();
	actor1.setActorName("Mahesh");
	actor1.setMovie(movie);
	
	Actor actor2= new Actor();
	actor2.setActorName("Virat");
	actor2.setMovie(movie);

	Transaction transaction = session.getTransaction();
	session.save(movie);
	session.save(actor1);
	session.save(actor2);
//	Criteria criteria = session.createCriteria(Movie.class);
//	criteria.add(Restrictions.eq("id", 1L));
//	Movie movie1 = (Movie) criteria.uniqueResult();
//	System.out.println(movie1);
//	Set<Actor> actors = movie1.getActors();
//	for(Actor actor : actors){
//	  System.out.println(actor);
//	}
	Criteria criteria=session.createCriteria(Actor.class);
    criteria.add(Restrictions.eq("name","Virat"));
    Actor actor=(Actor)criteria.uniqueResult();
    System.out.println(actor);
    System.out.println(actor.getMovie());
    transaction.commit();
	session.close();
	
	
	
//	Developer developer1= new Developer();
//	developer1.setName("Vishal");
//	Developer developer2= new Developer();
//	developer2.setName("Yogesh");
//	Developer developer3= new Developer();
//	developer3.setName("Virendra");
//	Technology technology1=new Technology();
//	technology1.setLanguage("Java");
//	technology1.setExpertise("Intermediate");
//	Technology technology2=new Technology();
//	technology2.setLanguage("Bigdata");
//	technology2.setExpertise("Expert");
//	Set<Technology> technologies= new HashSet<Technology>();
//	technologies.add(technology1);
//	technologies.add(technology2);
//	developer1.setTechnology(technologies);
//	developer2.setTechnology(technologies);
//	developer3.setTechnology(technologies);
//	Transaction transaction = session.getTransaction();
//	session.save(developer1);
//	session.save(developer2);
//	session.save(developer3);
//	transaction.commit();
 //   session.close();
	
}
}
