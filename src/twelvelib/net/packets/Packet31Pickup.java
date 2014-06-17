package twelvelib.net.packets;

public class Packet31Pickup extends Packet {
	public int nid;
	public int item;
	
	public Packet31Pickup(int n, int i) {
		nid = n;
		item = i;
	}
	
	public Packet31Pickup() {
		
	}
	
	public int packetType() {
		return 31;
	}
}