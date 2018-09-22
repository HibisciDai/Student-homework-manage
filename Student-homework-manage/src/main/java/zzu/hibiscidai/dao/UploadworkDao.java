package zzu.hibiscidai.dao;

import zzu.hibiscidai.entity.Uploadwork;

/**
 * @author Hibiscidai
 * @version 1.0.0
 */

public interface UploadworkDao {
	int deleteByPrimaryKey(Integer id);

	int insert(Uploadwork record);

	int insertSelective(Uploadwork record);

	Uploadwork selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Uploadwork record);

	int updateByPrimaryKeyWithBLOBs(Uploadwork record);

	int updateByPrimaryKey(Uploadwork record);
}