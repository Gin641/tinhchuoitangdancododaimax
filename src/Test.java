import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < st.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(st.charAt(i));
            for (int j = i + 1;j < st.length();j++){
                if (st.charAt(j) > list.getLast()){
                    list.add(st.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max){
            System.out.print(ch);
        }
    }
}
