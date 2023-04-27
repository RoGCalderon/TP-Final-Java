package com.mycompany.futbol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Equipo {
    
    private int idEquipo;
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;

    public Equipo() {
    }

    public Equipo(int idEquipo, String nombre, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    }
    
    public void mostrarEquipos(){
        try{
            ConexionBD conexion = new ConexionBD();
            Connection conn = conexion.Conexion();
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("select* from Equipo ");
            
            while(rs.next()){
                System.out.println("Los datos del equipo son: ");
                int id = rs.getInt("idEquipo");
                String nom = rs.getString("nombre");
                int tit = rs.getInt("titulares");
                int supl = rs.getInt("suplentes");
                String dt =rs.getString("directorTecnico");
                int ptos = rs.getInt("puntos");
                int jugados = rs.getInt("partidosJugados");
                
                System.out.println("Id: "+id);
                System.out.println("Nombre: "+nom);
                System.out.println("Titulares: "+tit);
                System.out.println("Suplentes: "+supl);
                System.out.println("DT: "+ dt);
                System.out.println("Puntos: "+ptos);
                System.out.println("Partidos Jugados: "+jugados); 
                System.out.println("---------------------------");
            }
            
        }catch(SQLException e){
            System.out.println("Error al conectar a la Base de Datos: " + e.getMessage());
        }
    
    }
    
    public void mostrarUnEquipo(int idEquipo){
        
        try{
            ConexionBD conexion = new ConexionBD();
            Connection conn = conexion.Conexion();
            
            String queryPrep = "select * from Equipo where idEquipo = ?";
            PreparedStatement consulta = conn.prepareStatement(queryPrep);
            consulta.setInt(1, idEquipo);
            ResultSet rs = consulta.executeQuery();
            
            while(rs.next()){
                System.out.println("Datos del equipo: ");
                int id = rs.getInt("idEquipo");
                String nom = rs.getString("nombre");
                int tit = rs.getInt("titulares");
                int supl = rs.getInt("suplentes");
                String dt =rs.getString("directorTecnico");
                int ptos = rs.getInt("puntos");
                int jugados = rs.getInt("partidosJugados");
                
                System.out.println("Id: "+id);
                System.out.println("Nombre: "+nom);
                System.out.println("Titulares: "+tit);
                System.out.println("Suplentes: "+supl);
                System.out.println("DT: "+ dt);
                System.out.println("Puntos: "+ptos);
                System.out.println("Partidos Jugados: "+jugados);
            }
        }catch(SQLException e){
            System.out.println("Error al conectar a la Base de Datos: " + e.getMessage());
           
        }
    }
          
}
    
