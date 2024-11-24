package software.ulpgc.kata5;

import com.google.gson.Gson;

public class RandomUserDeserializer implements UserDeserializer{
    @Override
    public Object deserialize(String json) {
        return new Gson().fromJson(json, RandomUserGetResponse.class);
    }
}
