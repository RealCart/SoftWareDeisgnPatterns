package adapter.domain.usecases;

import adapter.core.domain.usecase.Useacse;
import adapter.core.utils.noParams.NoParams;
import adapter.domain.entites.UserEntity;
import adapter.domain.respositories.UserRepository;

public class GetUserUsecase implements Useacse<UserEntity, NoParams> {
    public GetUserUsecase(
            UserRepository repository
    ) {
        this.repository = repository;
    }

    final private UserRepository repository;

    @Override
    public UserEntity call(NoParams param) {
        return repository.getUser();
    }
}
