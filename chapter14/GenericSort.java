package chapter14;

public class GenericSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Double[] doubles = {new Double(3), new Double(1.5), new Double(9.08)};
        printList(doubles);
        System.out.println();
        sort(doubles);
        
        printList(doubles);
    }
    public static void sort(Comparable[] list) {
        Comparable currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.length; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i].toString() + " ");
        }
    }
}
