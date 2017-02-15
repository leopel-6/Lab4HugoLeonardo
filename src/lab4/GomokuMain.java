package lab4;
import lab4.client.*;
import lab4.gui.*;

public class GomokuMain {
	private static int port;

	public static void main(String[] argv) {
		if (argv.length == 1) {
			int tempPort = Integer.parseInt(argv[0]);	// Problem if the argument is not a number.
			
			if (tempPort > 0) {	// A port number needs to be a positive integer.
				port = tempPort;
			}	// Should we set the port to default number if the tempPort is < 0?
		} else {
			port = 4500;
		}
		
		GomokuClient client = new GomokuClient(port);
		GomokuGameState gameState = new GomokuGameState(client);
		GomokuGUI gui = new GomokuGUI(gameState, client);
	}
}
