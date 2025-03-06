package com.App.fullStackList.repo;

import com.App.fullStackList.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact,String> {
    Optional<Contact> findById(String id);
}
