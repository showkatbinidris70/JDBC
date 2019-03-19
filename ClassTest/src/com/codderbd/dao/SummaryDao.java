/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderbd.dao;

import com.codderbd.pojo.Summary;
import java.util.List;

/**
 *
 * @author User
 */
public interface SummaryDao {
     void createTable();

    void save(Summary s);

    void update(Summary s);

    Summary getSummaryByProductCode(String code);

    List<Summary> getList();
}
