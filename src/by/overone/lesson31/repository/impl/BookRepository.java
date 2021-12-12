package by.overone.lesson31.repository.impl;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.repository.IBookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    @Override
    public List<Book> readAll() {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/javaMySQL?autoReconnect=true&useSSL=false",
                            "root", "mysql");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/javaMySQL?autoReconnect=true&useSSL=false",
                            "root", "mysql");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM books WHERE author = ?");
            preparedStatement.setString(1, authorName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void addBook(String title, String author, Long quantity) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/javaMySQL?autoReconnect=true&useSSL=false",
                            "root", "mysql");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO books (title, author, quantity) VALUE (?,?,?)");
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setLong(3, quantity);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("Book add");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int bookId) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/javaMySQL?autoReconnect=true&useSSL=false",
                            "root", "mysql");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM books WHERE id = ?");
            preparedStatement.setLong(1, bookId);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("Book delete");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(int bookId, String title, String author, long quantity) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/javaMySQL?autoReconnect=true&useSSL=false",
                            "root", "mysql");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE books SET title = ?, author = ?, quantity = ? where id = ?");
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setLong(3, quantity);
            preparedStatement.setLong(4, bookId);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("Book changes");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}