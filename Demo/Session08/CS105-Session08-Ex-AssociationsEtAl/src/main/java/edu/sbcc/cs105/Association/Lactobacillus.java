package edu.sbcc.cs105.Association;

public class Lactobacillus {

	private Human human;
    private int lactobacillusLevel;

    public Lactobacillus(Human human) {
        this.human = human;

        switch (human.getGutHealth()){
            case Excellent:
                lactobacillusLevel = 10;
                break;
            case Good:
                lactobacillusLevel = 7;
                break;
            case Fair:
                lactobacillusLevel = 5;
                break;
            case Poor:
                lactobacillusLevel = 3;
        }
    }
    
    public void increase(){
        
        if (lactobacillusLevel < 10){
            lactobacillusLevel++;
            updateHumanHealth();
        }
    }

    public void decrease(){
        
        if (lactobacillusLevel > 0){
            lactobacillusLevel--;
            updateHumanHealth();
        }
    }

	public int getlevel() {
		return lactobacillusLevel;
    }
    
    private void updateHumanHealth(){

        GutHealth result;

       
        if (lactobacillusLevel >= 9){
            result = GutHealth.Excellent;
        } else if (lactobacillusLevel >= 7){
            result = GutHealth.Good;
        } else if (lactobacillusLevel >= 5){
            result = GutHealth.Fair;
        } else{
            result = GutHealth.Poor;
        }

        human.setGutHealth(result);

    }

}
