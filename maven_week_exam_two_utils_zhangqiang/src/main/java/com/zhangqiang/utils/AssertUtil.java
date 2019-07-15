package com.zhangqiang.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void isTrue(boolean condition, String message){
		if(!Boolean.TRUE.equals(condition)) {
			throw new CustonExcption(message);
		}
	}
	//方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void isFalse(boolean condition, String message){
		if(!Boolean.FALSE.equals(condition)) {
			throw new CustonExcption(message);
		}
	}
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notNull(Object obj, String message){
		if(obj == null){
			throw new CustonExcption(message);
		}
	}
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void isNull(Object obj, String message){
		if(obj != null){
			throw new CustonExcption(message);
		}
	}
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notEmpty(Collection<?> coll, String message){
		if(coll.size() == 0 || coll == null) {
			throw new CustonExcption(message);
		}
	}
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notEmpty(Map<?,?> map, String message){
		if(map.size() == 0 || map == null) {
			throw new CustonExcption(message);
		}
	}
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void hasText(String condition, String message){
		if(condition.trim().length()==0) {
			throw new CustonExcption(message);
		}
	}
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void greaterThanZero(int value, String message){
		if (value <= 0) {
			throw new CustonExcption(message);
		}
	}
}
