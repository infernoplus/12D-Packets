package twelvelib.net.packets;

public class Packet41Control extends Packet {
	public int nid;
	
	public Packet41Control(int n) {
		nid = n;
	}
	
	public Packet41Control() {
		
	}
	
	public int packetType() {
		return 41;
	}
}