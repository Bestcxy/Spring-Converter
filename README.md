# Spring-Converter
Spring Converter

利用转换器，自动将前端的字符串转化为时间格式，当然对于特定格式的字符串。
实验证明 前端输入 yyyy-MM-dd * 格式的都可以，中间必须有至少一个空格，*代表任意字符，转化都可以进行。

重点是applicationContext-basic.xml中的配置
 <!-- 配置注解驱动(自动配置注解形式的处理器映射器和处理器适配器：自动将前台满足格式规则的字符串转化为时间)-->
	<mvc:annotation-driven conversion-service="conversionService"/>
	
	<!--  时间格式化转换器：自动将前台满足格式规则的字符串转化为时间-->
	<bean id="conversionService" 
	class="org.springframework.format.support.FormattingConversionServiceFactoryBean">
		<property name="formatterRegistrars">
			<set>
				<bean class="com.bestcxx.stu.springsecurity.formatter.MyFormatterRegistrar">
					<constructor-arg type="java.lang.String" value="yyyy-MM-dd"/>
				</bean>
			</set>
		</property>
	</bean>

本项目在 https://github.com/Bestcxy/Spring-i18n 基础上进行
入口地址：http://localhost:8085/springi18n/home/index
验证方法为提交表单，展示提交的字符，后台其实进行了时间格式转字符串的过程。