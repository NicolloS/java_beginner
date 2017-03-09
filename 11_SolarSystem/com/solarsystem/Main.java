package com.solarsystem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] app) {
		Planet mercury = new Planet("Mercury");
		System.out.println("name of planet #1 Solar system : "+ mercury.name);
		System.out.println("mass of planet #1 Solar system : "+ mercury.mass);
		System.out.println("radius of planet #1 Solar system : "+ mercury.radius);
		//Planet pi = null;
		//pi.toString();
		System.out.println(Arrays.toString(new Planet[10]));
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size Solar system : ");
			int arraySizeSolarSustem = scanner.nextInt();
			Planet[] inputData = new Planet[arraySizeSolarSustem];

			for (int i = 0; i < arraySizeSolarSustem; i++) {
				System.out.println("Enter Name of planet:");
				Planet input = new Planet(scanner.next());
				System.out.println("Enter radius of planet:");
				input.radius = scanner.nextDouble();
				System.out.println("Enter mass of planet:");
				input.mass = scanner.nextDouble();
				System.out.println("Enter value moons of planet:");
				input.moons = scanner.nextInt();
				System.out.println("Enter distanceFromTheSun of planet:");
				input.distanceFromTheSun = scanner.nextDouble(); 
				System.out.println("Enter rotationRate of planet:");
				input.rotationRate = scanner.nextDouble (); 
				inputData[i] = input;
			}
			System.out.println(new Planet());
			System.out.println("**********  Input Array  **********");
			int a=0;
			for (Planet is : inputData) {
				a++;
				System.out.println("["+a+"]"+ is);
			}
			// Add one to input array
			// int[][] result = antiDiagonals.backDiagon(inputData);
			// System.out.println("********** Result Array **********");
			// for (int[] is : result) {
			// System.out.println(Arrays.toString(is));
		}
	}

}
