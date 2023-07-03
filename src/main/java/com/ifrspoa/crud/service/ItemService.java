package com.ifrspoa.crud.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.ifrspoa.crud.entity.ItemEntity;
import com.ifrspoa.crud.model.Item;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@ApplicationScoped
public class ItemService {
	
	public List<Item> get() {
		List<ItemEntity> listAll = PanacheEntityBase.findAll().list();
		return listAll.stream().map(ie -> {
						return new Item(ie.id, ie.name, ie.count, ie.status);
					}).collect(Collectors.toList());
	}
	
	@Transactional
	public void create(Item item) {
		ItemEntity ie = new ItemEntity();
		ie.name = item.getName();
		ie.count = item.getCount();
		ie.status = item.getStatus();
		ie.persist();
	}
	
	@Transactional
	public void update(Item item) {
		ItemEntity entity = PanacheEntityBase.findById(item.getId());
		entity.name = item.getName();
		entity.count = item.getCount();
		entity.status = item.getStatus();
	}
	
	@Transactional
	public void delete(Long id) {
		PanacheEntityBase.deleteById(id);
	}

}
