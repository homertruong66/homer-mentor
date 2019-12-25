package com.tech3s.mentor.demo;

import com.tech3s.mentor.model.Customer;
import com.tech3s.mentor.model.Node;
import com.tech3s.mentor.model.Product;

import java.util.*;

public class E_DataStructure {
	
	// Main Program
	public static void main(String[] args) {
		// Array
		int[] integers = new int[] {1,61,4,16,2,4,7,8,5,2,1,22,44,6,66};

		System.out.println("Find first number 6 in the ARRAY: " + Arrays.toString(integers));

		boolean found = false;
		for (int i = 0; i < integers.length ; i++) {
			if (integers[i] == 6) {
				System.out.println("The first number 6 is at index = " + (i+1));
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("There's no number 6 in the list " + Arrays.toString(integers));
		}


		// List and Set
		Random        random      = new Random();
		List<Product> productList = new ArrayList<>();
		Set<Product>  productSet  = new HashSet<>();
		for (int i = 0; i < 6; i++) {
			Product product = new Product();
			product.setTitle("Tittle " + (i+1));
			product.setDescription("Description " + (i+1));
			product.setPrice(random.nextInt(200));
			product.setQuantity(i*2 + 1);
			productList.add(product);
			productSet.add(product);
		}

		System.out.println("\nProducts from LIST: ");
		for (Product product: productList) {
			if (product.getPrice() >= 100) {
				System.out.println(product);
			}
		}

		System.out.println("\nProducts from SET: ");
		for (Product product: productSet) {
			if (product.getPrice() >= 100) {
				System.out.println(product);
			}
		}
		
		
		// Tree
		// create a binary tree with 3 Customers: Dad -> Daughter & Son
		Node rootNode = new Node();
		
		// create Dad
		Customer dad = new Customer();
		dad.setId("dad123");
		dad.setCode("dad");
		dad.setEmail("dad@gmail.com");
		dad.setName("Daddy");
		rootNode.setCustomer(dad);
		
		// create Daughter
		Customer daughter = new Customer();
		daughter.setId("daughter123");
		daughter.setCode("daughter");
		daughter.setEmail("daughter@gmail.com");
		daughter.setName("Daughter");
		Node daughterNode = new Node();
		daughterNode.setCustomer(daughter);
		rootNode.setLeft(daughterNode);
		
		// create Son
		Customer son = new Customer();
		son.setId("son123");
		son.setCode("son");
		son.setEmail("son@gmail.com");
		son.setName("Son");
		Node sonNode = new Node();
		sonNode.setCustomer(son);
		rootNode.setRight(sonNode);
		
		System.out.println("\nBinary family TREE: " + rootNode);
	}

}
