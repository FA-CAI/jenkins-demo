package cn.peter.pojo;

import java.util.Date;

public class EmployeeInf {
    private String id;
    //private String dept_id;  //虽然这也是一种思路，但是经过我的深思熟虑长远业务考虑（其实是抄教师UserInf的思路），遂改为如下。然后这个职位对象怎么和数据库表中job_id联系起来呢？在Mapper.xml里映射和sql里查好即可啦
    private DeptInf fromDeptInf;
    //private String job_id;
    private JobInf fromJobInf ;
    private String name;
    private String card_id;
    private String address;
    private String post_code;
    private String tel;
    private String phone;  //手机号码不能设成Integer，因为Integer最大长度10位，手机号一般是11位！！！  //改了，别人给数据库的脏数据（他们是String）给我后来操作映射错了
    private String qq_num;
    private String email;
    private Integer sex;
    private String party;
    private Date birthday;
    private String race;
    private String education;
    private String speciality;
    private String hobby;
    private String remark;
    private Date createdate;

    public EmployeeInf() {
    }

    public EmployeeInf(DeptInf fromDeptInf) {
        this.fromDeptInf = fromDeptInf;
    }

    public EmployeeInf(JobInf fromJobInf) {
        this.fromJobInf = fromJobInf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeptInf getFromDeptInf() {
        return fromDeptInf;
    }

    public void setFromDeptInf(DeptInf fromDeptInf) {
        this.fromDeptInf = fromDeptInf;
    }

    public JobInf getFromJobInf() {
        return fromJobInf;
    }

    public void setFromJobInf(JobInf fromJobInf) {
        this.fromJobInf = fromJobInf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq_num() {
        return qq_num;
    }

    public void setQq_num(String qq_num) {
        this.qq_num = qq_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
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

    @Override
    public String toString() {
        return "EmployeeInf{" +
                "id='" + id + '\'' +
                ", fromDeptInf=" + fromDeptInf +
                ", fromJobInf=" + fromJobInf +
                ", name='" + name + '\'' +
                ", card_id='" + card_id + '\'' +
                ", address='" + address + '\'' +
                ", post_code='" + post_code + '\'' +
                ", tel='" + tel + '\'' +
                ", phone=" + phone +
                ", qq_num='" + qq_num + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", party='" + party + '\'' +
                ", birthday=" + birthday +
                ", race='" + race + '\'' +
                ", education='" + education + '\'' +
                ", speciality='" + speciality + '\'' +
                ", hobby='" + hobby + '\'' +
                ", remark='" + remark + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
