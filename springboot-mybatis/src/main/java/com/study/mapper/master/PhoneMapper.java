package com.study.mapper.master;

import com.study.entity.master.Phone;
import com.study.entity.master.PhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    long countByExample(PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int deleteByExample(PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int insert(Phone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int insertSelective(Phone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    List<Phone> selectByExample(PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    Phone selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int updateByExample(@Param("record") Phone record, @Param("example") PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int updateByPrimaryKeySelective(Phone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbphone
     *
     * @mbg.generated Mon Jun 05 15:19:44 CST 2017
     */
    int updateByPrimaryKey(Phone record);
}