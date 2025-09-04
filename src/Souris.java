public class Souris {

    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

    public static final int ESPERANCE_VIE = 36;

    public Souris(int poids, String couleur, int age, int esperanceVie) {
        if(poids < 0) {
            throw new IllegalArgumentException("Le poids ne peut pas être négatif");
        }else{
            this.poids = poids;
        }
        if(age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif");
        }else{
            this.age = age;
        }
        this.couleur = couleur;
        if(esperanceVie < 0) {
            throw new IllegalArgumentException("L'espérance de vie ne peut pas être négative");
        }else{
            this.esperanceVie = esperanceVie;
        }
        this.clonee = false;
        
        System.out.println("Une nouvelle souris !");
        
    }

    public Souris(int poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = ESPERANCE_VIE;
        this.clonee = false;

        System.out.println("Une nouvelle souris !");
    }

    
  

    public Souris(Souris s2) {
        this.poids = s2.getPoids();
        this.couleur = s2.getCouleur();
        this.age = s2.getAge();
        this.esperanceVie = (s2.getEsperanceVie()*4)/5;
        this.clonee = true;

        System.out.println("Une nouvelle souris clonée !");
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

    public int getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isClonee() {
        return clonee;
    }

    public int getAge() {
        return age;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    

}