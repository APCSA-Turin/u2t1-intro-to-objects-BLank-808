public class catRunner{
public static void main (String[] arg){
    Cat cat1=new Cat("Diego",1,3);
    cat1.introduce();
    cat1.printCatInfo();
    Cat cat2=new Cat("Dio",7,4);
    cat2.printCatInfo();
    cat2.introduce();
}
}