package tema7.ejercicio5;

public class Ejercicio5Test {
    public static void main(String[] args) {
        HashMapCrud hashMapCrud = new HashMapCrud();
        hashMapCrud.create("key1", "value1");
        hashMapCrud.create("key2", "value2");
        hashMapCrud.create("key3", "value3");
        hashMapCrud.create("key4", "value4");
        hashMapCrud.create("key5", "value5");

        System.out.println(hashMapCrud.read("key1"));
        System.out.println(hashMapCrud.read("key2"));
        System.out.println(hashMapCrud.read("key3"));
        System.out.println(hashMapCrud.read("key4"));
        System.out.println(hashMapCrud.read("key5"));

        hashMapCrud.update("key1", "value1Updated");
        hashMapCrud.update("key2", "value2Updated");
        hashMapCrud.update("key3", "value3Updated");
        hashMapCrud.update("key4", "value4Updated");
        hashMapCrud.update("key5", "value5Updated");

        System.out.println(hashMapCrud.read("key1"));
        System.out.println(hashMapCrud.read("key2"));
        System.out.println(hashMapCrud.read("key3"));
        System.out.println(hashMapCrud.read("key4"));
        System.out.println(hashMapCrud.read("key5"));

        hashMapCrud.borrar("key1");
        hashMapCrud.borrar("key2");
        hashMapCrud.borrar("key3");
        hashMapCrud.borrar("key4");
        hashMapCrud.borrar("key5");

        System.out.println(hashMapCrud.read("key1"));
        System.out.println(hashMapCrud.read("key2"));
        System.out.println(hashMapCrud.read("key3"));
        System.out.println(hashMapCrud.read("key4"));
        System.out.println(hashMapCrud.read("key5"));
    }
}
