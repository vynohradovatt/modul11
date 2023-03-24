package task2;

import java.util.List;

public class SortedListTests {

        public static void main(String[] args) {


            List<String> friends = List.of("Rachel", "Monika", "Phoebe", "Chandler", "Joe", "Ross");

            SortedList sorted = new SortedList();

            List<String> sortedFriends = sorted.getSorted(friends);

            System.out.println(sortedFriends.toString());

        }

}
