package com.zhangqiang.utils.test;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

import com.zhangqiang.utils.AssertUtil;
import com.zhangqiang.utils.CustonExcption;

public class TestUtils {
	
	//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void isTrue(){
		try {
			AssertUtil.isTrue(true, "这是假的");
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
	
	//方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void isFalse(){
		try {
			AssertUtil.isFalse(false, "这是真的");
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
	
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void notNull(){
		try {
			ArrayList<Object> arrayList = new ArrayList<>();
			arrayList.add(1);
			AssertUtil.notNull(arrayList, "这是空的");
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
	
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void isNull(){
		try {
			
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
	
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void notEmpty(){
		try {
			LinkedList<Object> linkedList = new LinkedList<>();
			linkedList.add(1);
			AssertUtil.notEmpty(linkedList, "集合为空");
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
	
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void hasText(){
		try {
			String str ="1";
			AssertUtil.hasText(str, "长度小于0");
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
	
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void greaterThanZero(){
		try {
			int i = 1;
			AssertUtil.greaterThanZero(i, "小于或等于0");
		} catch (CustonExcption e) {
			e.printStackTrace();
		}
	}
}
