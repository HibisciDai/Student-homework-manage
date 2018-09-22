package zzu.hibiscidai.dao;

import zzu.hibiscidai.entity.Admin;

/**
 * @author Hibiscidai
 * @version 1.0.0
 */

public interface AdminDao {
	int deleteByPrimaryKey(Integer a_id);

	int insert(Admin record);

	int insertSelective(Admin record);

	Admin selectByPrimaryKey(Integer a_id);

	int updateByPrimaryKeySelective(Admin record);

	int updateByPrimaryKey(Admin record);
}