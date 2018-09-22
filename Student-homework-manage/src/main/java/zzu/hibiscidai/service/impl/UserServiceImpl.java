package zzu.hibiscidai.service.impl;

import java.util.List;

import zzu.hibiscidai.entity.User;
import zzu.hibiscidai.service.UserService;
import zzu.hibiscidai.util.Page;

import zzu.hibiscidai.dao.UserDAO;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	// 批量删除
	@Override
	public void modifyDeleteUser(Integer id) {
		userDAO.deleteUser(id);
	}

	// 通过ID查询数据
	@Override
	public User selectByUserId(Integer id) {
		User user = userDAO.selectById(id);
		return user;
	}

	// 更新一条数据
	@Override
	public void modifyUpdate(User user) {
		userDAO.update(user);
	}

	// 批量删除
	@Override
	public void modifyDeleteBatch(List<Integer> ids) {
		userDAO.deleteBatch(ids);
	}

	// 分页(查询用户总数)
	@Override
	public Integer findUserAmount() {
		return userDAO.countUser();
	}

	@Override
	public List<User> selectAll(Page page) {
		List<User> list = userDAO.selectAll(page.getFirstResult(), page.getLastResult());
		return list;
	}

	@Override
	public User login(String username, String password) {
		User user = userDAO.selectByUsernameAndPassword(username, password);
		return user;
	}

	@Override
	public void modifyRegister(User user) {
		userDAO.insertOne(user);
	}

}
