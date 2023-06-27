import java.util.Random;

public class ServerNameGeneration {

    private final static String[] = {"wombat", "potoroo", "kangaroo", "bandicoot", "quoll", "opossum", "billby", "numbat", "wallaby"};

    private final static String[] = {"radical", "tubular", "gnarly", "wicked", "groovy", "bland", "juicy", "wild", "sketchy", "worked"};

    private static String nameGen(){
        Random rando = new Random();
        int randomIndex = new Random().nextInt(nouns.length);
        String serverName = adj[randomIndex];
        randomIndex = rando.nextInt(nouns.length);
        return String.format("%s-%s,", serverName, nouns[randomIndex]);
    }
    public static void main(String[] args){
        System.out.println("Your server is name:%n%s%n", nameGen());
    }
}
