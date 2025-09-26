package adapter.data.respositories;

import adapter.data.mapper.UserMapper;
import adapter.data.models.UserModel;
import adapter.data.sources.remote.IUserRemote;
import adapter.domain.entites.CreateUserReqParamsEntity;
import adapter.domain.entites.UserEntity;
import adapter.domain.respositories.UserRepository;

import java.util.concurrent.Future;

public class UserRepositoryImpl implements UserRepository {
    public UserRepositoryImpl(
            IUserRemote remote
    ) {
        this.remote = remote;
    }

    final private IUserRemote remote;

    @Override
    public UserEntity getUser() {
        try {
            final UserModel response = remote.getUser();

            return UserMapper.toEntity(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public UserEntity createUser(CreateUserReqParamsEntity params) {
        try {
            final UserModel response = remote.createUser(params);

            return UserMapper.toEntity(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
