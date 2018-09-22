package zzu.hibiscidai.service;

import java.util.List;

import zzu.hibiscidai.entity.User;
import zzu.hibiscidai.util.Page;


public interface UserService {
	// 删除一条数据
	public void modifyDeleteUser(Integer id);

	// 更新一条数据
	public void modifyUpdate(User user);

	// 通过ID查询数据
	public User selectByUserId(Integer id);

	// 批量删除
	public void modifyDeleteBatch(List<Integer> ids);

	// 分页(查询用户总数)
	public Integer findUserAmount();

	// 查询所有
	public List<User> selectAll(Page page);

	// 强制登陆

	// 登陆
	public User login(String username, String password);

	// 注册
	public void modifyRegister(User user);

}
