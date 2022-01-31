package com.example.demo.singleton;

import java.sql.*;

public class JDBCSingleton {

    private static JDBCSingleton jdbcSingleton;

    private JDBCSingleton(){

    }

    public static JDBCSingleton getInstance(){

        if(jdbcSingleton == null){
            jdbcSingleton = new JDBCSingleton();
        }

        return jdbcSingleton;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","ubqroot");

        return  con;
    }
    public void callbleStatment() throws Exception,SQLException{
        Connection con = null;
        try{
            con = this.getConnection();
            CallableStatement cstmt = con.prepareCall("call insertR(?,?,?)");
            cstmt.setString(1,"Sandeep");
            cstmt.setString(2,"Sandeepwife");
            cstmt.setInt(3,108);
            cstmt.execute();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            if (con != null){
                con.close();
            }
        }
    }
    public  int insert(String name,String pass) throws Exception ,SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        int recourdCounter = 0;
        try {
            con = this.getConnection();
            ps = con.prepareStatement("insert into userdata(uname,upassword)values(?,?)");
            ps.setString(1,name);
            ps.setString(2,pass);
            recourdCounter= ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(ps !=null){
                ps.close();
            }
            if(con != null){
                con.close();
            }
        }
        return recourdCounter;
    }

    public void getDataByName(String name) throws  SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("select * from userdata where uname=?");
            ps.setString(1,name);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Name= "+rs.getString(2)+"\t"+" Password= "
                                                       +rs.getString(3));

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
            if(rs != null){
                rs.close();
            }
        }
    }
    public  int update(String name ,String password) throws SQLException{
        Connection con = null;
        PreparedStatement ps = null;

        int updatedCounter = 0;
        try{
            con = getConnection();
            ps = con.prepareStatement("update userdata set upassword=? where uname='\"+name+\"' ");
            ps.setString(1,password);
            updatedCounter = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
        }

        return updatedCounter;
    }

    public int delete(int userId) throws  SQLException{

        Connection con = null;
        PreparedStatement ps = null;

        int deletedCounter =0;
        try{
            con = this.getConnection();
            ps = con.prepareStatement("delete from userdata where uid='\"+userid+\"' ");
            deletedCounter = ps.executeUpdate();

        }catch (Exception ex ){
            ex.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
        }
       return  deletedCounter;
    }

    public void getAllData() throws  SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("select * from userdata ");
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Name= "+rs.getString(2)+"\t"+" Password= "
                        +rs.getString(3));

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
            if(rs != null){
                rs.close();
            }
        }
    }
}
