package sekwencje;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Listy_testowe {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Ala");
		lista1.add("Ola");
		lista1.add("Ala");
		System.out.println(lista1);
		
		for(String s: lista1 ){
		System.out.print(s + " ");
		}
		System.out.println("\nWielkoœæ listy: "+lista1.size());
		lista1.remove(1);
		System.out.println(lista1);
		lista1.remove("Ala");
		System.out.println(lista1);
		lista1.set(0, "Ela");
		System.out.println(lista1);
		//lista1.set(1, "Ola");
		lista1.add(0, "Ola");
		System.out.println(lista1);
		
		//HashSet
		HashSet<Integer> zbior = new HashSet<Integer>();
		zbior.add(2);
		zbior.add(5);
		zbior.add(1);
		zbior.add(1);
		HashSet<Integer> zbior2 = new HashSet<Integer>();
		zbior2.addAll(zbior);
		System.out.println(zbior);
		System.out.println(zbior2);
		HashSet<String> zbior3 = new HashSet<String>();
		zbior3.add("XYZ");
		zbior3.add("B");
		zbior3.add("abb");
		zbior3.add("D");
		System.out.println(zbior3);
		System.out.println(zbior3.contains("abb"));
		System.out.println(zbior2.contains(5));
		System.out.println(zbior3.size());
		zbior3.remove("X");
		System.out.println(zbior3);
		zbior3.clear();
		System.out.println(zbior3.isEmpty());
		
		//Mapy
		HashMap<Integer, String> mapa = new HashMap<Integer,String>();
		mapa.put(10, "Dziesiêæ");
		mapa.put(14, "Czternaœcie");
		mapa.put(15, "Piêtnaœcie");
		mapa.put(11, "Dziesiêæ");
		System.out.println(mapa.get(10));
		System.out.println(mapa.get(11));
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		mapa.remove(10, "Dziesiêæ");
		System.out.println(mapa);
		mapa.clear();
		System.out.println(mapa);
		
		//Kolejki
		ArrayDeque<String> stos = new ArrayDeque<String>();
		ArrayDeque<String> stos1 = new ArrayDeque<String>();
		stos.add("napis1");
		stos.add("napis2");
		stos.add("napis3");
		
		System.out.println(stos1);
		stos.addLast("napis koncowy");
		stos.addFirst("napis pocz¹tkowy");
		
		System.out.println(stos);
		String a = stos.pollFirst();	//pobiera poczatkowy - last koncowy -first usuwa
		System.out.println(a);
		
		String b = stos.getLast();		//pobiera poczatkowy - last koncowy -first nie usuwa
		System.out.println(b);
		System.out.println(stos);
		
		stos.remove("napis2");
		
		System.out.println(stos);
		System.out.println(stos.size());
		System.out.println(stos.hashCode());
		
		String x = "A";
		
		String z = "B";
		
		String y = x;
		
		System.out.println(x.hashCode());
		System.out.println(z.hashCode());
		
	}

}

