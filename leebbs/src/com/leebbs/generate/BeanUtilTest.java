/**
 * 
 */
package com.leebbs.generate;

import com.leebbs.admin.entity.Country;
import com.leebbs.admin.entity.Course;
import com.leebbs.admin.entity.Major;
import com.leebbs.admin.entity.Member;
import com.leebbs.admin.entity.University;



public class BeanUtilTest {

	public static void main(String[] args) throws Exception{
		BeanUtilTest beanUtilTest = new BeanUtilTest();
		BeanUtils beanUtils = new BeanUtils();
		//beanUtilTest.beanTool(beanUtils, Go.class);
		//beanUtilTest.beanTool(beanUtils, University.class);
		//beanUtilTest.beanTool(beanUtils, Major.class);
		//beanUtilTest.beanTool(beanUtils, Course.class);
		//beanUtilTest.beanTool(beanUtils, Member.class);
	}
	
	/**
	 * 根据bean生成相应的文件
	 * @param beanUtils
	 * @param c
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void beanTool(BeanUtils beanUtils ,Class c)throws Exception{
		beanUtils.createBeanController(c);
		beanUtils.createBeanDao(c);
		beanUtils.createBeanService(c);
		beanUtils.createBeanServiceImpl(c);
	}
}