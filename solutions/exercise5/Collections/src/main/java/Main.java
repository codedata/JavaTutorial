import java.util.*;
import com.google.common.collect.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // List Demo
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<Integer> collector = 
            ImmutableList.<Integer>builder()
                         .add(10)
                         .addAll(numbers)
                         .build();

        out.println(collector.size()); // 4

        // Set Demo
        Set<String> admins = ImmutableSet.of("Justin", "caterpillar");
        Set<String> users = ImmutableSet.of("momor", "hamini", "Justin");

        out.println(admins.contains("Justin")); // 是否在站長群？true
        out.println(Sets.intersection(admins, users)); // 同時是站長群也是使用者群的？ [Justin]
        out.println(Sets.union(admins, users)); // 是站長群或是使用者群的？ [Justin, caterpillar, momor, hamini]
        out.println(Sets.difference(admins, users)); // 站長群但不使用者群的？ [caterpillar]
        out.println(Sets.symmetricDifference(admins, users)); // xor [caterpillar, momor, hamini]
        out.println(admins.containsAll(users));  // ∈，false
        out.println(users.containsAll(admins));  // false*/

        // Map Demo
        Map<String, Integer> passwords = ImmutableMap.of("Justin", 123456, "caterpillar", 93933);
        out.println(passwords.get("Justin")); // 123456
        out.println(passwords.entrySet()); // [Justin=123456, Hamimi=970221]
        out.println(passwords.keySet());   // [Justin, Hamimi]
        out.println(passwords.values());   // [123456, 970221]
    }
}