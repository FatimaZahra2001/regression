import java.util.ArrayList;

public class LinearRegression {
  Integer[] xs = {1,2,3};
  Integer[] ys = {1,5,11};

  int epochs = 100;
  double w1 = 1;
  double w0 = 1;
  double alpha = 1;
  double cost = 0;
  double y_this;


  public void data(){
    for(int i = 0; i < epochs; i++){
      cost = 0;
      for(int x = 0; x < xs.length; x++){
        y_this = (w1 * xs[x]) + w0;
        cost += ((ys[x] - y_this) * (ys[x] - y_this));

        w1 += alpha * (ys[x] - y_this) * xs[x];
        w0 += alpha * (ys[x] - y_this);
      }
      System.out.println("Cost: " + cost + "\nw0: " + w0 + "\nw1: " + w1);
    }
  }

  public static void main(String[] args) {
    LinearRegression linearRegression = new LinearRegression();
    linearRegression.data();

  }
}
