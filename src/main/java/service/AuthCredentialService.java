//package service;
//
//import dao.AuthCredentialDAO;
//import dao.UserDao;
//import dto.UserDTO;
//import entity.AuthCredential;
//import entity.User;
//import mapper.UserMapper;
//
//public class AuthCredentialService {
//    private final AuthCredentialDAO authCredentialDAO = AuthCredentialDAO.getInstance();
//    private static final AuthCredentialService authCredentialService = new AuthCredentialService();
//
//    private AuthCredentialService() {
//
//    }
//
//    public static AuthCredentialService getInstance() {
//        return authCredentialService;
//    }
//
//    public UserDTO findAuthCredentialByID(Integer id){
//        if (id != null){
//            AuthCredential authCredential = authCredentialDAO.findById(id);
//            return UserMapper.mapToDtoAuth(authCredential);
//        }
//        return null;
//    }
//
//    public UserDTO save(UserDTO userDTO) {
//        AuthCredential authCredential = UserMapper.mapToEntityAuth()
//
//        authCredentialDAO.save(user);
//
//        return null;
////                new UserDTO(user.getFirstName(), user.getLastName());
//    }
//
//    public void delete(Integer id) {
////        userDao.delete(id);
//    }
//
//    public UserDTO update(Integer id, UserDTO userDTO) {
//        User user = new User();
//
//        user.setFirstName(userDTO.getFirstName());
//        user.setLastName(userDTO.getLastName());
//        user.setEmail(userDTO.getEmail());
//        user.setDateOfBirth(userDTO.getDateOfBirth());
//
////        userDao.update(id, user);
//        return null;
//    }
//}