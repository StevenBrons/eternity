package super_pieces;

import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
import general.*;

public class SuperPieceFormatConvertor {

	public static final int TOP_EDGE_POSITION = 0;
	public static final int RIGHT_EDGE_POSITION = 5;
	public static final int BOTTOM_EDGE_POSITION = 10;
	public static final int LEFT_EDGE_POSITION = 15;
	public static final int PIECE_INDEX_POSITION = 20;
	public static final int ROTATION_POSITION = 28;
	public static final int KIND_POSITION = 30;

	public static int[] superPieceObjectToCompactBitFormat(SuperPiece s) {
		int pieces[] = new int[s.getDimension()];
		for (int i = 0; i < pieces.length; i++) {
			pieces[i] = s.getTop(i).ordinal() << TOP_EDGE_POSITION;
			pieces[i] += s.getRight(i).ordinal() << RIGHT_EDGE_POSITION;
			pieces[i] += s.getBottom(i).ordinal() << BOTTOM_EDGE_POSITION;
			pieces[i] += s.getleft(i).ordinal() << LEFT_EDGE_POSITION;
			pieces[i] += (s.getId(i) > 0 ? (int) s.getId(i) : ((int) s.getId(i)) + 256) << PIECE_INDEX_POSITION;
			pieces[i] += s.getRotation(i) << ROTATION_POSITION;
			pieces[i] += s.getKind(i) << KIND_POSITION;
		}
		return pieces;
	}

	public static String superPieceObjectToBasePieceFormat(SuperPiece s2) {
		OneDimensionalSuperPiece s = (OneDimensionalSuperPiece) s2;
		return " ( top " + s.getTop() + " right " + s.getRight() + " bottom " + s.getBottom() + " left " + s.getleft()
				+ " )\n";
	}

	public static Stream<SuperPiece> basePieceFormatToSuperPieceObject(String s, byte piece_index) {
		ArrayList<SuperPiece> superPieces = new ArrayList<>();
		Scanner scanner = new Scanner(s);
		while (scanner.hasNext()) {
			scanner.next(); // (
			scanner.next(); // top
			EdgeType top = EdgeType.valueOf(scanner.next());
			scanner.next(); // right
			EdgeType right = EdgeType.valueOf(scanner.next());
			scanner.next(); // bottom
			EdgeType bottom = EdgeType.valueOf(scanner.next());
			scanner.next(); // left
			EdgeType left = EdgeType.valueOf(scanner.next());
			scanner.next(); // )

			superPieces.add(new OneDimensionalSuperPiece(piece_index, (byte) 0x00, top, right, bottom, left));
			superPieces.add(new OneDimensionalSuperPiece(piece_index, (byte) 0x01, left, top, right, bottom));
			superPieces.add(new OneDimensionalSuperPiece(piece_index, (byte) 0x02, bottom, left, top, right));
			superPieces.add(new OneDimensionalSuperPiece(piece_index, (byte) 0x03, right, bottom, left, top));

			if (scanner.hasNext() && scanner.next().equals(",")) {
				continue;
			} else {
				break;
			}
		}
		scanner.close();
		return superPieces.stream();
	}

}