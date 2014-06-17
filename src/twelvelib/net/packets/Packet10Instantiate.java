package twelvelib.net.packets;

public class Packet10Instantiate extends Packet {
	public int nid;
	public String tag; //Tag being spawned.
	public float x, y, z, a, b, c, i, j, k, l; // 3 location, 3 velocity, 4 rotation
	
	public Packet10Instantiate(int n, String t, float x, float y, float z, float a, float b, float c, float i, float j, float k, float l) {
		nid = n;
		tag = t;
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
		this.b = b;
		this.c = c;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}
	
	public Packet10Instantiate() {
		
	}
	
	public int packetType() {
		return 10;
	}
}