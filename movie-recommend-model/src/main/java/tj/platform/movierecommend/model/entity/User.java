package tj.platform.movierecommend.model.entity;


import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 85
 * @date 2018/1/29 2018-01-29 9:53
 * @description 用户
 */
public class User implements Serializable{

    private String id; //用户id

    private String username; // 用户名

    private String password;//密码

    private String salt;//私盐

    private String status;//用户状态

    private List<Movie> favoriteMovie;

    public static Map<String, String> STATUS_MAP = new HashMap<>();

    static {
        STATUS_MAP.put("0", "删除");
        STATUS_MAP.put("1", "正常");
        STATUS_MAP.put("2", "冻结");
        STATUS_MAP.put("3", "新用户");
    }

    private String email; //邮箱

    private String address; // 地址

    private String mobile;//手机

    private Date createDate; // 创建时间

    private Date loginTime; //第一次登陆时间

    private String sex;//性别

    private String qq;//QQ

    private Date updateDate;//更新时间

    private String wechat;//微信

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return STATUS_MAP.get(this.status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public static Map<String, String> getStatusMap() {
        return STATUS_MAP;
    }

    public static void setStatusMap(Map<String, String> statusMap) {
        STATUS_MAP = statusMap;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public List<Movie> getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(List<Movie> favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
