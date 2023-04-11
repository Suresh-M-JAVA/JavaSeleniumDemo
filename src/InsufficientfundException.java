
public class InsufficientfundException extends Exception {
  double amount;
  InsufficientfundException(double a){
	  amount=a;
  }
}
