package twelvelib.net.packets;

public class Packet13Kill extends Packet {
	public int nid;
	
	public Packet13Kill(int n) {
		nid = n;
	}
	
	public Packet13Kill() {
		
	}
	
	public int packetType() {
		return 13;
	}
}