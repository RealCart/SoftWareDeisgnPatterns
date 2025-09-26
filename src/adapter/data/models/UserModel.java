package adapter.data.models;

public class UserModel {
    public UserModel(
            String name,
            String email,
            boolean isVip
    ) {
        this.name = name;
        this.email = email;
        this.isVip = isVip;
    }

    final public String name;
    final public String email;
    final public boolean isVip;
}
