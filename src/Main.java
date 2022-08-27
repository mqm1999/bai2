import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] array = {8, 6, 7, 9, 10};
        int[] indexArray = {0, 2, 1, 1, 0};
        List<IntegerMap> integerMapList = main.createIntegerMap(array, indexArray);
        Collections.sort(integerMapList);
        for (IntegerMap integerMap : integerMapList) {
            System.out.println(integerMap);
        }
        integerMapList = main.swapPosition(integerMapList);
        for (IntegerMap integerMap : integerMapList) {
            System.out.println(integerMap);
        }

    }

    // create object (like map): value - amount of no b4
    public List<IntegerMap> createIntegerMap(int[] array, int[] indexArray) {
        List<IntegerMap> integerMapList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            IntegerMap integerMap = new IntegerMap(array[i], indexArray[i]);
            integerMapList.add(integerMap);
        }
        return integerMapList;
    }

    public List<IntegerMap> swapPosition(List<IntegerMap> integerMapList) {
        IntegerMap integerMap;
        int index;
        for (Iterator<IntegerMap> it = integerMapList.iterator(); it.hasNext(); ) {
            // check iterator
            IntegerMap integerMap1 = it.next();
            integerMap = integerMap1;
            index = integerMapList.indexOf(integerMap1);
            it.remove();
            integerMapList.add(index + integerMap.getAmountLargerValue(), integerMap);
        }
        return integerMapList;
    }
}
