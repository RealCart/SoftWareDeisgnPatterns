package adapter.domain.respositories;

import adapter.domain.entites.CreateUserReqParamsEntity;
import adapter.domain.entites.UserEntity;

import java.util.concurrent.Future;

public interface UserRepository {
    UserEntity getUser();
    UserEntity createUser(CreateUserReqParamsEntity params);
}
