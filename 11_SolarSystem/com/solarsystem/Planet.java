package com.solarsystem;

public class Planet {
	// fields
	private String name;
	private double radius;
	private double mass;
	private int moons;
	private double distanceFromTheSun;
	private double rotationRate;
	private double yearLength;

	void setDistanceFromTheSun(Double distance) {
		distanceFromTheSun = distance;
	}

	public Planet(String text) {
		name = text;
	}

	public String toString() {
		return name + " " + radius + "*1000km " + mass + "*1000t " + moons + " " + distanceFromTheSun + " a.e. "
				+ rotationRate + " hour";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public int getMoons() {
		return moons;
	}

	public void setMoons(int moons) {
		this.moons = moons;
	}

	public double getDistanceFromTheSun() {
		return distanceFromTheSun;
	}

	public void setDistanceFromTheSun(double distanceFromTheSun) {
		this.distanceFromTheSun = distanceFromTheSun;
	}

	public double getRotationRate() {
		return rotationRate;
	}

	public void setRotationRate(double rotationRate) {
		this.rotationRate = rotationRate;
	}

	public double getYearLength() {
		return yearLength;
	}

	public void setYearLength(double yearLength) {
		this.yearLength = yearLength;
	}

	private double distanceFromTheOrbit(Planet closePlanet) {
		double distance = Math.abs(this.distanceFromTheSun - closePlanet.distanceFromTheSun); //Integer.MIN_VALUE
		return distance;
	}
}
