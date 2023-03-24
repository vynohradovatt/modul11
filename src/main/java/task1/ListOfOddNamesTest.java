package task1;

import java.util.List;

public class ListOfOddNamesTest {

    public static void main(String[] args) {

        List<String> friends = List.of("Rachel", "Monika", "Phoebe", "Chandler", "Joe", "Ross", "Frank", "David");

        OddNumber oddNumber = new OddNumber();
        String oddNumbersOfList = oddNumber.getOddIndex(friends);
        System.out.println(oddNumbersOfList);

    }
}

