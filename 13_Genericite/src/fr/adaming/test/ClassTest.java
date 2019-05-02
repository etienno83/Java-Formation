package fr.adaming.test;

import fr.adaming.model.MaClass;

public class ClassTest {

	public static void main(String[] args) {

		MaClass<String> m = new MaClass<String>();

		m.assigner("Toto");
		
		MaClass<Integer> m1 = new MaClass<Integer>();
		
		m1.assigner(2000);

	}
}
