import java.sql.*;
class DevTech2Part1{
        public static void main(String args[]){
                try{
                        Connection dbCxn=DriverManager.getConnection("jdbc:mysql://localhost:53326/ArtistsAndWorks","root","pair2");
                        String artistQuery = "select * from Artist";
                        System.out.println(artistQuery);
                        Statement selectFromArtist=dbCxn.createStatement();
                        ResultSet rsArtist=selectFromArtist.executeQuery(artistQuery);
                        while(rsArtist.next()) {
                                System.out.println(rsArtist.getInt(1) + "  " + rsArtist.getString(2) + "  " + rsArtist.getDate(3) + "  " + rsArtist.getString(4) + "  " + rsArtist.getString(5)
                                                );
                        }
                        dbCxn.close();
                }catch(Exception e){ System.out.println(e);}        }
}
