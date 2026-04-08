package com.spring_mvc.jdbc2.Repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring_mvc.jdbc2.VO.ProductVO;

@Repository
public class ProductDAO {

	private DataSource dataFactory;

	@Autowired
	public ProductDAO(DataSource dataSource) {
		try {
			this.dataFactory = dataSource;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ProductVO> productSelect() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ProductVO> prdList = new ArrayList<>();

		try {
			con = dataFactory.getConnection();

			String sql = "SELECT * FROM product ORDER BY prdNo";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String prdNo = rs.getString("prdNo");
				String prdName = rs.getString("prdName");
				int prdPrice = rs.getInt("prdPrice");
				String prdCompany = rs.getString("prdCompany");
				int prdStock = rs.getInt("prdStock");
				Date prdDate = rs.getDate("prdDate");

				ProductVO vo = new ProductVO();
				vo.setPrdNo(prdNo);
				vo.setPrdName(prdName);
				vo.setPrdPrice(prdPrice);
				vo.setPrdCompany(prdCompany);
				vo.setPrdStock(prdStock);
				vo.setPrdDate(prdDate);

				prdList.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return prdList;
	}

}
