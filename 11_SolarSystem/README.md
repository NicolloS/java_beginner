# Solar System
Let's make a planetary system!

## Learning Goals
### Wave 1
- Create a custom **class**
- Create and use a **constructor** with parameters in your class
-- factory method
-- builder
- Create and use **instance variables** in your class (=`fields`, =`attributes`)

### Wave 2
- Use an **array** to store a list of objects
- Create and use a **method**

## Baseline
- Create a `Planet` class with a name attribute.
- You should be able to instantiate a new `Planet` object with an associated name.

# Wave 1
## Primary Requirements
- Get creative! Give each instance of `Planet` at least five attributes. These could be diameters, mass, moons... whatever!
- You should be able to create many different planets with different properties, like Mercury, Venus, Earth, Mars, Jupiter, etc.

## Optional Enhancements
- Give each planet a rate of solar rotation
- Give each planet a `distanceFromTheSun` attribute
- Write a program that asks for user input to query the planets:
  - First, ask the user to select a planet they'd like to learn about.
  - Present the user with a list of planets from which they can choose. Something like:
    - `1. Mercury, 2. Venus, 3. Earth, 4. Secret Earth, 5. Mars, 6. Jupiter, ... 13. Exit`
  - Provide the user with well formatted information about the planet (diameter, mass, number of moons, primary export, etc.)
  - Then ask the user for another planet.

# Wave 2
## Primary Requirements
- Create a `SolarSystem` class that has an attribute `planets` that has zero to many `Planet` instances. There are a few different options for how to associate the planets with your solar system:
    - Create a method that adds a single planet to a solar system
    - Create a method that adds a list of planets to an existing list of planets

## Optional Enhancements
- Ensure that the each planet has a `distanceFromTheSun` attribute. Using this data, add a method to determine the distance from any other planet (as suming planets are in a straight line from the sun)
- Give your solar system a formation year (in earth years).
- Define a method that returns the local year of the planet based on it's rotation since the beginning of the solar system

