package dao;

public interface UserMapper {
    void save( TUser user);
    boolean update(com.sample.TUser user);
    boolean delete(int userId);
    TUser findById(int userId);
    List<com.sample.TUser> findAll();
}
