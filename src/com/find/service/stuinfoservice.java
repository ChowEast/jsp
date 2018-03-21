package com.find.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.find.model.stuinfo;

public class stuinfoservice {
	private Connection conn;
	private PreparedStatement pstmt;

	public stuinfoservice() {
		conn = new com.find.conn.conn().getCon();
	}

	public boolean addStu(stuinfo stu) {
		try {
			pstmt = conn.prepareStatement("insert into studentinfo"
					+ "(nicheng,truename,xb,csrq,zy,kc,xq,bz) "
					+ "values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, stu.getNicheng());
			pstmt.setString(2, stu.getTruename());
			pstmt.setByte(3, stu.getXb());
			pstmt.setString(4, stu.getCsrq());
			pstmt.setString(5, stu.getZy());
			pstmt.setString(6, stu.getKcs());
			pstmt.setString(7, stu.getXqs());
			pstmt.setString(8, stu.getBz());

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return false;
		}

	}

	public List queryAllStu() {
		List stus = new ArrayList();
		try {
			pstmt = conn.prepareStatement("select * from studentinfo");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				stuinfo stu = new stuinfo();
				stu.setId(rs.getInt(1));
				stu.setNicheng(rs.getString(2));
				stu.setTruename(rs.getString(3));
				stu.setXb(rs.getByte(4));
				if (rs.getDate(5) != null)
					stu.setCsrq(rs.getDate(5).toString());
				stu.setZy(rs.getString(6));
				if (rs.getString(7) != null)
					stu.setKc(rs.getString(7).split("&"));
				if (rs.getString(8) != null)
					stu.setXq(rs.getString(8).split("&"));
				stu.setBz(rs.getString(9));
				stus.add(stu);

			}
			return stus;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public stuinfo queryStubyID(int id) {
		// List stus = new ArrayList();
		try {
			pstmt = conn
					.prepareStatement("select * from studentinfo where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				stuinfo stu = new stuinfo();
				stu.setId(rs.getInt(1));
				stu.setNicheng(rs.getString(2));
				stu.setTruename(rs.getString(3));
				stu.setXb(rs.getByte(4));
				if (rs.getDate(5) != null)
					stu.setCsrq(rs.getDate(5).toString());
				stu.setZy(rs.getString(6));
				if (rs.getString(7) != null)
					stu.setKc(rs.getString(7).split("&"));
				if (rs.getString(8) != null)
					stu.setXq(rs.getString(8).split("&"));
				stu.setBz(rs.getString(9));
				// stus.add(stu);
				return stu;

			}
			return null;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public boolean updateStu(stuinfo stu) {

		try {
			pstmt = conn
					.prepareStatement("update  studentinfo set nicheng=? , truename=? , xb=? ,csrq=? ,"
							+ " zy=? ,kc=? , xq=?, bz=?   where id=?");
			pstmt.setString(1, stu.getNicheng());
			pstmt.setString(2, stu.getTruename());
			pstmt.setByte(3, stu.getXb());
			pstmt.setString(4, stu.getCsrq());
			pstmt.setString(5, stu.getZy());
			pstmt.setString(6, stu.getKcs());
			pstmt.setString(7, stu.getXqs());
			pstmt.setString(8, stu.getBz());
			pstmt.setInt(9, stu.getId());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public Boolean deleteStu(int id) {

		try {
			pstmt = conn.prepareStatement("delete from  studentinfo where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.getStackTrace();
			return false;
		}

	}
}