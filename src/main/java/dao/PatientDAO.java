package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.Patient;                   
import utility.DBConnection;

public class PatientDAO {
  public Patient viewPatient(int ptid) {
	  Patient p=new Patient();
	  
	  Connection con=null;
	  PreparedStatement pt=null;
	  try {
		  con=DBConnection.getConnection();
		  pt=con.prepareStatement("select * from patient where ptid=?");
		  pt.setInt(1, ptid);
		  
		  ResultSet rst=pt.executeQuery();
		  
		 if(rst.next()) {
			 p.setPtid(rst.getInt("ptid"));
			 p.setPtname(rst.getString("ptname"));
			 p.setPtaddr(rst.getString("ptaddr"));
			 p.setPhno(rst.getLong("phno")); }}
	  catch(SQLException ex) {ex.printStackTrace();}
	  return p;
  }
}
