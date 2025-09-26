package adapter.data.sources.remote;

import adapter.core.data.sources.remote.HttpService;
import adapter.data.mapper.UserMapper;
import adapter.data.models.UserModel;
import adapter.domain.entites.CreateUserReqParamsEntity;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;

public class UserRemoteImpl implements IUserRemote {
    public UserRemoteImpl(HttpService http) {
        this.http = http;
    }

    private final HttpService http;

    @Override
    public UserModel getUser() {
        try {
            final Object response = http.get();

            return UserMapper.fromJson((Map<String, Object>) response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public UserModel createUser(CreateUserReqParamsEntity params) {
        try {
            final Object response = http.post();

            return UserMapper.fromJson((Map<String, Object>) response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}