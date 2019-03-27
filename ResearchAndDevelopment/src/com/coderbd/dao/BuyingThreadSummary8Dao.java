/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.BuyingThreadSummary8;
import java.util.List;

/**
 *
 * @author User
 */
public interface BuyingThreadSummary8Dao {
    void ctreateTable();

    void save(BuyingThreadSummary8 bts);

    void update(BuyingThreadSummary8 bts);

    BuyingThreadSummary8 getGetOrder1ById(int id);

    BuyingThreadSummary8 getGetOrder1ByGetOrder1Code(String code);

    void dalete(int id);

    List<BuyingThreadSummary8> getList();
}
