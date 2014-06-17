package twelvelib.net.packets;

public class Packet11RequestActor extends Packet {
	public int nid;
	
	public Packet11RequestActor(int n) {
		nid = n;
	}
	
	public Packet11RequestActor() {
		
	}
	
	public int packetType() {
		return 11;
	}
}