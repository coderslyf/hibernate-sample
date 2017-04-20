# hibernate-sample
http://www.javatips.net/blog/h2-in-memory-database-example
http://viralpatel.net/blogs/bootstrap-navbar-menu-without-javascript/

http://viralpatel.net/blogs/hibernate-self-join-annotations-one-to-many-mapping/


http://www.concretepage.com/hibernate/onetomany_hibernate_annotation

Hiberate annotation- deprecated

https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/cfg/AnnotationConfiguration.html

http://www.roseindia.net/answers/viewqa/Hibernate/31190-Annotationconfiguration-deprecated-and-its-replacement.html


Problem
Working with Hibernate 3.6, noticed the previous “org.hibernate.cfg.AnnotationConfiguration“, is marked as “deprecated“.

Code snippets …

import org.hibernate.cfg.AnnotationConfiguration;
//...
private static SessionFactory buildSessionFactory() {
	try {

		return new AnnotationConfiguration().configure().buildSessionFactory();

	} catch (Throwable ex) {

		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
	}
}
The code is still working, just keep displaying the deprecated warning message, is there any replacement for “AnnotationConfiguration” ?

Solution
In Hibernate 3.6, “org.hibernate.cfg.AnnotationConfiguration” is deprecated, and all its functionality has been moved to “org.hibernate.cfg.Configuration“.

So , you can safely replace your “AnnotationConfiguration” with “Configuration” class.

Code snippets …

import org.hibernate.cfg.Configuration;
//...
private static SessionFactory buildSessionFactory() {
	try {

		return new Configuration().configure().buildSessionFactory();

	} catch (Throwable ex) {

		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
	}
}
