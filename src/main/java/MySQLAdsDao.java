import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import java.util.Properties;
import java.util.logging.Logger;

public class MySQLAdsDao implements Ads {
    @Override
    public List<Ad> all() {

        try {
            DriverManager.registerDriver(new Driver());
            Connection conn = DriverManager.getConnection(
                    Config.url(),
                    Config.user(),
                    Config.password()
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            List<Ad> ads = new ArrayList<>();
            while (rs.next()) {
                Ad ad = new Ad();
                ad.setId(rs.getLong("id"));
                ad.setUserId(rs.getLong("user_id"));
                ad.setTitle(rs.getLong("title"));
                ad.setDescription(rs.getLong("description"));

                ads.add(ad);
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException("Error finding all the ads!", e);
        }

    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}