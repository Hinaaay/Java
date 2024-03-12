import java.awt.*;
import java.sql.*;

public class MyJDBS {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
//          告诉java我要链接mysql
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
//          获取连接，告诉java我要连接哪台机器的mysql
//          127.0.0.1和localhost都是本地ip地址
            String url = "jdbc:mysql://127.0.0.1:3306/csa?useSSL=false";
            String user = "root"; //写入账户
            String password  = "15983578"; //写入密码
            conn = DriverManager.getConnection(url,user,password);
//          获取数据库操作对象（statement专门执行sql语句）
            stmt = conn.createStatement();

//          执行sql
            System.out.println("第一题\n----------------------");
            String sql1 = "insert into students VALUES " +
                    "('s001','老大','20','计算机学院')," +
                    "('s002','老二','19','计算机学院')," +
                    "('s003','老三','18','计算机学院')," +
                    "('s004','老四','17','计算机学院');";
            stmt.executeUpdate(sql1);
            System.out.println("第三题\n--------------------");
            String sql2 = "delete from students where Sno = 's004'";
            stmt.executeUpdate(sql2);
            System.out.println("第四题\n--------------------");
            String sql5= "select SNO,Name,Age,College from students where SNO = 's003'";
            stmt.executeQuery(sql5);
            System.out.println("第五题\n--------------------");
            String sql4 = "update students set College = '通信学院' where SNO = 's001'";
            stmt.executeUpdate(sql4);
            System.out.println("第二题\n--------------------");
            String sql3 = "select SNO,Name,Age,College from students";
            rs = stmt.executeQuery(sql3);
            while(rs.next()){
                String sno = rs.getString("SNO");
                String name = rs.getString("Name");
                String age = rs.getString("Age");
                String college = rs.getString("College");
                System.out.println(sno + "\t" + name + "\t" + age + "\t" + college + "\t");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
//          释放资源，为了保证资源一定释放，在finally语句块中关闭资源
//          分别要遵循从小到大依次关闭
            if(rs != null){
                try{
                    rs.close();
                }catch(SQLException throwables){
                    throwables.printStackTrace();
                }
            }
            if(stmt != null){
                try{
                    stmt.close();
                }catch(SQLException throwables){
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException throwables){
                    throwables.printStackTrace();
                }
            }
        }
    }

}
