package adapter.domain.entites;

public class CreateUserReqParamsEntity {
    public CreateUserReqParamsEntity(
            String name,
            String surname,
            String email
    ) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    final public String name;
    final public String surname;
    final public String email;
}
