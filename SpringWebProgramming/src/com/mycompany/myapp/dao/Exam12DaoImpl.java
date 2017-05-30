package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.Exam12Board;
import com.mycompany.myapp.dto.Exam12Member;

@Component
public class Exam12DaoImpl implements Exam12Dao	{
	private static final Logger LOGGER=LoggerFactory.getLogger(Exam12DaoImpl.class);	
	@Override
	public int insert1(Exam12Board board) {
		int bno=-1;
		Connection conn=null;
		try {
			//JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//연결 문자열 작성
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			//연결 객체 얻기
			conn=DriverManager.getConnection(url, "iotuser", "iot12345");
			LOGGER.info("연결 성공");
			//SQL 작성
			String sql="insert into board ";
			sql+="(bno, btitle, bcontent, bwriter, bdate, bpassword, bhitcount,boriginalfilename, bsavedfilename, bfilecontent)";
			sql+="values";
			sql+="(board_bno_seq.nextval, ?, ?, ?, sysdate, ?, 0, ? , ? , ? )";
			//SQL 문을 전송해서 실행
			//테이블 정의시 컬럼의 속성으로 자동 증가를 지정할 수 있는 DB 일 경우(MySQL, MS SQL)
			//PreparedStatement pstmt=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			//오라클일 경우 Sequence 외부 객체로 자동 증가값을 얻기 때문에 다음과 같이 지정
			PreparedStatement pstmt=conn.prepareStatement(sql,new String[]{"bno"});
			
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setString(4, board.getBpassword());
			pstmt.setString(5, board.getBoriginalfilename());
			pstmt.setString(6, board.getBsavedfilename());
			pstmt.setString(7, board.getBfilecontent());

			pstmt.executeUpdate();
			ResultSet rs=pstmt.getGeneratedKeys();
			rs.next();
			bno=rs.getInt(1);
			
			
			pstmt.close();
			
//			Statement stmt=conn.createStatement();
//			stmt.executeUpdate(sql);
//			stmt.close();
			LOGGER.info("행 추가 성공");

//			//연결 끊기
//			conn.close();
//			LOGGER.info("연결 끊김");

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
			return bno;
		}
	}
//	@Override	
//	public void select() {
//		
//	}
//	@Override
//	public void update() {
//		
//	}
//	@Override
//	public void delete() {
//		
//	}
	
	@Override
	public String insert2(Exam12Member member) {
		String mid=null;
		Connection conn=null;
		try {
			//JDBC Driver 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//연결 문자열 작성
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			//연결 객체 얻기
			conn=DriverManager.getConnection(url, "iotuser", "iot12345");
			LOGGER.info("연결 성공");
			//SQL 작성
			String sql="insert into member ";
			sql+="(mid, mname, mpassword, mdate, mtel, memail, mage, maddress, moriginalfilename, msavedfilename, mfilecontent)";
			sql+="values";
			sql+="(?, ?, ?, sysdate, ?, ?, ? , ? , ?,?,? )";
			
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMname());
			pstmt.setString(3, member.getMpassword());
			pstmt.setString(4, member.getMtel());
			pstmt.setString(5, member.getMemail());
			pstmt.setInt(6, member.getMage());
			pstmt.setString(7, member.getMaddress());
			pstmt.setString(8, member.getMoriginalfilename());
			pstmt.setString(9, member.getMsavedfilename());
			pstmt.setString(10, member.getMfilecontent());

			pstmt.executeUpdate();
			
			mid=member.getMid();

			pstmt.close();

			LOGGER.info("행 추가 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			// 연결 끊기
			try {
				conn.close();
				LOGGER.info("연결 끊김");
			} catch (SQLException e) {
			}
			return mid;
		}
	}

	
	
	
	public static void main(String[] args){
		Exam12DaoImpl test=new Exam12DaoImpl();
		Exam12Board board=new Exam12Board();
		board.setBtitle("제목");
		board.setBcontent("내용");
		board.setBwriter("유경");
		board.setBpassword("12345");
		board.setBoriginalfilename("a.png");
		board.setBsavedfilename("a.png");
		board.setBfilecontent("image/png");
		
		int bno=test.insert1(board);
		LOGGER.info("추가된 행의 bno"+bno);
		
		
		
		Exam12Member member=new Exam12Member();
		member.setMid("602");
		member.setMname("유경");
		member.setMpassword("12345");
		member.setMtel("010-1111-2222");
		member.setMemail("jyk60222@gmail.com");
		member.setMaddress("ㅇㅇㅇㅇㅇㅇㅇ");
		member.setMoriginalfilename("a.png");
		member.setMsavedfilename("a.png");
		member.setMfilecontent("image/png");
		
		String mid=test.insert2(member);
		LOGGER.info("추가된 행의 mid"+mid);
		
		
	}
}
