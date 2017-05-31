

class Tile  {
 
   private String name ;       /* name of Tile */
   private Integer position ;  /* position on game board */
   private Integer price    ;  /* initial price of tile  */

   public Tile  () {
      System.out.println("---Called Constructor");
   }

   public Tile  (String name) {
      this.name = name;
      System.out.println("---Called Name Constructor: " + name);
   }

   public void writeName () {
      System.out.println("---Called writeName: " + name);
   }

   public void writeData () {
      System.out.println("---Called writeData: " + name + " " + price + " " + position) ;
   }

   public String getName () {
      return name ;
   }

   public void setName (String upd) {
      this.name = upd ;
   }

   public void setPrice (Integer price) {
      this.price = price ;
   }

   public Integer getPrice () {
      return price ;
   }

   public void setPosition (Integer pos) {
      this.position = pos ;
   }

   public Integer getPosition () {
      return position ;
   }


   void readDataFile() {

   }


}


