package adapter.data.sources.remote;

import adapter.data.models.UserModel;
import adapter.domain.entites.CreateUserReqParamsEntity;

import java.util.concurrent.Future;

public interface IUserRemote {
    UserModel getUser();
    UserModel createUser(CreateUserReqParamsEntity params);
}
