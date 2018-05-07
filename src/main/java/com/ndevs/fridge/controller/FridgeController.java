package com.ndevs.fridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ndevs.fridge.dto.FridgeItem;
import com.ndevs.fridge.exception.NoItemFoundException;
import com.ndevs.fridge.service.FridgeService;

/**
 * 
 * @author Nishanth Dharmaraju
 *
 */
@RestController
@RequestMapping("/fridge")
public class FridgeController {

	@Autowired
	FridgeService fridgeService;

	@RequestMapping("/")
	public ResponseEntity<List<FridgeItem>> getAllItems() {

		return ResponseEntity.ok(fridgeService.getAllItems());
	}

	@RequestMapping("/{id}")
	public ResponseEntity<FridgeItem> getItemById(@PathVariable("id") Integer itemId) throws NoItemFoundException {

		return ResponseEntity.ok(fridgeService.getItemByType(itemId));
	}

}
