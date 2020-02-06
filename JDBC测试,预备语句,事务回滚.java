package it.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
public class JdbcDemon {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement st=null;
        ResultSet  rs=null;
        try{
            con=JdbcUtil.getconn();
            con.setAutoCommit(false);
            String sql="update emp set mgr=mgr-? where id=2";
            st= con.prepareStatement(sql);
            st.setInt(1,100);
            st.executeUpdate();
            int i=3/0;
            con.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            JdbcUtil.close(con,st);
        }


    }
}
