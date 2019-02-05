package com.component.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		List<Post> posts1 = new ArrayList<Post>();
		posts1.add(new Post(0,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto"));
		posts1.add(new Post(0,"qui est esse","est rerum tempore vitae sequi sint nihil reprehenderit dolor beatae ea dolores neque fugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis qui aperiam non debitis possimus "));
		posts1.add(new Post(0,"ea molestias quasi exercitationem repellat qui ipsa sit aut","et iusto sed quo iure voluptatem occaecati omnis eligendi aut ad voluptatem doloribus vel accusantium quis pariatur molestiae porro eius odio et labore et velit aut"));
		
		User user1 = new User(0, "John Doe", "johndoe", "John123", "john@gmail.com", posts1);
		
		List<Post> posts2 = new ArrayList<Post>();
		posts2.add(new Post(0,"eum et est occaecati","ullam et saepe reiciendis voluptatem adipisci sit amet autem assumenda provident rerum culpa quis hic commodi nesciunt rem tenetur doloremque ipsam iure quis sunt voluptatem rerum illo velit"));
		posts2.add(new Post(0,"nesciunt quas odio","repudiandae veniam quaerat sunt sed alias aut fugiat sit autem sed est voluptatem omnis possimus esse voluptatibus quis est aut tenetur dolor neque"));
		posts2.add(new Post(0,"dolorem eum magni eos aperiam quia","ut aspernatur corporis harum nihil quis provident sequi mollitia nobis aliquid molestiae perspiciatis et ea nemo ab reprehenderit accusantium quas voluptate dolores velit et doloremque molestiae"));
		
		User user2 = new User(0, "Mary Pierce", "marypierce", "Mary123", "mary@gmail.com", posts2);
		
		session.persist(user1);
		session.persist(user2);
		
		System.out.println("Saved");
		
//		TypedQuery query=session.createQuery("from Post");    
//	    List<Post> list=query.getResultList();    
//	    
//	    for (Post post : list) {
//			System.out.println(post);
//		}
//		
//		transaction.commit();
//		session.close();
		
	}
}
