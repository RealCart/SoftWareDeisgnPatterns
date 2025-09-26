package adapter.domain.usecases;

import adapter.core.domain.usecase.Useacse;
import adapter.domain.entites.CreateUserReqParamsEntity;
import adapter.domain.entites.UserEntity;
import adapter.domain.respositories.UserRepository;

public class CreateUserUsecase implements Useacse<UserEntity, CreateUserReqParamsEntity> {
    public CreateUserUsecase(
            UserRepository respository
    ) {
        this.respository = respository;
    }

    final private UserRepository respository;

    @Override
    public UserEntity call(CreateUserReqParamsEntity param) {
        return respository.createUser(param);
    }
}
