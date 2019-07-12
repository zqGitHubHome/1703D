package com.zhangqiang.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	/**
	 * 1.断言为真
	 * exp 代表true 或者 false
	 * message 代表 抛出的错误信息 
	 */
	public static void isTrue(Boolean bool, String message){
		if(!Boolean.TRUE.equals(bool)){
			throw new CustomException(message);
		}
	}
	
	/**
	 * 2.断言为假
	 * exp 代表true 或者 false
	 * message 代表 抛出的错误信息 
	 */
	public static void isFalse(Boolean bool, String message){
		if(!Boolean.FALSE.equals(bool)){
			throw new CustomException(message);
		}
	}
	
	/**
	 * 3.断言对象不能为空
	 * exp 代表字符串对象
	 * message 代表 抛出的错误信息 
	 */
	public static void isNotNull(String obj, String message){
		if(obj == null || obj.length() == 0){
			throw new CustomException(message);
		}
	}
	
	public static void isNotNull2(Object obj, String message){
		if(obj == null){
			throw new CustomException(message);
		}
	}
	
	
	/**
	 * 4.断言对象必须为空
	 * exp 代表字符串对象
	 * message 代表 抛出的错误信息 
	 */
	public static void isNull(String obj, String message){
		if(obj.length() > 0){
			throw new CustomException(message);
		}
	}
	
	public static void isNull2(Object obj, String message){
		if(obj != null){
			throw new CustomException(message);
		}
	}
	
	/**
	 * 5.断言List和Set集合不为空
	 * exp 代表字符串对象
	 * message 代表 抛出的错误信息 
	 */
	public static void collectionNotNull(Collection<?> col, String message){
		if(col == null || col.size() == 0){
			throw new CustomException(message);
		}
	}
	
	/**
	 * 6.断言map集合不为空
	 * exp 代表字符串对象
	 * message 代表 抛出的错误信息 
	 */
	public static void mapNotNull(Map<?, ?> map, String message){
		if(map == null || map.size() == 0){
			throw new CustomException(message);
		}
	}
	
	/**
	 * 7 .断言map集合不为空
	 * exp 代表字符串对象
	 * message 代表 抛出的错误信息 
	 */
	public static void hasValue(String str, String message){
		if(!(str.trim().length()>0)){
			throw new CustomException(message);
		}
	}
	
	/**
	 * 8 .断言value必须为正数
	 * exp 代表字符串对象
	 * message 代表 抛出的错误信息 
	 */
	public static void absInt(int num, String message){
		if(num <= 0){
			throw new CustomException(message);
		}
	}
	
}
