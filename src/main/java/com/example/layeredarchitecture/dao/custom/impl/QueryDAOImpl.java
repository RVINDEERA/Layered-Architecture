package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.model.PlacedOrdersDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {

    @Override
    public PlacedOrdersDTO printPlacedOrdersDetails() throws SQLException, ClassNotFoundException {
        ResultSet resultSet = SQLUtil.execute("select b.date,a.id,a.name,b.oid ,c.itemCode,c.qty,c.unitPrice from  Customer a join Orders b on a.id = b.customerID join OrderDetails c on b.oid = c.oid");

        resultSet.next();
        return new PlacedOrdersDTO(
                resultSet.getDate(1).toLocalDate(),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getString(5),
                resultSet.getInt(6),
                resultSet.getBigDecimal(7)
        );
    }
}
