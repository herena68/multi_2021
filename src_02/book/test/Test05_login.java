package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test05_login {
	public static void main(String[] args) {
		System.out.println("  로그인 처리   ");

		Connection con = null;
		Statement st = null;  // ? 처리 X
		PreparedStatement ps = null;  // ? 처리 O
		ResultSet rs = null;
		
		String id="java01";
		String pw="1234";
		
		//String sql = "select * from users where id='"+id+"' and password ='"+pw+"'";
		String sql = "select * from users where id = ? and password = ?";

		try {
			con = JDBCUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2,pw);
            
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("id")+" 님 로그인 되었습니다. ");
				System.out.printf("%s / %s",rs.getString("id"),rs.getString("name"));
			}else {
				System.out.println("로그인 실패");
			}
			
		} catch (Exception e) {
           e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
	}
}
