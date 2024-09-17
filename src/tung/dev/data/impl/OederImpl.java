package tung.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import tung.dev.data.dao.OrderDao;
import tung.dev.data.driver.MySQLDriver;
import tung.dev.data.model.Order;

import java.util.logging.Logger;
import java.util.logging.Level;

public class OederImpl implements OrderDao {
	
	Connection con = MySQLDriver.getInstance().getConnection();
	
}
