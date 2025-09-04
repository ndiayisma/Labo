public class Souris {

    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

    public static final int ESPERANCE_VIE = 36;


    public Souris(int poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = ESPERANCE_VIE;
        this.clonee = false;

        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 0;
        this.esperanceVie = ESPERANCE_VIE;
        this.clonee = false;

        System.out.println("Une nouvelle souris !");
    }
  

    
    @Override
    public String toString() {
        String result = "Une souris " + this.couleur;
        if(this.clonee){
            result += ", clonee";
        }
        result += " de " + this.age + " mois et pesant " + this.poids + " grammes";
        return result; 
     }

    

    

}