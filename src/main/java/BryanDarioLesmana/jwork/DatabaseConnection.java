/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * inisiasi class
 */
public class DatabaseConnection {

    /**
     * method connection untuk menyambungkan ke postgre
     * @return koneksi menuju postgre sql
     */
    public static Connection connection(){
        Connection c = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "postgres";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }

}
