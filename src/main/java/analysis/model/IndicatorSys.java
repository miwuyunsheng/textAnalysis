package analysis.model;

import java.util.List;

public class IndicatorSys {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator_sys.id
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator_sys.indicator_title
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    private String indicatorTitle;

    private List<Indicator> indicators;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator_sys.remarks
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator_sys.id
     *
     * @return the value of indicator_sys.id
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator_sys.id
     *
     * @param id the value for indicator_sys.id
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator_sys.indicator_title
     *
     * @return the value of indicator_sys.indicator_title
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    public String getIndicatorTitle() {
        return indicatorTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator_sys.indicator_title
     *
     * @param indicatorTitle the value for indicator_sys.indicator_title
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    public void setIndicatorTitle(String indicatorTitle) {
        this.indicatorTitle = indicatorTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator_sys.remarks
     *
     * @return the value of indicator_sys.remarks
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator_sys.remarks
     *
     * @param remarks the value for indicator_sys.remarks
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<Indicator> getIndicators(){
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators){
        this.indicators=indicators;
    }
}