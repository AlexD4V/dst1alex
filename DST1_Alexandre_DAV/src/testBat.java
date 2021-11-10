import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class testBat {

    public static void main(String[] args) {
        DstBat f1 = new DstBat();

        f1.Afficher();

        System.out.println("Identifiant : "+f1.getInt("id"));


    }

}
