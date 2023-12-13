package com.epam.collections.queue;

import java.util.List;
import java.util.LinkedList;

public class DishOrderDeterminer {
	public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
		LinkedList<Integer> dishes = new LinkedList<>();
		LinkedList<Integer> dishNumberHasEaten = new LinkedList<>();
		if (numberOfDishes >= everyDishNumberToEat) {
			for (int i = 1; i <= numberOfDishes; ++i) {
				dishes.add(i);
			}
			for (int i = 0; i < numberOfDishes; ++i) {
				for (int j = 1; j < everyDishNumberToEat; ++j) {
					dishes.addLast(dishes.remove());
				}
				dishNumberHasEaten.add(dishes.remove());
			}
		}
		return dishNumberHasEaten;
	}
}
