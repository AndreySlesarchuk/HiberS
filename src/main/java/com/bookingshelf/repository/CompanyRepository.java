package com.bookingshelf.repository;

import com.bookingshelf.entity.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company, Long> {
    Company findOneCompanyByOwnerEmail(String email);
    Company findOneCompanyByOwnerPhone(String phone);
}
