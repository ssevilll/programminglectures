
import java.util.List;

public class PECSrule {
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        // the PECS rule stands for "Producer Extends, Consumer Super". It is a
        // guideline for using wildcards in Java generics to ensure type safety and
        // flexibility in code. The rule states that if a generic type is producing
        // (i.e., returning) values, we should use an upper bounded wildcard (<? extends
        // T>) to allow for flexibility in the types that can be returned. If a generic
        // type is consuming (i.e., accepting) values, we should use a lower bounded
        // wildcard (<? super T>) to allow for flexibility in the types that can be
        // accepted. In this example, the copy method takes a destination list that can
        // accept any type that is a superclass of T (using <? super T>) and a source
        // list that can produce any type that is a subclass of T (using <? extends T>).
        // This allows us to copy elements from the source list to the destination list
        // while maintaining type safety and flexibility in our code.
        for (T item : src) {
            dest.add(item);
        }
        // source is extening T, so it can produce T or any subclass of T, which means
        // we can safely read items from the source list and add them to the destination
        // list, which can accept T or any superclass of T.

        // destination is super of T, so it can consume T or any subclass of T, which
        // means we can safely add items of type T to the destination list, as it can
        // accept T or any superclass of T.
    }
}
