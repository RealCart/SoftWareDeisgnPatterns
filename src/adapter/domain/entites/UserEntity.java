package adapter.domain.entites;

public class UserEntity {
    public UserEntity(
            String name,
            String email,
            boolean isVip
    ) {
        this.name = name;
        this.email = email;
        this.isVip = isVip;
    }

    final String name;
    final String email;
    final boolean isVip;

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isVip=" + isVip +
                '}';
    }
}
