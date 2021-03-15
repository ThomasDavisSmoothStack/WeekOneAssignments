package com.smoothstack.weekone.project;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WeekOneSingleton {
	private static Connection conn = null;

	private static WeekOneSingleton instance = null;

	public static WeekOneSingleton getInstance() {
		return instance;
	}

	public static void databaseQuery(BigDecimal input) {
		try {
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			BigDecimal x = new BigDecimal(0);
			while (rs.next()) {
				x = rs.getBigDecimal(1).multiply(input);
			}
		} catch (Exception e) {

		}
	}

}
