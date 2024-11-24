package software.ulpgc.kata5;

public class Main {
    public static void main(String[] args) {
        UserLoader loader = new UserLoader(
                new RandomUserReader(),
                new RandomUserDeserializer(),
                new RandomUserAdapter()
        );
        for (int i = 0; i < 10; i++) {
            System.out.println(loader.get().name());
        }
    }
}
