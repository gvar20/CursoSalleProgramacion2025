package sqlite;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;


public class conexionSQLite {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			
			Connection con = DriverManager.getConnection("jdbc:sqlite:BDEjercicio.db");
			if (con != null) {
				System.out.println("Se creo y/o abrio la base de datos: ");
				}
			
			Statement stmt = con.createStatement();
				
				
			//stmt.execute("DROP TABLE IF EXISTS emp");
				
			stmt.execute("CREATE TABLE Empleados (id integer PRIMARY KEY, nombre text, apellido text, edad integer);");
			System.out.println ("Creación de tabla empleado exitosa"); 
			
			stmt.execute("CREATE TABLE Departamentos (id integer PRIMARY KEY, nombre text);");
			System.out.println ("Creación de tabla departamento exitosa"); 
			
			stmt.execute("CREATE TABLE Alumnos (id integer PRIMARY KEY, nombre text, apellido text, edad integer);");
			System.out.println ("Creación de tabla alumnos exitosa"); 
			
			stmt.execute("CREATE TABLE Generos (id integer PRIMARY KEY, nombre text);");
			System.out.println ("Creación de tabla generos exitosa"); 
			
				
			stmt.execute("insert into Empleados VALUES (1,'Carlos','Rodriguez' ,11)"); 
			stmt.execute("insert into Empleados VALUES (2,'Bety', 'Rodriguez',22)");
			System.out.println ("Inserción exitosa");
			
			stmt.execute("insert into Departamentos VALUES (1,'Desarrollo')"); 
			stmt.execute("insert into Departamentos VALUES (2,'Finanzas')");
			stmt.execute("insert into Departamentos VALUES (3,'RRHH')");
			stmt.execute("insert into Departamentos VALUES (4,'Marketing')");
			System.out.println ("Inserción exitosa");
			
			stmt.execute("insert into Alumnos VALUES (1,'Carlos','Gonzales',11)"); 
			stmt.execute("insert into Alumnos VALUES (2,'Bety','Perea',22)");
			System.out.println ("Inserción exitosa");
			
			stmt.execute("insert into Generos VALUES (1,'Masculino')"); 
			stmt.execute("insert into Generos VALUES (2,'Femenino')");
			stmt.execute("insert into Generos VALUES (3,'Otro')");
			System.out.println ("Inserción exitosa");
							
			ResultSet rs = stmt.executeQuery("SELECT * FROM Empleados WHERE edad = 11"); 
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}				
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
