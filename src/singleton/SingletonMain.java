package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton st = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        System.out.println(st.toString());
        System.out.println(st2.toString());

        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
    }

}

