/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ignis66;

import Ignis66.acessoADatos.BomberoData;
import Ignis66.acessoADatos.BrigadaData;
import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.CuartelData;
import Ignis66.acessoADatos.SiniestroData;
import Ignis66.entidades.Bombero;
import Ignis66.entidades.Brigada;
import Ignis66.entidades.Cuartel;
import java.sql.Connection;
import java.time.LocalDate;

/**
 *
 * @author fdicocco
 */
public class ProyectoFinalGrupo66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Connection con=Conexion.getConexion();
        BomberoData bdata = new BomberoData();
        BrigadaData briData = new BrigadaData(con);
        CuartelData cData = new CuartelData();
       
       /* Cuartel cuartel = new Cuartel("Cuartel Central La Plata", "137 n° 2546", 180, 73 , "2215656109", "ccblaplata@bomberosaa.org", "Activo");*/
        Brigada brigada = new Brigada(8,"Brigada 1", "Inundaciones",1, true, true);
      
        Bombero bombero = new Bombero(36650729, "Benjamín Toledo", "A+", LocalDate.of(1997,11,9), "2216552792", "", "Bombero", "Voluntario", "Masculino", "benjjatoledo@gmail.com", "Activo");
        bdata.altaBombero(bombero);
        //Bombero bomberoModificado = new Bombero(88888888, "Almita Gomez", "A+", LocalDate.of(1997,11,9), "2216552792", "2214578877", "Bombero", "Voluntario", "Otros", "benjatoledo@gmail.com", "Activo");
        //bdata.modificarDatosBombero(bomberoModificado, 63);
        //bdata.bajaBombero(63);
        //cData.altaCuartel(cuartel);
        //briData.agregarBrigada(brigada);
        
        
        
        
    }
    
}
