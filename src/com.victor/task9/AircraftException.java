package com.victor.task9;

public class AircraftException {

    static void validateSeats(int capacity, int totalSeats) throws IllegalArgumentException {
        if (capacity < totalSeats) {
            throw new IllegalArgumentException("Capacity (" + capacity + ") " +
                    "cannot be less than total seats (" + totalSeats + ").");
        }
        System.out.println("Seats valid: " + totalSeats + "/" + capacity);
    }

    public static void main(String[] args) {
        try {
            validateSeats(120, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled Error: " + e.getMessage());
        } finally {
            System.out.println("Validation finished.");
        }
    }
}
