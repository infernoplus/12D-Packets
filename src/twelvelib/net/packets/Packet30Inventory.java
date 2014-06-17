package twelvelib.net.packets;

public class Packet30Inventory extends Packet {
	public int nid;
	public int items[];
	
	public Packet30Inventory(int n, int i[]) {
		nid = n;
		items = i;
	}
	
	public Packet30Inventory() {
		
	}
	
	public int packetType() {
		return 30;
	}
}