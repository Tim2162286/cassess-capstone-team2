package edu.asu.cassess.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.asu.cassess.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}