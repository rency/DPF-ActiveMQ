1.ActiveMQ持久化
	修改avtivemq/conf/下面的activemq.xml配置文件。
	在<broker></broker>标签中找到<persistenceAdapter>标签。
	将下面的<kahaDB directory="${activemq.data}/kahadb"/>注释掉并新增<jdbcPersistenceAdapter dataSource="#mysql_activemq" />标签。
	将broker开始标签中的dataDirectory="${activemq.data}"属性删除。
	在broker标签对后面新加数据源bean：
	<bean id="mysql_activemq" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/activemq?useUnicode=true&amp;characterEncoding=utf8" />
		<property name="username" value="root" />
		<property name="password" value="3306" />
		<property name="maxActive" value="200" />
		<property name="poolPreparedStatements" value="true" />
	</bean>
	。
	将mysql的jar包放到activemq/lib中。
	在mysql数据库中创建activemq数据库。
	启动activemq，数据库中会自动新增三个表