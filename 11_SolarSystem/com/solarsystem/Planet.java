
package com.solarsystem;

import java.util.Arrays;
import java.util.Scanner;

public class Planet {
	// fields
	String name;
	double radius;
	double mass;
	int moons;
	double distanceFromTheSun;
	double rotationRate;

	Planet() {
	};

	void setDistanceFromTheSun(Double distance) {
		distanceFromTheSun = distance;
	}

	Planet(String text) {
		name = text;
	}

	public String toString() {
		return name + " " + radius + " " + mass + " " + moons + " " + distanceFromTheSun + " " + rotationRate;
	}
	

}
