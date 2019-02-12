/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis, Braden Munn
 * @version 2019-02-07
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal1 = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal1.getColor());
        Assert.assertEquals("noname", animal1.getName());
        Assert.assertEquals(0, animal1.getHeight(), 0.01);
        Assert.assertEquals(0, animal1.getWeight(), 0.01);
        
    }
    
    public void fullConstructorTest() throws AssertException
    {
    	Animal animal2 = new Animal("blue", "noname", 0.0001, 250.4);
    			
    	Assert.assertEquals("blue", animal2.getColor());
        Assert.assertEquals("noname", animal2.getName());
        Assert.assertEquals(250.4, animal2.getHeight(), 0.01);
        Assert.assertEquals(0, animal2.getWeight(), 0.01);
        
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal animal3 = new Animal("green", "bruce", 25.0, 79.4);
    	
    	Assert.assertEquals("bruce, a green-colored animal. 25.0 pounds, 79.4 inches\n", animal3.toString());
    	
    	Animal animal4 = new Animal();
    	
    	Assert.assertEquals("noname, a unknown-colored animal. 0.0 pounds, 0.0 inches\n", animal4.toString());
    	
    	//Test equals() method
    	Assert.assertEquals(false, animal3.equals(animal4));
    }

    public void equalsTest() throws AssertException
    {
    	Animal animal5 = new Animal("green", "bruce", 25.0, 79.4);
    	Animal animal6 = new Animal();
    	Animal animal7 = new Animal();
    	Animal animal8 = animal7;
    	
    	Equipment e1 = new Equipment("Hammer/10,5.0,10.0,tool for hammering");
    
    	//Test equals() method's different if/else branches
    	Assert.assertEquals(true, animal7.equals(animal8));
    	Assert.assertEquals(false, animal8.equals(e1));
    	Assert.assertEquals(false, animal5.equals(animal6));
    	Assert.assertEquals(true, animal6.equals(animal7));
    	
    }
}

