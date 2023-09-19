package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class casestudy1 {
  @Test
  public void as() 
  {
	  String name="australia";
	  Assert.assertEquals(name, "australia");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void ne() 
  {
	  String name="new zealand";
	  Assert.assertEquals(name, "new zealand");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void ja() 
  {
	  String name="japan";
	  Assert.assertEquals(name, "japan");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void ca() 
  {
	  String name="canada";
	  Assert.assertEquals(name, "canada");
	  System.out.println("The given country is correct As:"+name);
  }
  @Test
  public void ge() 
  {
	  String name="germany";
	  Assert.assertEquals(name, "germany");
	  System.out.println("The given country is correct As:"+name);
  }
}
