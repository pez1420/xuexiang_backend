package com.leebbs.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leebbs.core.dao.BaseDao;
import com.leebbs.core.utils.Pageable;
import com.leebbs.admin.entity.Member;


/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-15
 */
public interface MemberDao extends BaseDao <Member, String> {

}