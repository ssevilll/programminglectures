public class EnumAbstract {
    public static void main(String[] args) {
        Response myResponse = Response.YES;
        System.out.println(myResponse.toString()); // YES
        // what does toString() method do? It returns the name of the enum constant, which is "YES" in this case.
        System.out.println(myResponse.asAzerbaijani()); // BƏLİ
    }
}

enum Response {
    YES {
        public String asAzerbaijani() {
            return "BƏLİ";
        }
        // can we write functions with -> ? No, we cannot write functions with the arrow syntax (->) in Java. 
    },
    NO {
        public String asAzerbaijani() {
            return "XEYR";
        }
    },
    CANCEL {
        public String asAzerbaijani() {
            return "LƏĞV";
        }
    };

    public abstract String asAzerbaijani();
    // The asAzerbaijani() method is an abstract method that must be implemented by each enum constant. It returns the Azerbaijani translation of the response.

}