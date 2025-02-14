import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    private List<Integer> prefixProducts;

    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); // Initialize with 1 to handle edge cases
    }

    public void add(int num) {
        if (num == 0) {
            // Reset the list when a zero is added
            prefixProducts = new ArrayList<>();
            prefixProducts.add(1);
        } else {
            int lastProduct = prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProducts.size();
        if (k >= size) {
            // If k is greater than or equal to the size, it means there was a zero in the last k numbers
            return 0;
        }
        int lastProduct = prefixProducts.get(size - 1);
        int divisor = prefixProducts.get(size - k - 1);
        return lastProduct / divisor;
    }
}
