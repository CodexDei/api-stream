package org.codexdei.api.stream.example.tests_exercises;

import java.util.*;

public class Materials {

    public static void main(String[] args) {

        List<String> yogurtMaterials = Arrays.asList("sugar","FreshFruit","VanillaExtract","Honey");
        List<String> avaibleMaterials = Arrays.asList("sugar","FreshFruit","Honey");

        boolean isMaterials = yogurtMaterials.stream()
                .allMatch(avaibleMaterials::contains);

        if(isMaterials){
            System.out.println("All the materials for the production are available");

        }else{
            System.out.println("Not all the materials for the production are available");
        }
    }
}
