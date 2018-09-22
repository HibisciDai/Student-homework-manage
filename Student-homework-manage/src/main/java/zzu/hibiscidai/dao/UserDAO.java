package zzu.hibiscidai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zzu.hibiscidai.entity.User;

/**
 * @author Hibiscidai
 * @version 1.0.0
 */

public interface UserDAO {
	// 删除一条数据
	public void deleteUser(Integer id);

	// 通过ID查询一条数据
	public User selectById(Integer id);

	// 更新一条数据
	public void update(User user);

	// 批量删除
	public void deleteBatch(List<Integer> ids);

	// 分页(查询用户总数)
	public Integer countUser();

	// 查询所有
	public List<User> selectAll(@Param("start") Integer start, @Param("end") Integer end);

	// 强制登陆

	// 通过用户名密码查询
	public User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	// 在数据库中插入一行数据
	public void insertOne(User user);

}
