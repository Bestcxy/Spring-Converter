package com.bestcxx.stu.springsecurity.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;

/**
 * 时间格式转化器类 自动将前台满足格式规则的字符串转化为时间
 * @author WuJieJecket
 *
 */
public class MyFormatterRegistrar implements FormatterRegistrar {

	private String datePattern;
	
	public MyFormatterRegistrar(String datePattern) {
		this.datePattern=datePattern;
	}
	
	@Override
	public void registerFormatters(FormatterRegistry arg0) {
		arg0.addFormatter(new DateFormatter(datePattern));

	}

}
