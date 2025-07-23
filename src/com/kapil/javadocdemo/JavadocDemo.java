package com.kapil.javadocdemo;

/**
 * Program to demonstrate how to generate HTML API documentation from Java source files using the Javadoc tool.
 * Demonstrates the use of Javadoc comments to document classes, methods, and their parameters.
 *
 * @author Kapil Garg
 */
public class JavadocDemo {

    /**
     * Default constructor that prints a welcome message to the console.
     */
    public JavadocDemo() {
        System.out.println("Hello from JavadocDemo");
    }

    /**
     * The main() method executes the program and calls the {@link #calculateCube(long)} method with different values.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n*** Javadoc Demo ***\n");
        System.out.println("The Cube of 5 is :: " + calculateCube(5));
        System.out.println("The Cube of 7 is :: " + calculateCube(7));
        System.out.println("The Cube of 9 is :: " + calculateCube(9));
    }

    /**
     * Calculates the cube of the given number.
     * <p>
     * The cube of a number is the number multiplied by itself three times.
     * Example usage: {@code calculateCube(3)} returns {@code 27}.
     *
     * @param number The number for which to calculate the cube.
     * @return The cube of the input number.
     * @see Math#pow(double, double)
     */
    public static long calculateCube(long number) {
        return number * number * number;
    }

}
