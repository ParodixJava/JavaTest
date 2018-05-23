public class Personage {
    private int hp;
    private int mana;
    private int damage;
    private String name;

    public Personage(){
        this.hp=100;
        this.mana=100;
        this.name="bob";
        this.damage=20;
    }

    public  Personage(String name){
        this.hp=100;
        this.mana=100;
        this.name=name;
        this.damage=20;
    }

    public void direBonjour() {
        System.out.println("\nNom : "+ name);
        System.out.println("HP : "+ hp);
        System.out.println("Mana : "+ mana);
        System.out.println("damage : "+ damage);
    }

    public void taper(Personage ennemie){
        ennemie.hp -= this.damage;
    }

    public void doubleTape(Personage ennemie){
        ennemie.hp -= 2*this.damage;
    }


}
