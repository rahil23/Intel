package javaTest;

import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ProblemPackage {

		double limit;
		ArrayList<Item> item;
		ArrayList<ArrayList<Item>> combinations;

		public ProblemPackage(double l, ArrayList<Item> i){
			limit = l;
			item = i;
			combinations = new ArrayList<ArrayList<Item>>();
		}
		
		//remove item with weight over the limit
		public void filtering(){
			Iterator<Item> itr = item.iterator();
			while(itr.hasNext()){
				Item i = itr.next();
				if(i.weight > limit)
					itr.remove();
			}
			//System.out.println("filtered item: " + item.toString());
		}
		
		public ArrayList<ArrayList<Item>> createCombinations(){
			//ArrayList<ArrayList<Item>> combinations = new ArrayList<ArrayList<Item>>();
			//loop through every item
			for(int x = 0; x < item.size(); x++){
				Item activeItem = item.get(x);
				//System.out.println("current item at " + x + " = " + currentItem.id);
				int combinationSize = combinations.size();
				//System.out.println("combination size: " + combinationSize);
				//System.out.println("current combination: " + combinations.toString());
				for(int y = 0; y < combinationSize; y++){
					ArrayList<Item> combination = combinations.get(y);
					//System.out.println("combination at " + y + " = " + combination.toString());
					ArrayList<Item> newCombination = new ArrayList<Item>(combination);
					newCombination.add(activeItem);
					//System.out.println("new combination: " + newCombination.toString());
					combinations.add(newCombination);
				}
				ArrayList<Item> current = new ArrayList<Item>();
				current.add(activeItem);
				combinations.add(current);
				//System.out.println(combinations.toString());
			}
			
			return combinations;
		}
		
		public double getWeight(ArrayList<Item> item){
			double total = 0;
			for(Item i : item){
				total += i.weight;
			}
			return total;
		}
		
		public double getPrice(ArrayList<Item> item){
			double total = 0;
			for(Item i : item){
				total += i.price;
			}
			return total;
		}
		
		public ArrayList<Item> getBestPackage(){
			ArrayList<Item> bestCombination = new ArrayList<Item>();
			double bestCost = 0;
			double bestWeight = 100; //max weight is 100
			for(ArrayList<Item> combination : combinations){
				double combinationWeight = getWeight(combination);
				if(combinationWeight > limit){
					continue;
				}else{
					double combinationPrice = getPrice(combination);
					if(combinationPrice > bestCost){
						bestCost = combinationPrice;
						bestCombination = combination;
						bestWeight = combinationWeight;
					}else if(combinationPrice == bestCost){	//use lightest weight
						if(combinationWeight < bestWeight){
							bestCost = combinationPrice;
							bestCombination = combination;
							bestWeight = combinationWeight;
						}
					}
				}
			}
			return bestCombination;
		}
		
		public void findPackage(){
			filtering();
			combinations = createCombinations();
			if(combinations.size() == 0){
				System.out.println("-");
			}else{
				ArrayList<Item> bestCombination = getBestPackage();
				Collections.sort(bestCombination);
				printOutput(bestCombination);
				//System.out.println(bestCombination.toString());
			}
		}
		
		public void printOutput(ArrayList<Item> item){
			StringBuilder sb = new StringBuilder();
			boolean isFirst = true;
			for (Item i : item) {
				if(isFirst){
					sb.append(i.id);
					isFirst = false;
				}else{
					sb.append("," + i.id);
				}
			}
			System.out.println(sb);
		}
		
		public static void main(String[] args){
			//File file = new File(args[0]);
			File file = new File("PackageTest.txt");
			try{
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line;
				while((line = in.readLine()) != null){
					if(line.length() == 0)
						continue;
					String[] lineArray = line.split(":");
					double weightLimit = Integer.parseInt(lineArray[0].trim());				
					String[] stringitem = lineArray[1].trim().split(" ");
					ArrayList<Item> inputs = new ArrayList<Item>();
					for(String stringItem : stringitem){
						String[] itemDetails = stringItem.split(",");
						int id = Integer.parseInt(itemDetails[0].substring(1));
						double weight = Double.parseDouble(itemDetails[1]);
						double price = Double.parseDouble(itemDetails[2].substring(1, itemDetails[2].length()-1));
						Item item = new Item(id, weight, price);
						inputs.add(item);
					}
					//Collections.sort(inputs);
					ProblemPackage p = new ProblemPackage(weightLimit, inputs);
					p.findPackage();
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}
		
		public static class Item implements Comparable<Item>{
			int id;
			double weight, price;
			public Item(int id, double weight, double price){
				this.id = id;
				this.weight = weight;
				this.price = price;
			}
			
			public String toString(){
				return "(" + id + "," + weight + "," + price + ")";
			}
			
			public int compareTo(Item i){
				return this.id - i.id;
			}
		}
	}

