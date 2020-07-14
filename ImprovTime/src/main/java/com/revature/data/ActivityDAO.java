package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Activity;

@Repository
public interface ActivityDAO extends JpaRepository<Activity, Integer> {

}
