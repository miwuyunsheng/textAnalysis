package analysis.model;

import java.util.List;

public class Indicator {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator.id
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator.title
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    private String title;

    private List<Options> optionsList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator.remarks
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indicator.indicator_sys_id
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    private String indicatorSysId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator.id
     *
     * @return the value of indicator.id
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator.id
     *
     * @param id the value for indicator.id
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator.title
     *
     * @return the value of indicator.title
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator.title
     *
     * @param title the value for indicator.title
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public List<Options> getOptionsList(){
        return optionsList;
    }

    public void setOptionsList(List<Options> optionsList){
        this.optionsList=optionsList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator.remarks
     *
     * @return the value of indicator.remarks
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator.remarks
     *
     * @param remarks the value for indicator.remarks
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indicator.indicator_sys_id
     *
     * @return the value of indicator.indicator_sys_id
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public String getIndicatorSysId() {
        return indicatorSysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indicator.indicator_sys_id
     *
     * @param indicatorSysId the value for indicator.indicator_sys_id
     *
     * @mbggenerated Thu Apr 06 15:40:59 CST 2017
     */
    public void setIndicatorSysId(String indicatorSysId) {
        this.indicatorSysId = indicatorSysId;
    }
}