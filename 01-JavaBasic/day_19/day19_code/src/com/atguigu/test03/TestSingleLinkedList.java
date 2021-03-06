package com.atguigu.test03;

import java.util.Arrays;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();

		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("钱七");

		System.out.println("元素个数：" + list.size());//元素个数：5

		Object[] all = list.getAll();
		System.out.println(Arrays.toString(all));//[张三, 李四, 王五, 赵六, 钱七]

		/*list.remove("张三");
		System.out.println("元素个数：" + list.size());
		all = list.getAll();
		System.out.println(Arrays.toString(all));

		list.remove("王五");
		System.out.println("元素个数：" + list.size());
		all = list.getAll();
		System.out.println(Arrays.toString(all));

		list.remove("钱七");
		System.out.println("元素个数：" + list.size());
		all = list.getAll();
		System.out.println(Arrays.toString(all));*/

		System.out.println(list.indexOf("张三"));//0
		System.out.println(list.indexOf("王五"));//2
		System.out.println(list.indexOf("钱七"));//4
	}

}
