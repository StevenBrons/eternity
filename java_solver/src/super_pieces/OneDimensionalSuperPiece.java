package super_pieces;

import general.*;

public class OneDimensionalSuperPiece extends SuperPiece {

	public OneDimensionalSuperPiece(byte id, byte rotation, EdgeType top, EdgeType right, EdgeType bottom,
			EdgeType left) {
		super(new byte[] { id }, new byte[] { rotation }, new EdgeType[] { top }, new EdgeType[] { right },
				new EdgeType[] { bottom }, new EdgeType[] { left });
	}

	public EdgeType getTop() {
		return super.getTop(0);
	}

	public EdgeType getRight() {
		return super.getRight(0);

	}

	public EdgeType getBottom() {
		return super.getBottom(0);
	}

	public EdgeType getleft() {
		return super.getleft(0);
	}

	@Override
	public int getDimension() {
		return 1;
	}

}