package string;

public class LearnString {
    public static void main(String[] args) {
        String name="Noor";
        String sameName="Noor";
        String newName = new String("Noor");
        String nName= new String("NOOR");
        System.out.println(name);
        System.out.println(newName);

//        if(name==sameName){
//            System.out.println("both are same");
//        }

//        if(name==newName){
//            System.out.println("both are same");
//        }else{
//            System.out.println("not same");
//        }

        if(name.equals(newName)){
            System.out.println("both are same");
        }else{
            System.out.println("not same");
        }

        if(name.equalsIgnoreCase(nName)){
            System.out.println("both are same");
        }else{
            System.out.println("not same");
        }
    }
}
