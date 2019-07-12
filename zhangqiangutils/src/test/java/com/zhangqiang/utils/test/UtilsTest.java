package com.zhangqiang.utils.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zhangqiang.utils.AssertUtil;
import com.zhangqiang.utils.CustomException;

public class UtilsTest {
	
	@Test
	public void isTrueTest(){
		try {
			AssertUtil.isTrue(true, "这不是真");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void isFalse(){
		try {
			AssertUtil.isFalse(false, "这不是假");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void isNotNull(){
		try {
			AssertUtil.isNotNull("", "这是空的");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void isNull(){
		try {
			AssertUtil.isNull("asdasd", "这是一个字符串");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void isNotNullCollection(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(1);
			AssertUtil.collectionNotNull(arrayList, "这是一个空的集合");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test6(){
		try {
			HashMap<Object, Object> map = new HashMap<>();
			map.put("a","a");
			
			AssertUtil.mapNotNull(map, "这是一个空的");
			
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test7(){
		try {
			String str = " aa";
			AssertUtil.hasValue(str, "当当当");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test8(){
		try {
			int num = 1;
			AssertUtil.absInt(num, "必须为正数");
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	
}
