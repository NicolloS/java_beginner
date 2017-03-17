package com.solarsystem.main;

import java.util.Arrays;
import java.util.Scanner;

import com.solarsystem.Planet;
import com.solarsystem.SolarSystem;


public class Main {
	public static void main(String[] app) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size Solar system : ");
			int arraySizeSolarSustem = scanner.nextInt();
			Planet[] inputData = new Planet[arraySizeSolarSustem];

			for (int i = 0; i < arraySizeSolarSustem; i++) {
				System.out.println("Enter Name of planet:");
				Planet input = new Planet(scanner.next());
				System.out.println("Enter radius of planet 1000km:");
				input.setRadius(scanner.nextDouble());
				System.out.println("Enter mass of planet 1000t:");
				input.setMass(scanner.nextDouble());
				System.out.println("Enter kol-vo moons of planet:");
				input.setMoons(scanner.nextInt());
				System.out.println("Enter distanceFromTheSun of planet in a.e.:");
				input.setDistanceFromTheSun(scanner.nextDouble());
				System.out.println("Enter rotationRate of planet (hour):");
				input.setRotationRate(scanner.nextDouble());
				inputData[i] = input;
			}
			int a = 0;
			// System.out.println(new Planet());
			for (Planet is : inputData) {
				System.out.println("[" + a + "]" + inputData[a].getName());
				a++;
			}
			System.out.println("[" + arraySizeSolarSustem + "] Exit ");
			System.out.println(" Input number of planet 0-" + arraySizeSolarSustem + ":");
			a = 0;
			int numberOfPlanet;
			while ((a < arraySizeSolarSustem) && (a >= 0)) {
				numberOfPlanet = scanner.nextInt();
				a = numberOfPlanet;
				// for (Planet is : inputData) {
				if((a < arraySizeSolarSustem) && (a >= 0)) System.out.println("[" + a + "]" + inputData[a].toString());
				// }
				
			}
			System.gc();
			SolarSystem solar = new SolarSystem();
			solar.setPlanets(inputData);
			//for ()
			System.out.println(solar.printPlanet());
			// switch (numberOfPlanet) {
			// case 1: {
			// System.out.println("[" + a + "]" + inputData[a]);
			// break;
			// }
			// case 2: {
			// System.out.println("[" + a + "]" + inputData[a]);
			// break;
			// }
			// default:
			// break;
			// }
			// for (Planet is : inputData) {
			// a++;
			// if (numberOfPlanet == a)
			// System.out.println("[" + a + "]" + is);
			// }
		}
	}
}
