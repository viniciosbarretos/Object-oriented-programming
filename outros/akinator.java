import java.util.Random;

public class random {
	public static void main (String args[]) {

	Random randomNumber = new Random();
	int attempt=0, low=1, up=10, guess;
	int num = randomNumber.nextInt(10) + 1;

	while (low <= up) {
		attempt++;
		guess = (low + up) / 2;
		if (guess == num)
			break;
    if (guess > num)
			up = guess-1;
    else
			low = guess+1;
	}

	System.out.println("System found the number " + num + " in " + attempt + " attempts");

	System.exit(0);
	}
}
