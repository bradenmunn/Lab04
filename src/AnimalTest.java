/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
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
        
        Animal animal2 = new Animal();
        
        // Tests the equals() method
        Assert.assertTrue(animal1.equals(animal2));
        
    }

    // TODO: test full constructor, getters, and toString
}

