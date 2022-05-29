package dataStructure.chapter01.implArray;

public class Main {

    public static void main(final String[] args) {

        ArrayListImpl<Integer> array = new ArrayListImpl<>();
        System.out.println(array.size());
        System.out.println(array.isEmpty());
        array.add(1);
        array.add(2);
        array.add(3);
        array.remove(0);
        System.out.println(array.size());
        System.out.println(array.isEmpty());
        array.add(1, 0);
        System.out.println(array.size());
        System.out.println(array.get(0));

    }
}
