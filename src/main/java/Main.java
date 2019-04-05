import com.beust.jcommander.JCommander;

public class Main {
    public static void main(String args[]) {
        Args argsInstance = new Args();
        JCommander.newBuilder()
                .addObject(argsInstance)
                .build()
                .parse(args);
        argsInstance.getFile();
    }
}
