package com.epam.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueCreator {
	public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		priorityQueue.addAll(firstList);
		priorityQueue.addAll(secondList);
		return priorityQueue;
	}
}
