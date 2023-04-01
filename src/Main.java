import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(8);

        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !duplicates.contains(list.get(i))) {
                    duplicates.add(list.get(i));
                }
            }
        }

        System.out.println("Original ArrayList: " + list);
        System.out.println("Duplicate values in ArrayList: " + duplicates);

    }
}