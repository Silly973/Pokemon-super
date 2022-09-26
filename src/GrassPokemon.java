public class GrassPokemon extends Pokemon{
    private String lightningColor;

    private String leafs;

    public GrassPokemon(String name, int level, int hp, String type, String sound, String food, String lightningColor, String leafs) {
        super(name, level, hp, type, sound, food);

        this.lightningColor = lightningColor;
        this.leafs = leafs;
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats: " + getFood());
    }

    @Override
    public void speaks() {
        System.out.println(super.getName() + " says "+ getSound());
    }

    public void plantSlam(){
        System.out.println(super.getName() + " strikes with a " + lightningColor + " Plantslam!!! ");
    }

    public void leafs(){
        System.out.println(super.getName() + " has a lot of " + leafs);
    }

    public String getLightningColor(){
        return lightningColor;
    }

    public String getLeafs(){
        return leafs;
    }


    public void setLightningColor(String lightningColor){
        this.lightningColor = lightningColor;
    }

    public void setLeafs(String leafs){
        this.leafs= leafs;
    }

}
