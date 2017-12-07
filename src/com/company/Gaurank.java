package com.company;

/**
 * Created by User on 05-12-2017.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Gaurank{

    public static void main(String[] args){

        ArrayList<Meter> m = new ArrayList<Meter>();
        try{

            // String url="jdbc:odbc:Gaurank";
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://M:\\Angular\\elmaxprepaid.mdb","", "Deepa1a2");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Master");
            while(rs.next()){

                Meter met = new Meter();
                met.setname(rs.getString("M_Name"));
                met.setFlat(rs.getString("Flat_no"));
                met.setarea(rs.getString("Area"));
                m.add(met);

              //  System.out.println(rs.getString(1)+" "+rs.getString(2)+ " "+rs.getString(3)+ " "+rs.getString(4));
            }

            System.out.println(m.get(1).getname());
            System.out.println(m.get(2).getname());
            System.out.println(m.get(3).getname());

        }
        catch(Exception e){
            System.out.println(e);
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}





