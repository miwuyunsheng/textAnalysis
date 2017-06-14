package analysis.mapper;

import analysis.model.Docset;
import analysis.model.DocsetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocsetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int countByExample(DocsetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int deleteByExample(DocsetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int insert(Docset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int insertSelective(Docset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    List<Docset> selectByExample(DocsetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    Docset selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int updateByExampleSelective(@Param("record") Docset record, @Param("example") DocsetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int updateByExample(@Param("record") Docset record, @Param("example") DocsetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int updateByPrimaryKeySelective(Docset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table docset
     *
     * @mbggenerated Tue Apr 11 10:21:41 CST 2017
     */
    int updateByPrimaryKey(Docset record);
}