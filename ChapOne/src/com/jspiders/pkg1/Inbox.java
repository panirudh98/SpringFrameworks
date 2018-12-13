package com.jspiders.pkg1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inbox {
	public static void main(String[] args)
	{
		getInboxMails();
	}

		public static void getInboxMails()
		{
			ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("spring1.xml");
			c1.getBean("mysql");
		}
}