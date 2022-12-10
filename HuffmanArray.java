/*
*02180201047
*Ahmet Zakir Sezginer
 */
package huffmanarray;

public class HuffmanArray {

    public static void main(String[] args) {
        
    int[] array = new int[]{12, 23, 15, 28, 13, 17, 76, 0};
System.out.println("Huffman Kodu:");
String[] huffmanarray = huffmanarray(array);
for (int i = 0; i < huffmanarray.length; i++) {
    if (array[i] > 0) {
        System.out.println(i + "] " + huffmanarray[i]);
    }
}
    }
    public static String[] huffmanarray(int[] array) {
    String[] codeage = new String[array.length];
    int value1;
    int value2;
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < array.length; i++) {
        codeage[i] = new String();
    }

    do {
        value1 = Integer.MAX_VALUE;
        value2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] < value1) {
                    value2 = value1;
                    value1 = array[index1 = i];
                } else if (array[i] < value2) {
                    value2 = array[index2 = i];
                }
            }
        }
        array[index1] = 0;
        array[index2] += value1;
        codeage[index1] = codeage[index1] + "0";
        codeage[index2] = codeage[index2] + "1";
    } while (value2 != Integer.MAX_VALUE);

    return codeage;

}
    
}
