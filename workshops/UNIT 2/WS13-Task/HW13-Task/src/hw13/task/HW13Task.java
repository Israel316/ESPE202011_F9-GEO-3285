/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw13.task;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner data = new Scanner(System.in);
         boolean mainLoop = true;
        int option;   
        System.out.println("Santiago Arteaga");
        
        System.out.println("rhombus area ");
        System.out.println("Enter the more diagonal (cm): ");
        float majorDiagonal = data.nextInt();
        System.out.println("Enter the minor diagonal (cm): ");
        float minorDiagonal = data.nextInt();
        float rhrombusArea;
        rhrombusArea = countRhombusArea(majorDiagonal, minorDiagonal);
        System.out.println("The rhombus area is: " + rhrombusArea + " cm² \n");
        
        System.out.println("circle area: ");
        System.out.println("Enter radio (cm): ");
        float radio = data.nextInt();
        float circleArea;
        circleArea = countCircleArea(radio);
        System.out.println("The circle area is: " + circleArea + " cm² \n");
        
        System.out.println("cone truncated area ");
        System.out.println("Enter radio (cm): ");
        float radio1 = data.nextInt();
        System.out.println("Enter the aperture (cm): ");
        float aperture = data.nextInt();
        float coneArea;
        coneArea = countConeTruncatedArea(radio, aperture);
        System.out.println("The circle area is: " + coneArea + " cm² \n");
        
        System.out.println("rectilinear motion ");
        System.out.println("Enter initial position (m): ");
        float initialPosition = data.nextInt();
        System.out.println("Enter the time (s) : ");
        float time = data.nextInt();
        System.out.println("Enter acceleration (m/s²): ");
        float acceleration = data.nextInt();
        System.out.println("Enter initial speed (m/s): ");
        float initialSpeed = data.nextInt();
        float position;
        position = countRectilinearMotion(initialPosition, time, acceleration, initialSpeed);
        System.out.println("The position is: " + position + " m \n");
        
        System.out.println("force formula: ");
        System.out.println("Enter mass (kg): ");
        float mass = data.nextInt();
        System.out.println("Enter acceleration (m/s²): ");
        float acceleration1 = data.nextInt();
        float force;
        force = countForceFormula(mass, acceleration1);
        System.out.println("The force is: " + force + " N \n");
        
        System.out.println("kinety energy: ");
        System.out.println("Enter mass (kg): ");
        float mass1 = data.nextInt();
        System.out.println("Enter speed (m/s): ");
        float speed = data.nextInt();
        float kineticEnergy;
        kineticEnergy = countKineticEnergy(mass1, speed);
        System.out.println("The kinetic energy is: " + kineticEnergy + " J");
        
        

    }
//Area geometric figures:

    public static float countRhombusArea(float majorDiagonal, float minorDiagonal) {
        float rhrombusArea = 0.00F;
        rhrombusArea = (majorDiagonal * minorDiagonal) / 2;
        return rhrombusArea;
    }

    public static float countCircleArea(float radio) {
        float pi = 3.141592654F;
        float areaCircle = 0.00F;
        areaCircle = pi * radio * radio;
        return areaCircle;
    }

    public static float countConeTruncatedArea(float radio, float aperture) {
        float pi = 3.141592654F;
        float coneArea = 0.00F;
        coneArea = pi * radio * (radio + aperture);
        return coneArea;
    }
//Physics formulas

    public static float countRectilinearMotion(float initialPosition, float time, float acceleration, float initialSpeed) {
        float position = 0.00F;
        position = initialPosition + initialSpeed * time + (acceleration * time * time) / 2;
        return position;
    }

    public static float countForceFormula(float mass, float acceleration) {
        float force = 0.00F;
        force = mass * acceleration;
        return force;
    }

    public static float countKineticEnergy(float mass, float speed) {
        float kineticEnergy = 0.00F;
        kineticEnergy = (mass * speed * speed) / 2;
        return kineticEnergy;
    }

}
        
     

