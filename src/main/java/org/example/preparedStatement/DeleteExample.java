package org.example.preparedStatement;

import org.example.util.LoadAndCreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteExample {

    private static void delete(int id) {

        try (Connection connection = LoadAndCreateConnection.getConnection()) {
            String QUERY = "DELETE FROM student where student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Record Deleted");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }

    }


    public static void main(String[] args) {
        delete(103);
    }
}
