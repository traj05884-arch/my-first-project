import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {
        Vector<String> xy = new Vector<>();

        xy.add("Apple");
        xy.add("Banana");
        xy.add("Cherry");

        System.out.println("Vector elements: " + xy);
        System.out.println("First Element: " + xy.firstElement());
        System.out.println("Last Element: " + xy.lastElement());

        xy.remove(1);  // removes "Banana"
        System.out.println("After removal: banana" + xy);

        xy.set(0, "Mango");  // updates "Apple" to "Mango"
        System.out.println("Updated Vector: " + xy);
    }
}