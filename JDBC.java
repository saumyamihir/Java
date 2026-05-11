
// 1.Import the package
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// with the help of Connection and DriverManager class we create connection with database.

// 2. We have to import the driver -> to create the connection and excute sql query.

class.forName("com.mysql.jdbc.Driver");

// 3.Create connection ->
// create the object of connection class.

Connection conn = DriverManager.getConnetion("url","user","password"); // write this every time 

// 4. You have to create the Statement -> Statement excute the swl query.
// Statement is predefined  class 

import java.util.Statement;
Statement st = conn.createStatement();


// 5.Write the query 

String query ="SELECT * FROM Student";


// 6. Excute query -> 
// To excute query we have  two methods : ->
// i.  st.executeQuery(query); -> Only for searching (SELECT)
// ii. st.executeUpdate(query); -> update,delete,insert


// ResultSet -> Whatever output we are getting from query store inside ResultSet
import java.sql.ResultSet;
ResultSet rs = st.executeQuery(query);