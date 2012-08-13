package ch.spacebase.mcprotocol.net.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;

public class PacketBlockChange extends Packet {

	public int x;
	public int y;
	public int z;
	public short block;
	public byte data;
	
	public PacketBlockChange() {
	}
	
	public PacketBlockChange(int x, int y, int z, short block, byte data) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.block = block;
		this.data = data;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.x = in.readInt();
		this.y = in.readByte();
		this.z = in.readInt();
		this.block = in.readShort();
		this.data = in.readByte();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.x);
		out.writeByte(this.y);
		out.writeInt(this.z);
		out.writeShort(this.block);
		out.writeByte(this.data);
	}

	@Override
	public void handleClient(Client conn) {
	}
	
	@Override
	public void handleServer(ServerConnection conn) {
	}
	
	@Override
	public int getId() {
		return 53;
	}
	
}
