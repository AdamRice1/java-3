package lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Animals {

    static List<String> animals = Arrays.asList("peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        List<String> cleaned = capsFirst(animals, true);
        System.out.println("name is fixed " + cleaned);

        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");

        System.out.println(animals);

        List<String> lowered = lowerFirst(animals,false);
        System.out.println("name is now lower case " + lowered);

        

    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {

        if (mutate) {
            ArrayList<String> animalList2 = (ArrayList<String>) animaList.stream().map(s -> {
                String ns;
                ns = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
                return ns;
            }).collect(Collectors.toList());
            return animalList2;
        }
        else {
            ArrayList<String> animalList2 = (ArrayList<String>) animaList.stream().map(s -> {
                String ns;
                ns = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
                return ns;
            }).collect(Collectors.toList());
            animaList = animalList2;
            return animaList;
        }
    }

    static String addAnimal(String animal) {
        List<String> newAnimalList = new ArrayList<>(animals);
        newAnimalList.add(animal);
        animals = newAnimalList;
        return animal;
    };


    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        ArrayList<String> animalsCopy = (ArrayList<String>) animaList.stream().map(a -> {
            String newAnimal;
            newAnimal = a.substring(0, 1).toLowerCase() + a.substring(1).toUpperCase();
            return newAnimal;
        }).collect(Collectors.toList());

        if (mutate) {
            System.out.println("true");
            animaList = animalsCopy;
            return animaList;
        } else {
            System.out.println("false");
            return animalsCopy;
        }
    }

    static List<String> flipAnimals(boolean mutate) {

        List<String> instructions = Arrays.asList("Flip","the","animals","list","."," ","Mutate","the","animals","only","if","flag","true");
        return instructions;
    }

    static List<String> sortAnimals(boolean mutate) {
        return animals;
    }


}
