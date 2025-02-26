import java.sql.*;

class DT2Part2 {
    public static void main(String args[]) {
        try {
            Connection dbCxn = DriverManager.getConnection("jdbc:mysql://localhost:53326/ArtistsAndWorks", "root",
                    "pair2");
            String artistQuery = "select * from Artist";
            System.out.println(artistQuery);
            Statement selectFromArtist = dbCxn.createStatement();
            ResultSet rsArtist = selectFromArtist.executeQuery(artistQuery);
            while (rsArtist.next()) {
                System.out.println(rsArtist.getInt(1) + "  " + rsArtist.getString(2) + "  " + rsArtist.getDate(3) + "  "
                        + rsArtist.getString(4) + "  " + rsArtist.getString(5)
                        );
                        int artistPk = rsArtist.getInt(1);
                        String workQuery = 
                          "select * from Work where Work_Artist_pk='" + artistPk + "'";
                        System.out.println(workQuery);
                        Statement selectFromWork = dbCxn.createStatement();
                        ResultSet rsWork = selectFromWork.executeQuery(workQuery);
                        while (rsWork.next()) {
                            System.out.println(rsWork.getInt(1) + "  " + rsWork.getString(2) + "  " + rsWork.getString(3) + "  " + rsWork.getInt(4)
                            );
                        }
            }
            dbCxn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

