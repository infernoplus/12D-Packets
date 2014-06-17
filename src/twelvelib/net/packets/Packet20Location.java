package twelvelib.net.packets;

public class Packet20Location extends Packet {
	public int nid;
	public boolean force;
	public float x, y, z, a, b, c;
	
	public Packet20Location(int n, boolean f, float x, float y, float z, float a, float b, float c) {
		nid = n;
		force = f;
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Packet20Location() {
		
	}
	
	public int packetType() {
		return 20;
	}
}