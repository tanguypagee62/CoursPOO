package com.CESI.cda.courspoo.dao.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PersonDAO {

    private Connection connection;

    public PersonDAO(Connection connection){
        this.connection = connection;
    }

    public List<PersonDTO> getAllPersons() throws SQLException {
        List<PersonDTO> persons = new ArrayList<>();
        String query = "SELECT * FROM Person";

        try(PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    string nom = resultSet.getString("nom");
                    string prenom = resultSet.getString("prenom");
                    int anneeNaissance = resultSet.getInt("anneeNaissance");
                    string nationalite = resultSet.getString("nationalite");
                    PersonDTO person = new PersonDTO(id, nom, pernom, anneeNaissance, nationalite);
                    persons.add(person);
                }
            }
        }
        return persons;
    }
}
