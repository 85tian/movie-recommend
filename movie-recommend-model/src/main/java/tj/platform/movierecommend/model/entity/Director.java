package tj.platform.movierecommend.model.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;
import java.util.List;

/**
 * @author 85
 * @date 2018/3/3 2018-03-03 20:11
 * @description 导演
 */
public class Director {
    //Id
    private String directorId;
    //名称
    private String directorName;
    //性别
    private String sex;
    //星座
    private String constellation;
    //出生日期
    private Date birthday;
    //出生地
    private String homeplace;
    //职业
    private String profession;
    //外文名
    private String forename;
    //头像路径
    private String headImage;
    //简介
    private String directorIntro;
    //影人图片
    private List<String> imagePath;


    public String getDirectorId() {
        return directorId;
    }

    public void setDirectorId(String directorId) {
        this.directorId = directorId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getDirectorIntro() {
        return directorIntro;
    }

    public void setDirectorIntro(String directorIntro) {
        this.directorIntro = directorIntro;
    }

    public List<String> getImagePath() {
        return imagePath;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setImagePath(List<String> imagePath) {
        this.imagePath = imagePath;
    }

    public Director() {
    }

    public Director(String directorId, String sex, String constellation, Date birthday, String homeplace, String profession, String forename, String headImage, String directorIntro, List<String> imagePath) {
        this.directorId = directorId;
        this.sex = sex;
        this.constellation = constellation;
        this.birthday = birthday;
        this.homeplace = homeplace;
        this.profession = profession;
        this.forename = forename;
        this.headImage = headImage;
        this.directorIntro = directorIntro;
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
