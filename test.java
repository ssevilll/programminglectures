class test{
    public static void main(String args[]) {
     System.out.println("Hello World!");
        C obj = new C();
        obj.show();
        obj.grow();
        obj.display();
    }

}
interface A{
    void show();
    default void display(){ // hem default hem static hem abstract olmur.
        //default methodlar interface icinde body alabilirler.
        System.out.println("Welcome");
    }
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
    // display methodunu override etmedik cunku default olarak interface icinde tanimladik.
    // is it like inheriting parent class method? Yes, it is like inheriting parent class method.
}