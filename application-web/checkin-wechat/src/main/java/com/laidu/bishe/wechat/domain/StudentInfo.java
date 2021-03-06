package com.laidu.bishe.wechat.domain;

public class StudentInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentInfo.stuID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    private Long stuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentInfo.stuName
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    private String stuname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentInfo.wechatID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    private String wechatid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentInfo.classID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    private String classid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentInfo.featurePath
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    private String featurepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentInfo.featureType
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    private Short featuretype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentInfo.stuID
     *
     * @return the value of studentInfo.stuID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public Long getStuid() {
        return stuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentInfo.stuID
     *
     * @param stuid the value for studentInfo.stuID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public void setStuid(Long stuid) {
        this.stuid = stuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentInfo.stuName
     *
     * @return the value of studentInfo.stuName
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public String getStuname() {
        return stuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentInfo.stuName
     *
     * @param stuname the value for studentInfo.stuName
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentInfo.wechatID
     *
     * @return the value of studentInfo.wechatID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public String getWechatid() {
        return wechatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentInfo.wechatID
     *
     * @param wechatid the value for studentInfo.wechatID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public void setWechatid(String wechatid) {
        this.wechatid = wechatid == null ? null : wechatid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentInfo.classID
     *
     * @return the value of studentInfo.classID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public String getClassid() {
        return classid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentInfo.classID
     *
     * @param classid the value for studentInfo.classID
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentInfo.featurePath
     *
     * @return the value of studentInfo.featurePath
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public String getFeaturepath() {
        return featurepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentInfo.featurePath
     *
     * @param featurepath the value for studentInfo.featurePath
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public void setFeaturepath(String featurepath) {
        this.featurepath = featurepath == null ? null : featurepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentInfo.featureType
     *
     * @return the value of studentInfo.featureType
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public Short getFeaturetype() {
        return featuretype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentInfo.featureType
     *
     * @param featuretype the value for studentInfo.featureType
     *
     * @mbg.generated Mon May 08 16:09:59 CST 2017
     */
    public void setFeaturetype(Short featuretype) {
        this.featuretype = featuretype;
    }
}