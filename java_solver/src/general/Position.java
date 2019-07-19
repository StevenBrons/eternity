package general;

public class Position {

	int position;

	public Position(String ps) {
		position = (byte) (Integer.parseInt(ps, 16) + Byte.MIN_VALUE);
	}

	public static Position[] getPositionsFromPositionString(String ps) {
		Position[] positions = new Position[ps.length() / 2];
		for (int i = 0; i < ps.length() / 2; i++) {
			positions[i] = new Position(ps.charAt(i * 2) + "" + ps.charAt(i * 2 + 1));
		}
		return positions;
	}

	@Override
	public String toString() {
		return "\u001B[31m" + (((int) position) + 128);
	}

}