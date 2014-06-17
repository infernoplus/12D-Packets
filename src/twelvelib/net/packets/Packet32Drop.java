package twelvelib.net.packets;

public class Packet32Drop extends Packet {
	public int nid;
	public int item;
	
	public Packet32Drop(int n, int i) {
		nid = n;
		item = i;
	}
	
	public Packet32Drop() {
		
	}
	
	public int packetType() {
		return 32;
	}
}