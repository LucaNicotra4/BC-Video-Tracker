import java.sql.*;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class DBManager{
     private static final String URL = "";
     private static final String USER = "";
     private static final String PASSWORD = "";

     Connection connection;
     String dbURL;
     //DriveScanner ds;

     public boolean connect() throws SQLException{
          connection = DriverManager.getConnection(URL, USER, PASSWORD);
          return connection != null;
     }

     // public List<Drive> getDrives(){

     // }

     // public String insertDrive(Drive drive){

     // }

     // public void closeConnection(){

     // }

     // public List<FileItem> getFiles(Drive d, FileItem f){

     // }

     // public List<FileItem> getFiles(Drive d){

     // }

     // public List<FileItem> getSearchResults(String query){

     // }
}