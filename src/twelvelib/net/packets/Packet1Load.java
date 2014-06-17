package twelvelib.net.packets;

public class Packet1Load extends Packet {
	public boolean loginSucsess; //If this is false then we just disconnect.
	public String scenario; //Scenario to load.
	public String[] modlist; //List of mod packages on the server, if we are missing some then we download them from the server.
	
	public Packet1Load(boolean l, String s, String m[]) {
		loginSucsess = l;
		scenario = s;
		modlist = m;
	}
	
	public Packet1Load() {

	}
	
	public int packetType() {
		return 1;
	}
}