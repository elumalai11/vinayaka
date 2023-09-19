package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class casestudy2 {
  @Test
  public void rus() 
  {
	  String name="russia";
	  Assert.assertEquals(name, "russia");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void fin() 
  {
	  String name="finland";
	  Assert.assertEquals(name, "finland");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void in() 
  {
	  String name="india";
	  Assert.assertEquals(name, "india");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void ch() 
  {
	  String name="china";
	  Assert.assertEquals(name, "china");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void en() 
  {
	  String name="uk";
	  Assert.assertEquals(name, "uk");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void sr() 
  {
	  String name="srilanka";
	  Assert.assertEquals(name, "srilanka");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void sc() 
  {
	  String name="scotland";
	  Assert.assertEquals(name, "scotland");
	  System.out.println("The given country is correct As:"+name);
  }
  
}
