package cn.peter.pojo;

import java.util.Date;

public class UserInf {
    private String id;
    private String loginname;
    private String password;
    private Integer status;
    private Date createdate;
    private String nick;
    private UserInf createUserInf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public UserInf getCreateUserInf() {
        return createUserInf;
    }

    public void setCreateUserInf(UserInf createUserInf) {
        this.createUserInf = createUserInf;
    }

    public UserInf(String id) {
        this.id = id;
    }

    public UserInf() {
    }

    @Override
    public String toString() {
        return "UserInf{" +
                "id='" + id + '\'' +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", createdate=" + createdate +
                ", nick='" + nick + '\'' +
                ", createUserInf=" + createUserInf +
                '}';
    }
}
