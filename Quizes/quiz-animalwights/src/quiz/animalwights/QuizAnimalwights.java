/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.animalwights;
import java.util.Scanner;
/**
 *
 * @author HP
 */

public class QuizAnimalwights {
static Scanner entrada= new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     String[] typesOfAnimals = {"amphibians","mammals","birds"};

        String[] animalSpecies = {"toad", "elephant", "toucan"};
        
        String[] weightAnimals = {"25kg", "100 kg", "75kg"};
        

        System.out.println("typesOfAnimal");
        for (String typesOfAnimalss : typesOfAnimals) {
            System.out.println("typesOfAnimal-->  " + typesOfAnimalss);
        }

        System.out.println("");
        System.out.println("AnimalEspecies");
        for (String AnimalEspeciess : animalSpecies) {
            System.out.println("AnimalEspecies -->  " + AnimalEspeciess);
        }
        System.out.println("weightAnimals");
        for (String weightAnimalss :weightAnimals ) {
            System.out.println("weightAnimal-->  " + weightAnimalss);
    }

 }
}
