package lab4;
import lab4.client.*;
import lab4.gui.*;

public class GomokuMain {
	private static int port = 4500;	// The default port number is 4500.

	public static void main(String[] argv) {
		if (argv.length == 1) {
			int tempPort = Integer.parseInt(argv[0]);	// Problem if the argument is not a number.
			
			if (tempPort > 0) {	// A port number needs to be a positive integer.
				port = tempPort;
			}
		
		GomokuClient client = new GomokuClient(port);
		GomokuGameState gameState = new GomokuGameState(client);
		GomokuGUI gui = new GomokuGUI(gameState, client);
	}
}
