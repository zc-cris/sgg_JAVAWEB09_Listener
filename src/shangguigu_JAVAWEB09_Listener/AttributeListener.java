package shangguigu_JAVAWEB09_Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 
 * @type 监听域对象的属性变化的监听器 
 * @description: 
 * @author zc-cris
 */
@WebListener
public class AttributeListener implements ServletContextAttributeListener, ServletRequestAttributeListener, HttpSessionAttributeListener {

	public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
		System.out.println("移除request属性："+srae.getName()+":"+srae.getValue());
	}
	
	public void attributeAdded(ServletRequestAttributeEvent srae)  { 
		System.out.println("添加request属性："+srae.getName()+":"+srae.getValue());
	}
	
	public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
		System.out.println("更新request属性："+srae.getName()+":"+srae.getValue());
	}
    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	System.out.println("添加session属性："+se.getName()+":"+se.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	System.out.println("移除session属性："+se.getName()+":"+se.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println("更新session属性："+se.getName()+":"+se.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    }
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
        // TODO Auto-generated method stub
   }

   public void attributeRemoved(ServletContextAttributeEvent scae)  { 
        // TODO Auto-generated method stub
   }
	
}
