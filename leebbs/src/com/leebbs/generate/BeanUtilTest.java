/**
 * 
 */
package com.leebbs.generate;

import com.leebbs.admin.entity.Country;



public class BeanUtilTest {

	public static void main(String[] args) throws Exception{
		BeanUtilTest beanUtilTest = new BeanUtilTest();
		BeanUtils beanUtils = new BeanUtils();
		beanUtilTest.beanTool(beanUtils, Country.class);
	}
	
	/**
	 * 根据bean生成相应的文件
	 * @param beanUtils
	 * @param c
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void beanTool(BeanUtils beanUtils ,Class c)throws Exception{
		beanUtils.createBeanDao(c);
		//beanUtils.createBeanDaoImpl(c);
		beanUtils.createBeanService(c);
		beanUtils.createBeanServiceImpl(c);
	}
}