package zzu.hibiscidai.interceptor;

import zzu.hibiscidai.entity.User;
import zzu.hibiscidai.util.Struts2ScopeUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class UserInterceptor extends MethodFilterInterceptor {

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	/**
	 * 强制用户登录
	 */
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("拦截中。。。。。。。。。。");

		User user = (User) Struts2ScopeUtils.getSessionAttribute("user");
		if (user == null || user.getUsername() == null) {
			ActionContext.getContext().getValueStack().set("errMsg", "请重新登录");
			return "login";
		}
		invocation.invoke();
		return null;
	}

}