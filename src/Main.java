public class Main {
//stap 2: maak een main methode aan:
    public static void main(String[] args) {

//stap 5: instantieer de 4 pokemons binnen de Main
        Pokemon pikachu = new ElectricPokemon("Pikachu", 120, 500, "electric", "pika pika", "pokebrocks", "yellow","being quite busy");
        Pokemon bayleaf = new GrassPokemon("Bayleaf", 100, 450, "grass", "wheeeeee !!!","leafs", "green", "leafs" );
        Pokemon horsea = new WaterPokemon("Horsea", 150, 500, "water", "swishhhhh","waterbeans", "blue", true);
        Pokemon flareon = new FirePokemon("Flareon", 200, 500, "fire", "flaaaame", "firebrickets", "red", "veryyyyyy hot!!!", 1000);


        System.out.println("The first pokemon is: " + pikachu.getName());
        System.out.println("level is: " + pikachu.getLevel());
        System.out.println("hp is: " + pikachu.getHp());
        System.out.println("type: " + pikachu.getType());
        ((ElectricPokemon) pikachu).thunderPunch();
        ((ElectricPokemon) pikachu).habit();
        pikachu.eats();
        pikachu.speaks();
        System.out.println("-----------------");



        System.out.println("The second pokemon is: " + bayleaf.getName());
        System.out.println("level is: " + bayleaf.getLevel());
        System.out.println("hp is: " + bayleaf.getHp());
        System.out.println("type: " + bayleaf.getType());
        ((GrassPokemon) bayleaf).leafs();
        ((GrassPokemon) bayleaf).plantSlam();
         bayleaf.eats();
         bayleaf.speaks();
         System.out.println("-----------------");

        System.out.println("The third pokemon is: " + horsea.getName());
        System.out.println("level is: " + horsea.getLevel());
        System.out.println("hp is: " + horsea.getHp());
        System.out.println("type: " + horsea.getType());
        ((WaterPokemon) horsea).livesInTheWater();
        ((WaterPokemon) horsea).waterSwirl();
        horsea.eats();
        horsea.speaks();
        System.out.println("-----------------");

        System.out.println("The fourth pokemon is: " + flareon.getName());
        System.out.println("level is: " + flareon.getLevel());
        System.out.println("hp is: " + flareon.getHp());
        System.out.println("type: " + flareon.getType());
        ((FirePokemon) flareon).temperature();
        ((FirePokemon) flareon).celsius();
        ((FirePokemon) flareon).fireBolt();
        flareon.eats();
        flareon.speaks();
        System.out.println("-----------------");



    }
}
