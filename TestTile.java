

public class TestTile {


   public static void main( String [] args) {

      Tile sq1 = new Tile();
      Tile sq2 = new Tile();
    
      sq1.setName("Park Place");
      sq1.setPrice(40);
      sq1.setPosition(17);
      sq2.setName("Ventnor Ave");
      sq2.setPrice(200);
      sq2.setPosition(20);
       
      sq1.writeName();
      sq1.writeData();
      sq2.writeName();
      sq2.writeData();
   }

}

