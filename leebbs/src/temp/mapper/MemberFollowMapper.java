package temp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import temp.entity.MemberFollow;
import temp.entity.MemberFollowExample;

public interface MemberFollowMapper {
    int countByExample(MemberFollowExample example);

    int deleteByExample(MemberFollowExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberFollow record);

    int insertSelective(MemberFollow record);

    List<MemberFollow> selectByExample(MemberFollowExample example);

    MemberFollow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberFollow record, @Param("example") MemberFollowExample example);

    int updateByExample(@Param("record") MemberFollow record, @Param("example") MemberFollowExample example);

    int updateByPrimaryKeySelective(MemberFollow record);

    int updateByPrimaryKey(MemberFollow record);
}