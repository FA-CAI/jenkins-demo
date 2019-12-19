package cn.peter.pojo;

public class Crud {

    private String id;
    private String privilege_id;
    private String role_id;
    private String crud;

    public Crud() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(String privilege_id) {
        this.privilege_id = privilege_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getCrud() {
        return crud;
    }

    public void setCrud(String crud) {
        this.crud = crud;
    }

    @Override
    public String toString() {
        return "Crud{" +
                "id='" + id + '\'' +
                ", privilege_id='" + privilege_id + '\'' +
                ", role_id='" + role_id + '\'' +
                ", crud='" + crud + '\'' +
                '}';
    }
}
