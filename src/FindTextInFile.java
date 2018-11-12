
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTextInFile {
    static boolean flag = false;

    public FindTextInFile() {
    }

    public static void main(String[] args) throws IOException {
        while (!flag) {
            FindText();
        }

    }

    public static void FindText() throws IOException {
        String src_file = null;
        Scanner in2 = new Scanner(System.in);
        ArrayList<Integer> ArrIndex = new ArrayList();
        System.out.println("Enter the file in which you wanna find the text:");
        src_file = in2.nextLine();
        StringBuilder builder = new StringBuilder();
        FileInputStream fis = null;
        boolean var16 = false;

        String text_to_find;
        String res;
        String text;
        label206:
        {
            try {
                var16 = true;
                fis = new FileInputStream(src_file);

                int data;
                while ((data = fis.read()) != -1) {
                    builder.append((char) data);
                }

                var16 = false;
                break label206;
            } catch (IOException var20) {
                var20.printStackTrace();
                var16 = false;
            } finally {
                if (var16) {
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException var17) {
                            var17.printStackTrace();
                        }
                    }

                    System.out.println("File Contents: ");
                    System.out.println("_______________");
                    System.out.println(builder.toString());
                    System.out.println("_______________");
                    System.out.println("Enter the text to be found:");
                    text_to_find = in2.nextLine();
                    String text2 = builder.toString();
                    String res2;
                    if (text2.contains(text_to_find)) {
                        FindTextFromConsole.SearchByIteration(text2, text_to_find, ArrIndex);
                        System.out.println("Text has been found on the next position index(-es): " + Arrays.toString(ArrIndex.toArray()));
                        System.out.println("Total count of matches: " + ArrIndex.size());
                        ArrIndex.clear();
                        System.out.println("Try again? Press 'yes' to continue or 'no' to exit.");
                        res2 = in2.nextLine();
                        if (res2.equals("yes")) {
                            flag = false;
                        } else if (res2.equals("no")) {
                            flag = true;
                        }
                    } else {
                        System.out.println("Text hasn`t been found!");
                        System.out.println("Try again? Press 'yes' to continue or 'no' to exit.");
                        res2 = in2.nextLine();
                        if (res2.equals("yes")) {
                            flag = false;
                        } else if (res2.equals("no")) {
                            flag = true;
                        }
                    }

                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException var18) {
                    var18.printStackTrace();
                }
            }

            System.out.println("File Contents: ");
            System.out.println("_______________");
            System.out.println(builder.toString());
            System.out.println("_______________");
            System.out.println("Enter the text to be found:");
            text_to_find = in2.nextLine();
            text = builder.toString();
            if (text.contains(text_to_find)) {
                FindTextFromConsole.SearchByIteration(text, text_to_find, ArrIndex);
                System.out.println("Text has been found on the next position index(-es): " + Arrays.toString(ArrIndex.toArray()));
                System.out.println("Total count of matches: " + ArrIndex.size());
                ArrIndex.clear();
                System.out.println("Try again? Press 'yes' to continue or 'no' to exit.");
                res = in2.nextLine();
                if (res.equals("yes")) {
                    flag = false;
                } else if (res.equals("no")) {
                    flag = true;
                    return;
                }

                return;
            } else {
                System.out.println("Text hasn`t been found!");
                System.out.println("Try again? Press 'yes' to continue or 'no' to exit.");
                res = in2.nextLine();
                if (res.equals("yes")) {
                    flag = false;
                } else if (res.equals("no")) {
                    flag = true;
                    return;
                }

                return;
            }
        }

        if (fis != null) {
            try {
                fis.close();
            } catch (IOException var19) {
                var19.printStackTrace();
            }
        }

        System.out.println("File Contents: ");
        System.out.println("_______________");
        System.out.println(builder.toString());
        System.out.println("_______________");
        System.out.println("Enter the text to be found:");
        text_to_find = in2.nextLine();
        text = builder.toString();
        if (text.contains(text_to_find)) {
            FindTextFromConsole.SearchByIteration(text, text_to_find, ArrIndex);
            System.out.println("Text has been found on the next position index(-es): " + Arrays.toString(ArrIndex.toArray()));
            System.out.println("Total count of matches: " + ArrIndex.size());
            ArrIndex.clear();
            System.out.println("Try again? Press 'yes' to continue or 'no' to exit.");
            res = in2.nextLine();
            if (res.equals("yes")) {
                flag = false;
            } else if (res.equals("no")) {
                flag = true;
            }
        } else {
            System.out.println("Text hasn`t been found!");
            System.out.println("Try again? Press 'yes' to continue or 'no' to exit.");
            res = in2.nextLine();
            if (res.equals("yes")) {
                flag = false;
            } else if (res.equals("no")) {
                flag = true;
            }
        }

    }
}
