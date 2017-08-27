package Singleton;

/**
 * Created by mayankpersonal on 28/08/17.
 */
public class SingletonRunner {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton);
    }
}
