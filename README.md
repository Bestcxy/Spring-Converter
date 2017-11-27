# Spring-Converter
Spring Converter

����ת�������Զ���ǰ�˵��ַ���ת��Ϊʱ���ʽ����Ȼ�����ض���ʽ���ַ�����
ʵ��֤�� ǰ������ yyyy-MM-dd * ��ʽ�Ķ����ԣ��м����������һ���ո�*���������ַ���ת�������Խ��С�

�ص���applicationContext-basic.xml�е�����
 <!-- ����ע������(�Զ�����ע����ʽ�Ĵ�����ӳ�����ʹ��������������Զ���ǰ̨�����ʽ������ַ���ת��Ϊʱ��)-->
	<mvc:annotation-driven conversion-service="conversionService"/>
	
	<!--  ʱ���ʽ��ת�������Զ���ǰ̨�����ʽ������ַ���ת��Ϊʱ��-->
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

����Ŀ�� https://github.com/Bestcxy/Spring-i18n �����Ͻ���
��ڵ�ַ��http://localhost:8085/springi18n/home/index
��֤����Ϊ�ύ����չʾ�ύ���ַ�����̨��ʵ������ʱ���ʽת�ַ����Ĺ��̡�