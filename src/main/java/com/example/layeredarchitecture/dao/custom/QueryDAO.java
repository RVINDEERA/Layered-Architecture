package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.PlacedOrdersDTO;

import java.sql.SQLException;

public interface QueryDAO {
    PlacedOrdersDTO printPlacedOrdersDetails() throws SQLException, ClassNotFoundException;
}
