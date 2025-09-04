import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Souris> souris = new ArrayList<Souris>();
        souris.add(new Souris(50, "blanche", 2));
        souris.add(new Souris(45, "grise"));
        souris.add(new Souris(souris.get(1)));
        for(Souris s : souris){
            System.out.println(s);
        }



        /*Souris s1 = new Souris(50, "blanche", 2);
        Souris s2 = new Souris(45, "grise");
        Souris s3 = new Souris(s2);
        Souris s4 = new Souris(s3);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        s1.vieillir();
        s1.vieillir();
        System.out.println(s1);
        
        s1.evolue();
        s2.evolue();
        s3.evolue();
        s4.evolue();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);*/
                
    }
}
