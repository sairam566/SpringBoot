package com.tsr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tsr.bo.ProductBO;

@Repository
public class ProductDAO {

	private static final String SELECT_ALL_PRODUCTS = "SELECT ID,NAME,PRICE FROM PRODUCTS";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ProductBO> getAllProducts() {
		return jdbcTemplate.query(SELECT_ALL_PRODUCTS, (rs, rowNum) -> {
			ProductBO bo = new ProductBO();
			bo.setpId(rs.getInt(1));
			bo.setpName(rs.getString(2));
			bo.setpPrice(rs.getDouble(3));
			return bo;
		});
	}
}
