package tj.platform.movierecommend.model.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * @author 85
 * @date 2018/3/3 2018-03-03 20:07
 * @description 编剧
 */
public class SriptWriter {
    //Id
    private String sriptWriterId;
    //名字
    private String writerName;
    //职业
    private String profession;
    //出生地
    private String birthplace;
    //影人简介
    private String introduction;
    //头像
    private String headImage;
    //影人图片
    private List<String> scriptWriteImagePath;

    public String getSriptWriterId() {
        return sriptWriterId;
    }

    public void setSriptWriterId(String sriptWriterId) {
        this.sriptWriterId = sriptWriterId;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        introduction = introduction;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public List<String> getScriptWriteImagePath() {
        return scriptWriteImagePath;
    }

    public void setScriptWriteImagePath(List<String> scriptWriteImagePath) {
        this.scriptWriteImagePath = scriptWriteImagePath;
    }

    public SriptWriter() {
    }

    public SriptWriter(String sriptWriterId, String writerName, String profession, String birthplace, String introduction, String headImage, List<String> scriptWriteImagePath) {
        this.sriptWriterId = sriptWriterId;
        this.writerName = writerName;
        this.profession = profession;
        this.birthplace = birthplace;
        introduction = introduction;
        this.headImage = headImage;
        this.scriptWriteImagePath = scriptWriteImagePath;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
