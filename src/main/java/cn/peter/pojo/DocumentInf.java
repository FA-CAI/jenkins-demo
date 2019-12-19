package cn.peter.pojo;

import java.util.Date;

public class DocumentInf {
    private String id;
    private String title;
    private String filename;
    private String remark;
    private Date createdate;   //就不要下划线吧，映射了就完事了
    private String userid;    //就这个吧，懒得改了
    private String username;

    public DocumentInf() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "DocumentInf{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", filename='" + filename + '\'' +
                ", remark='" + remark + '\'' +
                ", createdate=" + createdate +
                ", userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
