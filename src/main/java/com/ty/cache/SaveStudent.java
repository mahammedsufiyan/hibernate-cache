package com.ty.cache;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveStudent {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	}
}
