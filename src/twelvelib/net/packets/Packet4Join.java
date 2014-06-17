package twelvelib.net.packets;

public class Packet4Join extends Packet {
	public boolean loadSucsess;
	
	public Packet4Join(boolean b) {
		loadSucsess = b;
	}
	
	public Packet4Join() {
		
	}
	
	public int packetType() {
		return 4;
	}
}