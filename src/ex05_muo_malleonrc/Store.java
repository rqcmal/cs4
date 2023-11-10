package ex05_muo_malleonrc;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList<Item>();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    System.out.println();
    if (itemList.size() > index) {
      earnings = itemList.get(index).getCost() + this.earnings;
      System.out.println(this.name + " has sold " + itemList.get(index).getName() + " for " + itemList.get(index).getCost());
    }
    else {
      System.out.println("There are only 3 items in " + this.name + ".");
    } 
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    System.out.println();
    boolean itemInList = false; 
      for(int i = 0; i < itemList.size(); i++){
          if (name.equals(itemList.get(i).getName())){
              earnings = itemList.get(i).getCost() + this.earnings;
              itemInList = true;
              System.out.println(this.name + " has sold " + itemList.get(i).getName() + " for " + itemList.get(i).getCost());
          } 
      }
      if (itemInList == false){
        System.out.println(this.name + " does not sell Mouthwash.");
      }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    System.out.println();
    if (itemList.contains(i) ){
          earnings = i.getCost() + this.earnings;
          System.out.println(this.name + " has sold " + i.getName() + " for " + i.getCost());      
      }
      else {
        System.out.println(this.name + " does not sell " + i.getName() + ".");
      } 
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println();
    System.out.println(type + " items: ");
      for(int i = 0; i < itemList.size(); i++){
          if(type.equals(itemList.get(i).getType())){
              System.out.println(itemList.get(i).getName());
          }
      }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.println();
    System.out.println("Items below " + maxCost + ": ");
      for(int i = 0; i < itemList.size(); i++){
          if(itemList.get(i).getCost() < maxCost){
              System.out.println(itemList.get(i).getName());
          }
      } 
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.println();
    System.out.println("Items greater than " + minCost + ": ");
      for(int i = 0; i < itemList.size(); i++){
          if(itemList.get(i).getCost() >= minCost){
              System.out.println(itemList.get(i).getName());
          }
      } 
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println();
    for(int i = 0; i < storeList.size(); i++){
          System.out.println(storeList.get(i).getName() + " has earned " + storeList.get(i).getEarnings()); 
      }
    }

  }
