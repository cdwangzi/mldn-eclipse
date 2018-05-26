package cn.mldn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cn.mldn.dao.IDeptDAO;
import cn.mldn.util.dao.abs.AbstractDAO;
import cn.mldn.util.web.annotation.Repository;
import cn.mldn.vo.Dept;
@Repository
public class DeptDAOImpl extends AbstractDAO implements IDeptDAO {
 
	@Override
	public boolean doCreate(Dept vo) throws SQLException {
		String sql = "INSERT INTO dept(dname) VALUES (?)" ;
		super.pstmt = super.conn.prepareStatement(sql) ;
		super.pstmt.setString(1, vo.getDname());
		return super.pstmt.executeUpdate() > 0 ;
	}

	@Override
	public boolean doEdit(Dept vo) throws SQLException {
		return false;
	}

	@Override
	public boolean doRemove(Set<Long> ids) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Dept findById(Long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findAll() throws SQLException {
		List<Dept> all = new ArrayList<Dept>() ;
		String sql = "SELECT deptno,dname FROM dept" ;
		super.pstmt = super.conn.prepareStatement(sql) ; 
		ResultSet rs = super.pstmt.executeQuery() ;
		while (rs.next()) {
			Dept dept = new Dept() ;
			dept.setDeptno(rs.getLong(1));
			dept.setDname(rs.getString(2));
			all.add(dept) ;
		}
		return all;
	}


	@Override
	public Long getAllCount() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getAllCount(String column, String keyWord) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findSplit(Long currentPage, Integer lineSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findSplit(Long currentPage, Integer lineSize, String column, String keyWord) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
