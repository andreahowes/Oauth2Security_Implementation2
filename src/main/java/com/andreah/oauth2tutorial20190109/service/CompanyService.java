package com.andreah.oauth2tutorial20190109.service;

import com.andreah.oauth2tutorial20190109.data.MySqlCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private MySqlCompanyRepository companyRepository;

    public List<Company> getAll() {
        return companyRepository.findAll();
    }
}
