package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SupperDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO <T>  extends SupperDAO {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    boolean save(T dto) throws SQLException, ClassNotFoundException;
    boolean update(T dto) throws SQLException, ClassNotFoundException;
    boolean delete(String id) throws SQLException, ClassNotFoundException ;
    String generateNewId() throws SQLException, ClassNotFoundException;
    boolean exist(String id) throws SQLException, ClassNotFoundException;
    public T search(String id) throws SQLException, ClassNotFoundException;

}
