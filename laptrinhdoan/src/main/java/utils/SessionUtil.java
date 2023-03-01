package utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {
	private static SessionUtil sessionUtil = null;

	public static SessionUtil getInstance() {
		if (sessionUtil == null) {
			sessionUtil = new SessionUtil();
		}
		return sessionUtil;
	}

	public void putValue(HttpServletRequest request, String key, String value) {
		request.getSession().setAttribute(key, value);

	}

	public Object getValue(HttpServletRequest request, String key) {

		return request.getSession().getAttribute(key);
	}

	public void removeValue(HttpServletRequest request, String key) {

		request.getSession().removeAttribute(key);
	}

}