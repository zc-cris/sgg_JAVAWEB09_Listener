package shangguigu_JAVAWEB09_Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HelloSerlvetContextListener
		implements ServletContextListener, ServletRequestListener, HttpSessionListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("servletContext对象被创建了" + sce.getServletContext());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("servletContext对象被销毁了" + sce.getServletContext());
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request被创建");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request被销毁");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session被创建了");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session被销毁了");
	}

}
