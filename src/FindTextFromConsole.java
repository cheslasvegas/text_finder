

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTextFromConsole {
    public FindTextFromConsole() {
    }

    public static void main(String[] args) throws IOException {
        String str = null;
        Scanner in2 = new Scanner(System.in);
        ArrayList<String> Arr = new ArrayList();
        ArrayList<Integer> ArrIndex = new ArrayList();
        System.out.println("Enter the text");

        do {
            str = in2.nextLine();
            Arr.add(str);
        } while (!str.equals("end"));

        System.out.println("Text has been written!");
        System.out.println(Arrays.toString(Arr.toArray()));
        System.out.println("Enter the text is to be found");
        str = in2.nextLine();

        for (int i = 0; i < Arr.size() - 1; ++i) {
            if (((String) Arr.get(i)).contains(str)) {
                SearchByIteration((String) Arr.get(i), str, ArrIndex);
                System.out.print("String number " + i + " contains '" + str + "' at index(-es): ");
                System.out.println(Arrays.toString(ArrIndex.toArray()));
                ArrIndex.clear();
            }
        }

    }

    static void SearchByRecurs(String text, String str_to_search, ArrayList<Integer> arr) {
        if (text.contains(str_to_search)) {
            int index = text.indexOf(str_to_search);
            arr.add(Integer.valueOf(index));
            String ShortStr = text.substring(index + str_to_search.length());
            SearchByRecurs(ShortStr, str_to_search, arr);
        }
    }

    static void SearchByIteration(String text, String str_to_search, ArrayList<Integer> arr) {
        if (text.contains(str_to_search)) {
            int index;
            for (String ShortStr = text; ShortStr.contains(str_to_search); ShortStr = ShortStr.substring(index + str_to_search.length())) {
                index = ShortStr.indexOf(str_to_search);
                arr.add(Integer.valueOf(index));
            }

        }
    }

    static int FactByRecurs(int val) {
        return val == 1 ? 1 : (val == 0 ? 0 : val * FactByRecurs(val - 1));
    }

    static int FactByWhile(int val) {
        int sum = 1;
        if (val == 1) {
            return 1;
        } else if (val == 0) {
            return 0;
        } else {
            while (val > 1) {
                sum *= val;
                --val;
            }

            return sum;
        }
    }

    static int FactByFor(int val) {
        int sum = 1;
        if (val == 1) {
            return 1;
        } else if (val == 0) {
            return 0;
        } else {
            for (int i = val; i > 0; --i) {
                sum *= i;
            }

            return sum;
        }
    }
}
