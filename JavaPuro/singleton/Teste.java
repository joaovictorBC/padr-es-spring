package JavaPuro.singleton;

public class Teste {
    public static void main(String[] args) {
        //Testes de design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
