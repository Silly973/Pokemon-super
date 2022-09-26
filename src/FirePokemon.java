public class FirePokemon extends Pokemon{

    private String lightningColor;

    private String temperature;

    private int celsius;

    public FirePokemon(String name, int level, int hp, String type, String sound, String food, String lightningColor, String temperature, int celsius) {
        super(name, level, hp, type, sound, food);

        this.lightningColor = lightningColor;
        this.temperature = temperature;
        this.celsius = celsius;
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says "+ getSound() + "!!!!");
    }

    public void fireBolt(){
        System.out.println(super.getName() + " strikes with a "+ lightningColor + " firebolt!!! ");
    }

    public void temperature(){
        System.out.println(super.getName() + " his temperature is " + temperature);
    }

    public void celsius(){
        System.out.println("And can get up to " + celsius + " degrees");
    }

    public void setCelsius(){
        System.out.println("more then " + celsius + " degrees");
    }

    public String getLightningColor(){
        return lightningColor;
    }

    public String getTemperature(){
        return temperature;
    }
    public int getCelsius(){
        return celsius;
    }


    public void setLightningColor(String lightningColor){
        this.lightningColor = lightningColor;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setCelsius(int celsius){
        this.celsius = celsius;
    }


}

