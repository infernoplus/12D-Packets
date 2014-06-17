package twelvelib.net.packets;

public class Packet21Rotation extends Packet {
	public int nid;
	public boolean force;
	public float i, j, k, l;
	
	public Packet21Rotation(int n, boolean f, float i, float j, float k, float l) {
		nid = n;
		force = f;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}
	
	public Packet21Rotation() {
		
	}
	
	public int packetType() {
		return 21;
	}
}