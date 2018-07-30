package com.bookingshelf.repository;

import com.bookingshelf.entity.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Long> {
}
