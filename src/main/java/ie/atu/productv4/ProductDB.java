package ie.atu.productv4;


public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
    public static Product getProduct(String productCode) {
        Product p = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        } else  if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("ATE")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("All Things End");
            myMusic.setPrice(5.50);
            myMusic.setArtist("Hozier");
            myMusic.setLabel("Rubyworks Island Columbia");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("First Time")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("First Time - UU");
            myMusic.setPrice(5.50);
            myMusic.setArtist("Hozier");
            myMusic.setLabel("Rubyworks Island Columbia");
            p = myMusic;
        }  else if (productCode.equalsIgnoreCase("IBOLD")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("I Bet on Losing Dogs");
            myMusic.setPrice(10.50);
            myMusic.setArtist("Mitski");
            myMusic.setLabel("Dead Oceans");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("FF")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Francis Forever");
            myMusic.setPrice(6.50);
            myMusic.setArtist("Mitski");
            myMusic.setLabel("Dead Oceans");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("UE43DU")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Samsung DU7100 43 Crystal UHD 4K HDR LED Smart TV (2024) | UE43DU");
            myTV.setPrice(349.0);
            myTV.setScreensSize(43);
            myTV.setManufacturer("Samsung");
            p = myTV;
        }else if (productCode.equalsIgnoreCase("K65XR")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony XR80 65 inch Bravia 8 4K Ultra HD HDR OLED Smart TV (2024) | K65XR");
            myTV.setPrice(2279.0);
            myTV.setScreensSize(65);
            myTV.setManufacturer("Sony");
            p = myTV;
        }



        return p;
    }


}






