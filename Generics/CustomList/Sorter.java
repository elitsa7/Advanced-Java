package AdvancedExercise.Generics.CustomList;

import AdvancedExercise.Generics.CustomList.CustomList;

public class Sorter {
    public static <T extends Comparable<T>>void sort (CustomList<T> list){
        for (int i = 0; i < list.getSize(); i++) {
            T current = list.get(i);
            for (int j = i + 1; j < list.getSize(); j++) {
                if (current.compareTo(list.get(j)) > 0){
                    list.swap(i, j);
                }
            }
        }
    }
}
