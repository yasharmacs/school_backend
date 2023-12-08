package com.schoolbackend.repository;

import com.schoolbackend.model.StudentVM;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface StudentRepository extends CouchbaseRepository<StudentVM,String> {

}
