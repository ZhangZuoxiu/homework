package javaBean;

import java.sql.*;

public class DBean {
	private String driverStr = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String connStr = "jdbc:sqlserver://localhost:1433;DatabaseName=Supermarkets";
	private String dbusername = "20143066";
	private String dbpassword = "20143066";
	private Connection conn = null;
	private Statement stmt = null;

	public DBean() {
		try {
			Class.forName(driverStr);
			conn = DriverManager.getConnection(connStr, dbusername, dbpassword);
			stmt = conn.createStatement();
			if(stmt == null)
			{
				System.out.println("stmt");
			}
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("无法连接数据库");
		}
	}

	public int executeUpdate(String s) {
		int result = 0;
		try {
			System.out.println("传递过来的语句为:"+s);
			result = stmt.executeUpdate(s);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("执行更新错误");
		}
		return result;
	}

	public ResultSet executeQuery(String s) {
		System.out.println("传递过来的语句为:"+s);
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(s);
		} catch (Exception e) {
			if(rs == null)
			{
				System.out.println("rs");
			}
			System.out.println(e.getClass());
			System.out.println("执行查询错误");
		}
		return rs;
	}

	public void close() {
		try {
			stmt.close();
			conn.close();
		} catch (Exception e) {
		}
	}
}
