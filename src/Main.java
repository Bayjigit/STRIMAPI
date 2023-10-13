/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("Оля", "Юлия");


        List<String> result = originalList.stream()
                .map(name -> "->(" + name + " " + name + ", " + name + " " + name + ")")
                .collect(Collectors.toList());


        System.out.println(result);
    }
}*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};


        List<Integer> integerList = Arrays.asList(integerArray);


        List<Integer> modifiedList = integerList.stream()
                .map(num -> num % 3 == 0 ? 0 : num)
                .collect(Collectors.toList());


        modifiedList = modifiedList.stream()
                .map(num -> num == 0 ? 10 : num)
                .collect(Collectors.toList());

        System.out.println(modifiedList);
    }
}