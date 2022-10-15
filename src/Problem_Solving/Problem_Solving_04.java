package Problem_Solving;

public class Problem_Solving_04 {

    public void Delete_element() {
        int[] array = {3, 1, 0, 5, 3, 2};

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 3) {
                continue;
            }

            System.out.println(array[i]);

        }
    }
}
