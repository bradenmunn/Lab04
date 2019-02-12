/**
 * Testing class for Product object
 *
 * @author Braden Munn
 * @version 2019-02-11
 */
public class EquipmentTest
{
	/**
     * Test the Equipment constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment hammer = new Equipment("Hammer/10,5.0,10.0,tool for hammering");

        Assert.assertEquals("Hammer", hammer.getName());
        Assert.assertEquals(10, hammer.getCount());
        Assert.assertEquals(5.0, hammer.getTotalWeight(), 0.01);
        Assert.assertEquals(10.0, hammer.getTotalPrice(), 0.01);
        Assert.assertEquals("tool for hammering", hammer.getDescription());
    }
    
    public void equalsTest() throws AssertException
    {
    	Equipment knife = new Equipment("Knife/5,5.0,25.0,tool for cutting");
    	Equipment knifeClone = knife;
    	Equipment spoon = new Equipment("Spoon/1,2.0,5.0,tool for eating");
    	Equipment spoonToo = new Equipment("Spoon/1,2.0,5.0,tool for eating");
    	
    	Animal a1 = new Animal("green", "snake", 15.0, 20.0);
    	
    	// Tests all branches of the equals() method
    	Assert.assertEquals(true, knife.equals(knifeClone));
    	Assert.assertEquals(false, knife.equals(a1));
    	Assert.assertEquals(false, knife.equals(spoon));
    	Assert.assertEquals(true, spoon.equals(spoonToo));
    }
    
    public void toStringTest() throws AssertException
    {
    	Equipment axe = new Equipment("Axe/2,10.0,25.0,tool for cutting");
    	
    	Assert.assertEquals("Name: Axe, Number: 2, Weight: 10.00 lbs, Price: $25.00 - tool for cutting", axe.toString());
    }
}