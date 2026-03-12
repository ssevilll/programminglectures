class test{
    public static void main(String args[]) {
     System.out.println("Hello World!");
    }

}
interface A{
    void show();
}
interface B{
    void grow();
}
class C implements A,B{
    public void show(){
        System.out.println("Hello");
    }
    public void grow(){
        System.out.println("World");
    }
}