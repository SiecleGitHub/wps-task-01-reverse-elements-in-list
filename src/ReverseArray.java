// src/ReverseArray.java

// brew install openjdk
// export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
// vim ~/.zshrc
// java -version
// openjdk version "24.0.1" 2025-04-15
// OpenJDK Runtime Environment Homebrew (build 24.0.1)
// OpenJDK 64-Bit Server VM Homebrew (build 24.0.1, mixed mode, sharing)

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ReverseArray {

    public static <T> List<T> reverseList(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original: " + numbers);
        System.out.println("Reversed: " + reverseList(numbers));

        List<String> strings = Arrays.asList("a", "b", "c", "d");
        System.out.println("Original: " + strings);
        System.out.println("Reversed: " + reverseList(strings));
    }
}

// javac -d out src/ReverseArray.java
// java -cp out ReverseArray

// Ausgabe:
// Original: [1, 2, 3, 4, 5]
// Reversed: [5, 4, 3, 2, 1]
// Original: [a, b, c, d]
// Reversed: [d, c, b, a]