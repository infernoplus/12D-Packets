package twelvelib.net.packets;

public class Packet0Login extends Packet {
	public String username; //The username of the client trying to log in. The server queries the master server to see if they are logged in, or ignore it in offline mode.
	public String password; //This is the password for the SERVER not the account.
	
	public Packet0Login(String user, String pass) {
		username = user;
		password = pass;
	}
	
	public Packet0Login() {

	}
	
	public int packetType() {
		return 0;
	}
}