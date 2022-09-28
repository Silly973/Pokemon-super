public class ElectricPokemon extends Pokemon {

    private String lightningColor;

    private String habit;

    public ElectricPokemon(String name, int level, int hp, String type, String sound, String food, String lightningColor, String habit) {
        super(name, level, hp, type, sound, food);

        this.lightningColor = lightningColor;
        this.habit = habit;
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats: " + getFood());
    }

   @Override
    public void speaks() {
        System.out.println(super.getName() + " says "+ getSound());
    }

    public void thunderPunch(){
        System.out.println(super.getName() + " strikes with a " + lightningColor + " thunderpunch !!!");
    }

    public void habit(){
        System.out.println("Has a habit of " + habit);
    }


    public String getLightningColor(){
        return lightningColor;
    }

    public String getHabit(){
        return habit;
    }

    public void setLightningColor(String lightningColor){
        this.lightningColor = lightningColor;
    }

    public void setHabit(String habit){
        this.habit = habit;
    }
}
