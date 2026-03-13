class Rectangle{
    int length;
    int breadth;

    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    int area(){
        return length * breadth;
    }
    
    public Object clone(){
        return new Rectangle(length, breadth);
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Rectangle r = (Rectangle) obj;
        return length == r.length && breadth == r.breadth;
    }
}
class CloneTest{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = (Rectangle)r1.clone();
        System.out.println(r1==r2); // false
        System.out.println(r1.equals(r2)); // true
    }
}