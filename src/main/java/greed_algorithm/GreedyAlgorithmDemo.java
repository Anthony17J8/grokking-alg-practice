package greed_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GreedyAlgorithmDemo {

  public static void main(String[] args) {
    Set<String> statesNeeded =
        new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

    Map<String, Set<String>> stations = new HashMap<>();
    stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
    stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
    stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
    stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
    stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

    Set<String> finalStations = searchStation(statesNeeded, stations);
    System.out.println(finalStations);
  }

  private static Set<String> searchStation(Set<String> statesNeeded,
      Map<String, Set<String>> stations) {
    String bestStation = "";
    Set<String> finalStations = new HashSet<>();
    Set<String> statesCovered = new HashSet<>();
    while (!statesNeeded.isEmpty()) {
      statesCovered.clear();

      for (Map.Entry<String, Set<String>> entries : stations.entrySet()) {
        Set<String> temp = new HashSet<>(statesNeeded);
        temp.retainAll(entries.getValue());
        if (temp.size() > statesCovered.size()) {
          bestStation = entries.getKey();
          statesCovered = temp;
        }
      }

      statesNeeded.removeAll(statesCovered);
      finalStations.add(bestStation);
    }
    return finalStations;
  }
}
