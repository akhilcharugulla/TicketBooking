package com.info.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.info.entities.TicketEntity;
@Repository
public interface TicketDao extends CrudRepository<TicketEntity,Integer>{

}
