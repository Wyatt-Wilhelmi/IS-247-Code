
public class InventoryInfo {
        public static void main(String[] args) {
                Inventory[] itemList = new Inventory[10];
                itemList[0] = new Inventory("Peanuts", 6.99, 15);
                itemList[1] = new Inventory("Rolos", 3.99, 16);
                itemList[2] = new Inventory("Sweater", 26.99, 2);
                itemList[3] = new Inventory("Reeses", 1.99, 12);
                itemList[4] = new Inventory("Jelly", 5.99, 6);
                itemList[5] = new Inventory("Marshmellows", 2.99, 30);
                itemList[6] = new Inventory("Tennis Ball", 10, 10);
                itemList[7] = new Inventory("Turkey", 15.99, 20);
                itemList[8] = new Inventory("Macaroni", 3, 5);
                itemList[9] = new Inventory("Boots", 49.99, 2);
                
                Inventory[] item1 = new Inventory[10];
                Inventory[] item2 = new Inventory[10];
                Inventory[] item3 = new Inventory[10];
                Inventory[] item4 = new Inventory[10];
                Inventory[] item5 = new Inventory[10];
                
                for(int i=0;i<itemList.length;i++){
                        item1[i]=itemList[i];
                        item2[i]=itemList[i];
                        item3[i]=itemList[i];
                        item4[i]=itemList[i];
                        item5[i]=itemList[i];
                }

                System.out.println("Before Sorting: ");
                printInventory(itemList);       
                System.out.println(" ");
                System.out.println("Selection Sort: ");
        Sorting.selectionSort(item1);
        
                System.out.println(" ");
                System.out.println("Bubble Sort: ");
        Sorting.bubbleSort(item2);
      
                System.out.println(" ");
                System.out.println("Quick Sort: ");
        Sorting.quickSort(item3);
 
                System.out.println(" ");
                System.out.println("Merge Sort: ");
        Sorting.mergeSort(item4);

                System.out.println(" ");
                System.out.println("Insertion Sort: ");
        Sorting.insertionSort(item5);                   
        }

        public static void printInventory(Inventory[] items) {
                int i = 0;
                while (i < items.length && items[i] != null ) {
                        System.out.print(items[i].toString()+" ");
                        i++;
                }
                System.out.println();
        }
}
