package com.solarsystem;

public class SolarSystem {
	String star;
	Planet[] planets;

	public void setPlanets(Planet[] array) {
		planets = array;
	}

	public String printPlanet() {
		String strPlanet ="";
		for (int i = 0; i < planets.length; i++) {
			// System.out.println("[" + i+1 + "]" + planets[i].name);
			strPlanet = strPlanet + (i + 1) +"  "+ planets[i].getName()+'\n';
			
		}
		return strPlanet;
	}

	void readPlanet() {
	}
}
