package tj.platform.movierecommend.model.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author 85
 * @date 2018/3/3 2018-03-03 20:24
 * @description 制片地区
 */
public class ProduceCountry {
    //制片地区Id
    private String produceCountryId;
    //制片地区名称
    private String produceCountryName;


    public String getProduceCountryId() {
        return produceCountryId;
    }

    public void setProduceCountryId(String produceCountryId) {
        this.produceCountryId = produceCountryId;
    }

    public String getProduceCountryName() {
        return produceCountryName;
    }

    public void setProduceCountryName(String produceCountryName) {
        this.produceCountryName = produceCountryName;
    }


    public ProduceCountry() {
    }

    public ProduceCountry(String produceCountryId, String produceCountryName) {
        this.produceCountryId = produceCountryId;
        this.produceCountryName = produceCountryName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
