/**
 * Testing class for Zoo object
 *
 * @author Braden Munn
 * @version 2019-02-11
 */
public class ZooTest
{

    /**
     * Test the Zoo getters and toString()
     */
    public void getTotalHeightTest() throws AssertException
    {
        // Use the default constructor
        Zoo firstZoo = new Zoo(5);
        Animal a1 = new Animal("lizard", "green", 10.0, 5.0);
        Animal a2 = new Animal("llama", "white", 70.0, 60.0);
        
        firstZoo.addAnimal(a1);
        firstZoo.addAnimal(a2);
        
        //Tests getTotalHeight() method
        Assert.assertEquals(65.0, firstZoo.getTotalHeight()); 
    }
    
    public void getCapacityTest() throws AssertException
    {
    	Zoo secondZoo = new Zoo(3);
        Animal a1 = new Animal("chicken", "brown", 25.0, 15.0);
        Animal a2 = new Animal("snake", "white", 15.0, 5.0);
        
        //Tests getCapacity() method
        Assert.assertEquals(3, secondZoo.getCapacity());  
        
        secondZoo.addAnimal(a1);
        secondZoo.addAnimal(a2);
    	
    	//Tests getCapacity() method
        Assert.assertEquals(3, secondZoo.getCapacity());  
    }
    
    public void toStringTest() throws AssertException
    {
    	Zoo thirdZoo = new Zoo(3);
        Animal a1 = new Animal("brown", "horse", 50.0, 60.0);
        Animal a2 = new Animal("white", "goat", 25.0, 30.0);
        
        thirdZoo.addAnimal(a1);
        thirdZoo.addAnimal(a2);
        
        Assert.assertEquals("These animals live in the zoo: \nhorse, a brown-colored animal. 50.0 pounds, 60.0 inches\ngoat, a white-colored animal. 25.0 pounds, 30.0 inches\n", thirdZoo.toString());
    }
    
}