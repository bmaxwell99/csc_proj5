
/**
 * Write a description of class Wearable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wearable
{
   /**ranking per imported document*/
   int ranking;
   /**name of the wearable object*/
   String name;
   /**price of the object*/
   double price;
   /**as per the imported document*/
   String bodyLocation;
   /**as per the imported document*/
   String category;
   /**array of info related to the company*/
   String[] companyInfo;
   
   
   /**
    * Constructor
    */
   public Wearable(){
       
    }
    
    /**
     * getter for ranking
     * 
     * @return the ranking
     */
    public int getRanking(){
        return this.ranking;
    }
    
    /**
     * getter for name
     * 
     * @return the name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * getter for price
     * 
     * @return the price
     */
    public double getPrice(){
        return this.price;
    }
    
    /**
     * getter for bodyLocation
     * 
     * @return the location on the body
     */
    public String getBodyLocation(){
        return this.bodyLocation;
    }
    
    /**
     * getter for category of object
     * 
     * @return the category
     */
    public String getCategory(){
        return this.category;
    }
    
    /**
     * getter for company name
     * 
     * @return the name of the company
     */
    public String getCompanyName(){
        return this.companyInfo[0];
    }
    
    /**
     * getter for company URL
     * 
     * @return the url of the company website
     */
    public String getCompanyUrl(){
        return this.companyInfo[1];
    }
    
    /**
     * getter for company mapping info
     * 
     * @return the company mapping info
     */
    public String getMappingInfo(){
        return this.companyInfo[2];
    }
    
    /**
     * getter for company City
     * 
     * @return the city
     */
    public String getCompanyCity(){
        return this.companyInfo[3];
    }
    
    /**
     * getter for company state, returns null if not in US
     * 
     * @return the state, null if not in US
     */
    public String getCompanyState(){
        return this.companyInfo[4];
    }
    
    /** getter for company country
     * 
     * @return the country
     */
    public String getCompanyCountry(){
        return this.companyInfo[5];
    }
}
