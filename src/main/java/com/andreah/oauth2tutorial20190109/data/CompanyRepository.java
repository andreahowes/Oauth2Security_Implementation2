package com.andreah.oauth2tutorial20190109.data;

import com.andreah.oauth2tutorial20190109.service.Company;

import java.util.List;

public interface CompanyRepository {
    List<Company> findAll();

}
