package com.maven.jpa;

import javax.persistence.*;

public class Jpa_Maven_Test {
 //declaramos un variable  de tipo entitymanager...
	private  EntityManager manager;
	
	
	//creamos su respectivo constructor.....
	public Jpa_Maven_Test(EntityManager manager) {
	//super();
	this.manager = manager;
       }   //fin del  constructor.....



	public static void main(String[] args) {
		
		// aplicamos una variable de tipo  entitymanagefactory
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Proyecto-Maven-CibertecIII");	
		// aplicamos una variable de tipo  entitymanager
		EntityManager manager=factory.createEntityManager(); 
        //instanciamos la clase jpa_maven_test....
        Jpa_Maven_Test jpamaven=new Jpa_Maven_Test(manager);
        //aplicamos transaciones...
        EntityTransaction etran=manager.getTransaction();
        //iniciamos la transacion....
        etran.begin();
        //llamamos el metodo crear alumno.....
        
	}  //fin  del metodo  principal.....
	

}   //fin de la  clase jpa_maven_test......
