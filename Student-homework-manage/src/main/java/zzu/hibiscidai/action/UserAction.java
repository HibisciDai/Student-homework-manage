package zzu.hibiscidai.action;

import java.util.List;

import zzu.hibiscidai.entity.User;
import zzu.hibiscidai.service.UserService;
import zzu.hibiscidai.util.Page;
import zzu.hibiscidai.util.Struts2ScopeUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1242008367465564019L;
	// 接受客户端的数据
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 定义Service的成员变量 通过Spring工厂创建对象
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 接收注册传入的参数
	// 查询单个用户的request作用域
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// 通过成员变量传递数据
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	// 接收删除单个用户传的参数
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// 接收批量删除的数据
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	// 分页工具对象；接收参数 ；request作用域
	private Page page;

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	/* action代码 */

	// 删除一条数据
	public String deleteUser() {
		try {
			/* 调用业务 */
			userService.modifyDeleteUser(id);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	// 通过ID查询一条数据
	public String selectById() {
		try {
			/* 调用业务 */
			user = userService.selectByUserId(id);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	// 更新一条数据
	public String update() {
		try {
			/* 调用业务 */
			userService.modifyUpdate(user);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	// 退出、注销
	public String logout() {
		ActionContext.getContext().getSession().clear();
		return "logout";
	}

	// 批量删除
	public String deleteBatch() {
		try {
			/* 调用业务 */
			userService.modifyDeleteBatch(ids);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	// 查询所有
	public String selectAll() {
		// 若page对象为null，页号PageIndex初始化设置为1
		if (page == null) {
			page = new Page();
			page.setPageIndex(1);
		}
		// 设置每页显示多少条数据
		page.setPageSize(2);
		// 设置页数和总条数
		// page.setTotalCount(20);
		page.setTotalCount(userService.findUserAmount());
		users = userService.selectAll(page);
		return "showall";
	}

	// 登陆
	public String login() {
		System.out.println("登陆方法执行");
		// 调用业务
		User user = userService.login(username, password);
		if (user != null) {
			// 把用户名放入Session作用域中
			Struts2ScopeUtils.setSessionAttribute("user", user);
			return "success";
		}
		return "failed";
	}

	// 注册
	public String register() {
		System.out.println("注册方法执行");
		userService.modifyRegister(user);
		return "registerOk";
	}

}
