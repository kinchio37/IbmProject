package com.ibm.issue.dao;

import com.ibm.issue.pojo.Issuestate;
import com.ibm.issue.pojo.IssuestateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssuestateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    long countByExample(IssuestateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int deleteByExample(IssuestateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int insert(Issuestate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int insertSelective(Issuestate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    List<Issuestate> selectByExample(IssuestateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    Issuestate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Issuestate record, @Param("example") IssuestateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Issuestate record, @Param("example") IssuestateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Issuestate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestate
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Issuestate record);
}