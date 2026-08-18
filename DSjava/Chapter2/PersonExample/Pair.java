package Aprendizado.DSjava.Chapter2.PersonExample;

public class Pair <K,V>{
    public K key;
    public V value;
        public void set(K k, V v){
            key = k;
            value = v;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
            return value;
    }
    public String toString(){
            return " [" + getKey() + ", " + getValue() + "]";
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>();
        pair1.set("height", 36);
        System.out.println(pair1);
        Pair<Student,Double> pair2 = new Pair<>();
        pair2.set(new Student("A5976","Sue",19),(9.5));
        System.out.println(pair2);
    }
}
