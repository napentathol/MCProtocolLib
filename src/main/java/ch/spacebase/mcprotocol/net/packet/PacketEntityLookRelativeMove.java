package ch.spacebase.mcprotocol.net.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;

public class PacketEntityLookRelativeMove extends Packet {

	public int entityId;
	public byte dX;
	public byte dY;
	public byte dZ;
	public byte yaw;
	public byte pitch;
	
	public PacketEntityLookRelativeMove() {
	}
	
	public PacketEntityLookRelativeMove(int entityId, byte dX, byte dY, byte dZ, byte yaw, byte pitch) {
		this.entityId = entityId;
		this.dX = dX;
		this.dY = dY;
		this.dZ = dZ;
		this.yaw = yaw;
		this.pitch = pitch;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.entityId = in.readInt();
		this.dX = in.readByte();
		this.dY = in.readByte();
		this.dZ = in.readByte();
		this.yaw = in.readByte();
		this.pitch = in.readByte();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(this.entityId);
		out.writeByte(this.dX);
		out.writeByte(this.dY);
		out.writeByte(this.dZ);
		out.writeByte(this.yaw);
		out.writeByte(this.pitch);
	}

	@Override
	public void handleClient(Client conn) {
	}
	
	@Override
	public void handleServer(ServerConnection conn) {
	}
	
	@Override
	public int getId() {
		return 33;
	}
	
}
