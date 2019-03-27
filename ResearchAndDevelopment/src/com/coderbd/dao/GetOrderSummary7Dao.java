/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.GetOrderSummary7;
import java.util.List;

/**
 *
 * @author User
 */
public interface GetOrderSummary7Dao {
    void ctreateTable();

    void save(GetOrderSummary7 gos);

    void update(GetOrderSummary7 gos);

    GetOrderSummary7 getGetOrder1ById(int id);

    GetOrderSummary7 getGetOrder1ByGetOrder1Code(String code);

    void dalete(int id);

    List<GetOrderSummary7> getList();
}
