package software.ulpgc.kata5;

public class UserLoader {
    private final UserReader userReader;
    private final UserDeserializer userDeserializer;
    private final UserAdapter userAdapter;

    public UserLoader(UserReader userReader, UserDeserializer userDeserializer, UserAdapter userAdapter) {
        this.userReader = userReader;
        this.userDeserializer = userDeserializer;
        this.userAdapter = userAdapter;
    }

    public User get(){
        return userAdapter.adapt(userDeserializer.deserialize(userReader.read()));
    }
}
