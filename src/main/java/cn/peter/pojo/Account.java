package cn.peter.pojo;

import java.util.List;

public class Account {
    private String id;
    private String name;
    private String password;
    private String use_id;
    private String role_id;
    private String role_name;
    private List<String> privilege_url;
    //private List crud_crud;

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUse_id() {
        return use_id;
    }

    public void setUse_id(String use_id) {
        this.use_id = use_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

   /* public String getPrivilege_url() {
        return privilege_url;
    }

    public void setPrivilege_url(String privilege_url) {
        this.privilege_url = privilege_url;
    }

    public String getCrud_crud() {
        return crud_crud;
    }

    public void setCrud_crud(String crud_crud) {
        this.crud_crud = crud_crud;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", use_id='" + use_id + '\'' +
                ", role_id='" + role_id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", privilege_url='" + privilege_url + '\'' +
                ", crud_crud='" + crud_crud + '\'' +
                '}';
    }*/

    public List<String> getPrivilege_url() {
        return privilege_url;
    }

    public void setPrivilege_url(List<String> privilege_url) {
        this.privilege_url = privilege_url;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", use_id='" + use_id + '\'' +
                ", role_id='" + role_id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", privilege_url=" + privilege_url +
                '}';
    }


}
