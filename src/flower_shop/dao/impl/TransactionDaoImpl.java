package flower_shop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import flower_shop.dao.TransactionDao;
import flower_shop.DB.connectDB;
import flower_shop.model.Transactions;

public class TransactionDaoImpl extends connectDB implements TransactionDao {
	public void insert(Transactions transaction) { 
		String sql = "INSERT INTO transactions(user_session,user_name,user_mail,user_phone,address,received_date,message,amount,payment,created) VALUES (?,?,?,?,?,?,?,?,?,?)"; 
		new connectDB(); 
		Connection con = connectDB.creatConnection(); 
 
		try { 
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setString(1, transaction.getUser_session());
			ps.setString(2, transaction.getUser_name());
			ps.setString(3, transaction.getUser_mail());
			ps.setString(4, transaction.getUser_phone());
			ps.setString(5, transaction.getAddress());
			ps.setString(6, transaction.getReceived_date());
			ps.setString(7, transaction.getMessage());
			ps.setString(8, transaction.getAmount());
			ps.setString(9, transaction.getPayment());
			ps.setString(10, transaction.getCreated());
			ps.executeUpdate(); 
			
		} catch (SQLException e) { 
			e.printStackTrace(); 
		} 
	} 
	
	@Override 
	public void delete(String id) { 		
		String sql = "Delete from transactions where id=?";
		new connectDB();
		Connection con = connectDB.creatConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	} 
	
	@Override
	public Transactions get(int id) {		
		Transactions transaction = new Transactions();
		String sql = "SELECT * FROM transactions WHERE id=?";
		new connectDB();
		Connection con = connectDB.creatConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {				
				transaction.setId(rs.getInt("id"));
				transaction.setUser_session(rs.getString("user_session"));
				transaction.setUser_name(rs.getString("user_name"));
				transaction.setUser_mail(rs.getString("user_mail"));
				transaction.setUser_phone(rs.getString("user_phone"));
				transaction.setAddress(rs.getString("address"));
				transaction.setReceived_date(rs.getString("received_date"));
				transaction.setMessage(rs.getString("message"));
				transaction.setAmount(rs.getString("amount"));
				transaction.setPayment(rs.getString("payment"));
				transaction.setCreated(rs.getString("created"));
				return transaction;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override 
	public void edit(Transactions transaction) { 
	String sql = "Update transactions set user_name =?, user_mail =?, user_phone =?, address= ?, received_date= ?,message=?,amount=?,payment=?, status=? where id=?";

		new connectDB();
		Connection con = connectDB.creatConnection();
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setString(1, transaction.getUser_name());
			ps.setString(2, transaction.getUser_mail());
			ps.setString(3, transaction.getUser_phone());
			ps.setString(4, transaction.getAddress());
			ps.setString(5, transaction.getReceived_date());
			ps.setString(6, transaction.getMessage());
			ps.setString(7, transaction.getAmount());
			ps.setInt(8, Integer.parseInt(transaction.getPayment()));
			ps.setString(9,transaction.getStatus());
			ps.setInt(10,transaction.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		 
	} 
	
	@Override 
	public Transactions get(String name) { 
		return null; 
	} 
 
	@Override 
	public List<Transactions> getAll() { 
		List<Transactions> transactions = new ArrayList<Transactions>(); 
		String sql = "SELECT * FROM transactions"; 
		Connection conn = connectDB.creatConnection(); 
 
		try { 
			PreparedStatement ps = conn.prepareStatement(sql); 
			ResultSet rs = ps.executeQuery(); 
 
			while (rs.next()) { 
				Transactions transaction = new Transactions(); 
				transaction.setId(rs.getInt("id"));
				transaction.setUser_session(rs.getString("user_session"));
				transaction.setUser_name(rs.getString("user_name"));
				transaction.setUser_mail(rs.getString("user_mail"));
				transaction.setUser_phone(rs.getString("user_phone"));
				transaction.setAddress(rs.getString("address"));
				transaction.setReceived_date(rs.getString("received_date"));
				transaction.setMessage(rs.getString("message"));
				transaction.setAmount(rs.getString("amount"));
				transaction.setPayment(rs.getString("payment"));
				transaction.setStatus(rs.getString("status"));
				transaction.setCreated(rs.getString("created"));
				transactions.add(transaction); 
			} 
 
		} catch (SQLException e) { 
			e.printStackTrace(); 
		} 
 
		return transactions; 
	}

	@Override
	public List<Transactions> sort() {
		// TODO Auto-generated method stub
		List<Transactions> transactions = new ArrayList<Transactions>(); 
		String sql = "SELECT * FROM transactions ORDER BY received_date"; 
		Connection conn = connectDB.creatConnection(); 
 
		try { 
			PreparedStatement ps = conn.prepareStatement(sql); 
			ResultSet rs = ps.executeQuery(); 
 
			while (rs.next()) { 
				Transactions transaction = new Transactions(); 
				transaction.setId(rs.getInt("id"));
				transaction.setUser_session(rs.getString("user_session"));
				transaction.setUser_name(rs.getString("user_name"));
				transaction.setUser_mail(rs.getString("user_mail"));
				transaction.setUser_phone(rs.getString("user_phone"));
				transaction.setAddress(rs.getString("address"));
				transaction.setReceived_date(rs.getString("received_date"));
				transaction.setMessage(rs.getString("message"));
				transaction.setAmount(rs.getString("amount"));
				transaction.setPayment(rs.getString("payment"));
				transaction.setStatus(rs.getString("status"));
				transaction.setCreated(rs.getString("created"));
				transactions.add(transaction); 
			} 
 
		} catch (SQLException e) { 
			e.printStackTrace(); 
		} 
 
		return transactions;
	}

//	@Override
//	public void count(Transactions transactions) {
//		// TODO Auto-generated method stub
//		String sql = "SELECT COUNT(*) FROM transactions" ;
//		Connection con = connectDB.creatConnection();
//		try { 
//			PreparedStatement ps = con.prepareStatement(sql); 
//			ResultSet rs = ps.executeQuery(sql); 
//			int count =0 ;
//			while(rs.next()){
//				count = rs.
//	}       return count;
//	
//	
//	}
}
