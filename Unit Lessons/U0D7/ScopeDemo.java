public class ScopeDemo {
    private String world = "World"; // instance variable are global
    public static void main(String[] args) {
        
    }
    
    public String method2() {
        String hello = "Hello";
        String goodbye = "";
        if (true) {
            goodbye = "Goodbye";
        }

        System.out.println(goodbye);

        return hello;
    }

    public String method1() {
        return method2() + world;
    }
}
