package ch.spacebase.mcprotocol.net.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;

public class PacketConfirmTransaction extends Packet {

	public byte id;
	public short action;
	public boolean confirm;
	
	public PacketConfirmTransaction() {
	}
	
	public PacketConfirmTransaction(byte id, short action, boolean confirm) {
		this.id = id;
		this.action = action;
		this.confirm = confirm;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.id = in.readByte();
		this.action = in.readShort();
		this.confirm = in.readBoolean();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeByte(this.id);
		out.writeShort(this.action);
		out.writeBoolean(this.confirm);
	}

	@Override
	public void handleClient(Client conn) {
	}
	
	@Override
	public void handleServer(ServerConnection conn) {
	}
	
	@Override
	public int getId() {
		return 106;
	}
	
}
