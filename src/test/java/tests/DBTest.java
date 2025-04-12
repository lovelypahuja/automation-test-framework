package tests;

import org.testng.annotations.Test;
import utils.DBUtil;

import java.sql.ResultSet;

public class DBTest {

    @Test
    public void testUserEmailExists() throws Exception {
        DBUtil.connect();
        ResultSet rs = DBUtil.query("SELECT * FROM users WHERE email='test@example.com'");
        while (rs.next()) {
            assert rs.getString("email").equals("test@example.com");
        }
        DBUtil.disconnect();
    }
}

