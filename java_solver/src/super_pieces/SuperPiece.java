package super_pieces;

import general.*;

public class SuperPiece {

	private EdgeType top[];
	private EdgeType right[];
	private EdgeType bottom[];
	private EdgeType left[];
	private byte ids[];
	private byte rotation[];

	SuperPiece(byte[] ids, byte rotation[], EdgeType top[], EdgeType right[], EdgeType bottom[], EdgeType left[]) {
		this.ids = ids;
		this.rotation = rotation;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
		this.left = left;
	}

	public EdgeType getTop(int index) {
		return top[index];
	}

	public EdgeType getRight(int index) {
		return right[index];
	}

	public EdgeType getBottom(int index) {
		return bottom[index];
	}

	public EdgeType getleft(int index) {
		return left[index];
	}

	public int getDimension() {
		return top.length;
	}

	public byte getId(int index) {
		return ids[index];
	}

	public byte getKind(int index) {
		if (ids[index] >= 0 && ids[index] < 4) {
			return 0;
		}
		if (ids[index] >= 4 && ids[index] < 60) {
			return 1;
		}
		return 2;
	}

	public byte getRotation(int index) {
		return rotation[index];
	}

	public OneDimensionalSuperPiece[] getOnedimensionalSuperPieces() {
		OneDimensionalSuperPiece ps[] = new OneDimensionalSuperPiece[top.length];
		for (int i = 0; i < top.length; i++) {
			ps[i] = new OneDimensionalSuperPiece(ids[i], rotation[i], top[i], right[i], bottom[i], left[i]);
		}
		return ps;
	}

}