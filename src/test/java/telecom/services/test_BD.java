package telecom.services;

import java.sql.*;
import java.util.Properties;
//import java.util.Properties;


public class test_BD {


    static String store_id = "0";

    public static String main(String type, String SQLStr) {

        Connection conn = null;
        Statement stmt = null;
//        System.out.println(SQLStr);
        try {
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "18350");
            properties.put("useUnicode", "true");
            properties.put("charSet", "utf8");
            //STEP 2: Register JDBC driver
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
//            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Class.forName('my.sql.Driver');

            //STEP 3: Open a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?useSSL=false", properties);

            //STEP 4: Execute a query


            Statement st = conn.createStatement();

            st.execute("set character set utf8");
            if (type.equals("INSERT")) {
                st.executeUpdate(SQLStr);
            } else if (type.equals("SELECT")) {
                try {
                    ResultSet rs;
                    rs = st.executeQuery(SQLStr);
                    rs.next();
                    store_id = "0";
                    store_id = rs.getString(1);
//                System.out.println(store_id);
                } catch (SQLException ex) {

//                ex.printStackTrace();
                }

            }


//            rs.close();
            st.close();
            conn.close();

        } catch (SQLException se) {

//            se.printStackTrace();
        } catch (Exception e) {

//            e.printStackTrace();
        } finally {

            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
//                se.printStackTrace();
            }
        }
       // System.out.println(store_id);
        return store_id;
    }


}