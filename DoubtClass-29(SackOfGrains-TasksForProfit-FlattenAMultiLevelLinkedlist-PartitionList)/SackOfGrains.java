class GrainComparator implements Comparator<Grain> {
   public int compare(Grain A, Grain B) {
       double priceOfA = (double)A.value/(double)A.weight;
       double priceOfB = (double)B.value/(double)B.weight;
       if( priceOfA < priceOfB) {
           return 1;
       } else {
           return - 1;
       }
   }
}
class Solution {
   /* This is the Grain class definition
   class Grain {
       public int weight, value;
       public Grain(int weight, int value) {
           this.weight = weight;
           this.value = value;
       }
   }
   */
   double maxSackValue(Grain[] grains, int w) {
       Arrays.sort(grains, new GrainComparator());
       double price = 0;
       int i = 0;
       while (w > 0 && i < grains.length) {
           int grainAdded = Math.min (w, grains[i].weight);
           w -= grainAdded;
           price += (double)grainAdded * ((double)grains[i].value/(double)grains[i].weight);
           i++;
       }
       return price;
   }
}