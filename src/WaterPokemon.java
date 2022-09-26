public class WaterPokemon extends Pokemon{
    private String lightningColor;

    private boolean livesInTheWater;

    public WaterPokemon(String name, int level, int hp, String type, String sound, String food, String lightningColor, boolean livesInTheWater) {
        super(name, level, hp, type, sound, food);

        this.lightningColor = lightningColor;
        this.livesInTheWater = livesInTheWater;
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats " + getFood() + ", and eats them in the water" );
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says "+ getSound());
    }


    public void waterSwirl(){
        System.out.println(super.getName() + " strikes with a "+ lightningColor + " Waterswirl!!! ");
    }

    public void livesInTheWater() {
        if (livesInTheWater) {
            System.out.println(super.getName() + " lives in the water");
        } else {
            System.out.println(super.getName() + " doesn't live in the water");
        }
    }

    public String getLightningColor()
    {
        return lightningColor;
    }

    public boolean LivesInTheWater(){
        return livesInTheWater;
    }


    public void setLightningColor(String lightningColor){
        this.lightningColor = lightningColor;
    }



}
