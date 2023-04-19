/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpbanquechristian.ejb;

/**
 *
 * @author Stéphan J. Christian
 */

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;

@DataSourceDefinition (
    className="com.mysql.cj.jdbc.MysqlDataSource",
    name="java:app/jdbc/banque",
    serverName="localhost",
    portNumber=3306,
    user="stephan",              // nom et
    password="Mcf1234*", // mot de passe que vous avez donnés lors de la création de la base de données
    databaseName="banque",
    properties = {
      "useSSL=false",
      "allowPublicKeyRetrieval=true"
    }
)

@Stateless
public class GestionnaireCompte {
    
}
