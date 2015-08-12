package com.leebbs.core.listener;

import java.io.File;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

/***
 * spring容器加载完毕做一件事情（利用ContextRefreshedEvent事件）
 * 
 * @author lyb
 *
 */
@Component("initListener")
public class InitListener implements
		ApplicationListener<ContextRefreshedEvent>, ServletContextAware {
	private static final String IIIllIlI = "/install_init.conf";
	private ServletContext servletContext;


	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		if ((this.servletContext != null)
				&& (contextRefreshedEvent.getApplicationContext().getParent() == null)) {
			//roleDao.getUserList();//spring容器初始化完毕加载用户列表到内存 
			System.out.println("spring容易初始化完毕================================================"); 
		}
	}
}
