package org.app.units;

public class User extends AbstractEntity{

    private String userName;
    private String password;

    private UserRole userRole;

    int id=0;
    @Override
    public void autoGenerateId(){
        id++;
        super.setId(id);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword(){
           return password;
    }

    public void setPassword(String password){
    this.password=password;
    }
    public UserRole getUserRole() {
        return userRole;
    }
    public void setUserRole(UserRole userRole){
        this.userRole=userRole;
    }
}
