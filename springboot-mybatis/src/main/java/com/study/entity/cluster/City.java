package com.study.entity.cluster;

public class City {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbcity.id
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbcity.city_name
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    private String cityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbcity.description
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbcity.id
     *
     * @return the value of tbcity.id
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbcity.id
     *
     * @param id the value for tbcity.id
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbcity.city_name
     *
     * @return the value of tbcity.city_name
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbcity.city_name
     *
     * @param cityName the value for tbcity.city_name
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbcity.description
     *
     * @return the value of tbcity.description
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbcity.description
     *
     * @param description the value for tbcity.description
     *
     * @mbg.generated Mon Jun 05 15:32:47 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}