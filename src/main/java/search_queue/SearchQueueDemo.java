package search_queue;

import java.util.*;

/**
 * Поиск в ширину: сложность алгоритма O(V+E)
 * где V - количество вершин
 * E - количество ребер
 *
 */
public class SearchQueueDemo {

    public static void main(String[] args) {
        Person you = new Person("you", false);
        Person bob = new Person("bob", false);
        Person alice = new Person("alice", false);
        Person claire = new Person("claire", false);
        Person anuj = new Person("anuj", false);
        Person peggy = new Person("peggy", true);
        Person thom = new Person("thom", false);
        Person jonny = new Person("jonny", true);

        Map<Person, List<Person>> relation = new HashMap<>();

        relation.put(you, Arrays.asList(alice, bob, claire));
        relation.put(bob, Arrays.asList(anuj, peggy));
        relation.put(alice, Collections.singletonList(peggy));
        relation.put(claire, Arrays.asList(thom, jonny));
        relation.put(anuj, new ArrayList<>());
        relation.put(peggy, new ArrayList<>());
        relation.put(thom, new ArrayList<>());
        relation.put(jonny, new ArrayList<>());

        System.out.println(searchSeller(you, relation));

    }

    private static Person searchSeller(Person you, Map<Person, List<Person>> relation) {
        Deque<Person> deque = new ArrayDeque<>(relation.get(you));
        List<Person> searched = new ArrayList<>();
        Person seller = null;
        while (!deque.isEmpty()) {
            Person p = deque.pollFirst();
            if (!searched.contains(p) && p.isSeller()) {
                seller = p;
                break;
            } else {
                searched.add(p);
                deque.addAll(relation.get(p));
            }
        }
        return seller;
    }
}

class Person {

    private String name;

    private boolean isSeller;

    Person(String name, boolean isSeller) {
        this.name = name;
        this.isSeller = isSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSeller() {
        return isSeller;
    }

    public void setSeller(boolean seller) {
        isSeller = seller;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
