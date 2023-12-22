package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailDAO extends CrudDAO<OrderDetailDTO> {
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
}
