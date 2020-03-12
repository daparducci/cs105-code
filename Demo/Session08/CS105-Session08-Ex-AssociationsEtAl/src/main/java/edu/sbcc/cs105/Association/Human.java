package edu.sbcc.cs105.Association;

/**
 * Human
 */
public class Human {

    private Lactobacillus symbiotes;
    private GutHealth gutHealth;

    public Human(GutHealth initialGutHealth) {
        gutHealth = initialGutHealth;
        symbiotes = new Lactobacillus(this);
    }

    public void eat(Consumable item){

        if (item.getName().equals("Yogurt")){
            symbiotes.increase(); 
        } else if (item.getName().equals("Antibiotics")){
            symbiotes.decrease();
        }

    }

    public GutHealth getGutHealth(){

        return gutHealth;
    }

    void setGutHealth(GutHealth gutHealth){
        this.gutHealth = gutHealth;
    }
}