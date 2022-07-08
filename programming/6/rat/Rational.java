/**
 * Rational class by Team BangPi
 * Seth Adams
 * collaborators: Rachel Kaufman, Seth Adams, Jihae Park, Rich Parker
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  //_ in front of the variable is to indicate that it's an instance variable
  private int _numerator;
  private int _denominator;

  //***this keyword is optional**** it's a question of style
  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    //this(); calls the default constructor inside the constructor
    if (d == 0) {
      System.out.println("You cannot divide by 0! You have been defaulted.");
      _numerator = 0;
      _denominator = 1; 
    } else {
      _numerator = n;
      _denominator = d;  
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  // it is possible that you initialize a variable and return the variable as below:
    //String rational = _numerator + "/" + _denominator;
    //return rational;
  public String toString()
  {
     //1.0*_numerator /_denominator will also convert this to a double. It's important that you multiply it by 1.0 first
    return (_numerator + "/" + _denominator);
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double)_numerator /_denominator;

  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    _numerator *= r._numerator;
    _denominator *= r._denominator;
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    if(r._numerator != 0){
      _numerator *= r._denominator;
      _denominator *= r._numerator;
    } else{
      System.out.println("Invalid");
    }
    
  }

}//end class