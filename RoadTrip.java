/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week3;

/**
 * Simulates basic recorded data about a road trip to Moab, Utah
 * @author jordanriskus
 */
public class RoadTrip {
    public static void main(String[] args) {

        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;

        // declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdomter = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;

        double legDistance; // declaring this variable but not initializing

        // simulation of roadtrip
        System.out.println("***Road trip simulator***");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdomter);
        System.out.println("I Have $" + cashOnHand + " to spend on this trip");
        System.out.println("String trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination Reached? " + destinationReached);

        // calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);

        // increment trip odometer by leg distance, over-write odometer
        tripOdomter = tripOdomter + legDistance;

        // subtract leg distance from distanceTo destination, over-write distance
        distanceToMoabUtah  = distanceToMoabUtah - legDistance;

        // "see" hitch hiker heading West
        System.out.println("Oh, look! A person who wants to go west, too!");

        // Check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            // alternative shorter version: currentNumberOfPassengers+
        } // closes if()

        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        // deduct $ spent on gas from money remaining and over write tripBudget
        cashOnHand = cashOnHand - gasPriceForLeg;

        // reprint adjusted variables
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdomter);
        System.out.println("I Have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
    
        // part 2 of exercise
        // set leg distance to 500 miles
        legDistance = 500.00;
        
        // simulate finding a pair of hitch hikers - decide if they can be picked up
        System.out.println("Oh, Two more WestBound travelers! Check car status");
        if(carFull == false) {
            System.out.println("Car is not full--picking up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        }

        // calculate fuel price of 500 miles
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Amount spent on gas leg 2: " + gasPriceForLeg);

        // print out stats after leg 2
        System.out.println();
        System.out.println("****Variable stats at end of the leg 2****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdomter);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);

        // leg 3 - remaining distance to Utah
        legDistance = distanceToMoabUtah - legDistance;

        // two more hitch hikers - not enough room
        System.out.println("More hitchers: another pair! Can we fit them?");

        int numHitchers = 2;
        if(currentNumberOfPassengers + numHitchers <= maxPassengers){
            System.out.println("Able to pick up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + numHitchers;
        } else  {
            System.out.println("Too many folks--can't take ya, sorry!");
        }

        // pay for gas for rest of trip - adjust cashOnHand
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Cash paid for gas on final leg: " + gasPriceForLeg);

        // arrive at destination - toggle boolean
        destinationReached = true;

        // print final stats
        System.out.println();
        System.out.println("****Variable stats at end of the leg 3****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdomter);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
    } // close main
} // close class RoadTrip
