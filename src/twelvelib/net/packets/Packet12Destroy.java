package twelvelib.net.packets;

public class Packet12Destroy extends Packet {
	public int nid;
	
	public Packet12Destroy(int n) {
		nid = n;
	}
	
	public Packet12Destroy() {
		
	}
	
	public int packetType() {
		return 12;
	}
}