package shangguigu_JAVAWEB09_Listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("绑定到session域中"+event.getName()+":"+event.getValue()+"--"+event.getSession());
		System.out.println(event.getValue() == this);
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("从session域中接触绑定"+event.getName()+":"+event.getValue()+"--"+event.getSession());
	}
	
	//javaBean对象随着session钝化（写在硬盘上）
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("对象被钝化：");
	}
	
	//javaBean对象随着session活化（从硬盘上读取出来）
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("对象被活化：");
	}
}
