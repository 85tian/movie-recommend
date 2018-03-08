package tj.platform.movierecommend.model.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;
import java.util.List;

/**
 * @author 85
 * @date 2018/3/3 2018-03-03 20:14
 * @description 演员
 */
public class Actor {
    //Id
    private String actorId;
    //性别
    private String sex;
    //出生地
    private String homeplace;
    //名称
    private String actorName;
    //星座
    private String constellation;
    //出生日期
    private Date birthday;
    //职业
    private String profession;
    //外文名
    private String foreName;
    //更多中文名
    private String otherChineseName;
    //家庭成员
    private String family;
    //头像路径
    private String headImage;
    //影人简介
    private String actorIntroduction;
    //影人图片
    private List<String> actorImages;

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getOtherChineseName() {
        return otherChineseName;
    }

    public void setOtherChineseName(String otherChineseName) {
        this.otherChineseName = otherChineseName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getActorIntroduction() {
        return actorIntroduction;
    }

    public void setActorIntroduction(String actorIntroduction) {
        this.actorIntroduction = actorIntroduction;
    }

    public List<String> getActorImages() {
        return actorImages;
    }

    public void setActorImages(List<String> actorImages) {
        this.actorImages = actorImages;
    }


    public Actor() {
    }

    public Actor(String actorId, String sex, String homeplace, String actorName, String constellation, Date birthday, String profession, String foreName, String otherChineseName, String family, String headImage, String actorIntroduction, List<String> actorImages) {
        this.actorId = actorId;
        this.sex = sex;
        this.homeplace = homeplace;
        this.actorName = actorName;
        this.constellation = constellation;
        this.birthday = birthday;
        this.profession = profession;
        this.foreName = foreName;
        this.otherChineseName = otherChineseName;
        this.family = family;
        this.headImage = headImage;
        this.actorIntroduction = actorIntroduction;
        this.actorImages = actorImages;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
