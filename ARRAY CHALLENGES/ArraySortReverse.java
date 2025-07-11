import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        String[] pallets = {"B14", "A11", "B12", "A13"};
        System.out.println("Original.....");
        for (String pallet : pallets) {
            System.out.print("--" + pallet);
        }

        System.out.println("\n\nSorting.....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.print("--" + pallet);
        }

        System.out.println("\n\nReversed.....");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet : palletList) {
            System.out.print("--" + pallet);
        }
    }
}
