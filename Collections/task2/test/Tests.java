import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    String[] words = {"the","cat","in","the","hat"};
    Counter<String> c = new Counter<>(words);
    Assert.assertEquals("Are you sure your get count is working correctly?",(Integer)2,c.getCount("the"));
    Assert.assertEquals("Is your most frequent element correctly computed?","the",c.mostFrequent());
    Assert.assertEquals("Are you sure you are counting all the unique words?",4,c.getSize());
  }
}