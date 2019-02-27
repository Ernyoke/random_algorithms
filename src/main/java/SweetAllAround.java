import javafx.util.Pair;

import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SweetAllAround {
    public static Pair<Integer, Integer> solve(List<Pair<Integer, Integer>> students) {
        int maxStudentsSatisfied = 0;
        int numberOfCandies = 0;
        TreeSet<Pair<Integer, Integer>> orderedStudents = new TreeSet<>((a, b) -> a.getKey() - b.getKey());
        students.forEach(student -> orderedStudents.add(student));
        PriorityQueue<Pair<Integer, Integer>> currentStudentsSatisfied = new PriorityQueue<>((a, b) -> {
            return a.getValue() - b.getValue();
        });
        for (Pair<Integer, Integer> student : orderedStudents) {
            while(currentStudentsSatisfied.size() > 0 && currentStudentsSatisfied.peek().getValue() < student.getKey()) {
                currentStudentsSatisfied.poll();
            }
            currentStudentsSatisfied.offer(student);
            if (currentStudentsSatisfied.size() > maxStudentsSatisfied) {
                maxStudentsSatisfied = currentStudentsSatisfied.size();
                numberOfCandies = student.getKey();
            }
        }
        return new Pair<>(numberOfCandies, maxStudentsSatisfied);
    }
}
