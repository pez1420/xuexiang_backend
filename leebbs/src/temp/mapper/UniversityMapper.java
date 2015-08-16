package temp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import temp.entity.University;
import temp.entity.UniversityExample;

public interface UniversityMapper {
    int countByExample(UniversityExample example);

    int deleteByExample(UniversityExample example);

    int deleteByPrimaryKey(String id);

    int insert(University record);

    int insertSelective(University record);

    List<University> selectByExample(UniversityExample example);

    University selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") University record, @Param("example") UniversityExample example);

    int updateByExample(@Param("record") University record, @Param("example") UniversityExample example);

    int updateByPrimaryKeySelective(University record);

    int updateByPrimaryKey(University record);
}