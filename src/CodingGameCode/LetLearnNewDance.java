package CodingGameCode;

public class LetLearnNewDance {

	public int calculate( int iterationNumber )
	   {
	      int position = 0;
	      int step1 = 1;
	      position = position + step1;
	      iterationNumber = iterationNumber - 1;
	      int step2 = -2;
	      position = position + step2;
	      iterationNumber -= 1;
	      while( iterationNumber > 0 )
	      {
	         position = position + ( step2 - step1 );
	         int buffer = step1;
	         step1 = step2;
	         step2 = step2 - buffer;
	         iterationNumber -= 1;
	      }
	      return position;
	   }

	  
	   public void positionOfTheDancerTest()
	   {
	//      assertEquals( -4, LetLearnNewDance.calculate( 3 ) );
	  //    assertEquals( -5, LetLearnNewDance.calculate( 100000 ) );
	  //   assertEquals( 1, LetLearnNewDance.calculate( 2147483647 ) );
	   }
}
