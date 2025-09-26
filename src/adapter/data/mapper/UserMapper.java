package adapter.data.mapper;

import adapter.data.models.UserModel;
import adapter.domain.entites.UserEntity;

import java.util.Map;

public class UserMapper {
    public static UserModel fromJson(Map<String, Object> json) {
        UserModel userModel = new UserModel(
                (String) json.get("name"),
                (String) json.get("email"),
                (Boolean) json.get("isVip")
        );
        return userModel;
    }

    public static UserEntity toEntity(UserModel userModel) {
        UserEntity userEntity = new UserEntity(
            userModel.name, userModel.email, userModel.isVip
        );

        return userEntity;
    }
}
