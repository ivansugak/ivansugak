package dto;

public class AuthCredentialDTO {
    private String login;
    private String password;

    public AuthCredentialDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public AuthCredentialDTO() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
