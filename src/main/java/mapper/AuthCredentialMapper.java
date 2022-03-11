package mapper;

import dto.AuthCredentialDTO;
import entity.AuthCredential;


public class AuthCredentialMapper {

    public static AuthCredentialDTO mapToDtoAuth(AuthCredential authCredential){
        AuthCredentialDTO authCredentialDTO = new AuthCredentialDTO();
        authCredentialDTO.setLogin(authCredential.getLogin());
        authCredentialDTO.setPassword(authCredential.getPassword());
        return authCredentialDTO;
    }

    public static AuthCredential mapToEntityAuth(AuthCredentialDTO authCredentialDTO){
        AuthCredential authCredential = new AuthCredential();
        authCredential.setLogin(authCredentialDTO.getLogin());
        authCredential.setPassword(authCredentialDTO.getPassword());
        return authCredential;
    }
}
