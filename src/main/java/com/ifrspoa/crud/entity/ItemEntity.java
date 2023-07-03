package com.ifrspoa.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "items")
public class ItemEntity extends PanacheEntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String name;
	public String count;
	public String status;
    public Object getName() {
        return null;
    }
	public Long getId() {
		return null;
	}
    public Object getStatus() {
        return null;
    }



}