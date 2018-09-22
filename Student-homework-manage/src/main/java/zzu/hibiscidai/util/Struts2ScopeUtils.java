package zzu.hibiscidai.util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class Struts2ScopeUtils {

	public static void setSessionAttribute(String OGNL, Object value) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session." + OGNL, value);
	}

	public static Object getSessionAttribute(String OGNL) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		return vs.findValue("#session." + OGNL);
	}

	public static void setApplicationAttribute(String OGNL, Object value) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#application." + OGNL, value);
	}

	public static Object getApplicationAttribute(String OGNL) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		return vs.findValue("#application." + OGNL);
	}
}