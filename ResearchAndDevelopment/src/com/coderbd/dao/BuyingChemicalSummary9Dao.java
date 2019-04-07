/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.BuyingChemicalSummary9;
import java.util.List;

/**
 *
 * @author User
 */
public interface BuyingChemicalSummary9Dao {
    void ctreateTable();

    void save(BuyingChemicalSummary9 bcs);

    void update(BuyingChemicalSummary9 bcs);

    BuyingChemicalSummary9 getGetOrder1ById(int id);

    BuyingChemicalSummary9 getGetOrder1ByGetOrder1Code(String code);

    void dalete(int id);

    List<BuyingChemicalSummary9> getList();
}
