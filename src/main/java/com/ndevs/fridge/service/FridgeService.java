package com.ndevs.fridge.service;

import java.util.List;

import com.ndevs.fridge.dto.FridgeItem;
import com.ndevs.fridge.exception.NoItemFoundException;

/**
 * 
 * @author Nishanth Dharmaraju
 *
 */
public interface FridgeService {

	List<FridgeItem> getAllItems();

	FridgeItem getItemByType(Integer itemType) throws NoItemFoundException;

}
