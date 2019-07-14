package general;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class SuperPieceReader {

	public Stream<SuperPiece> readPieces(File f) {
		Stream<String> lines = Files.lines(Paths.get(fileName));
		SuperPieceFormat formatString = SuperPieceFormat.valueOf(lines.findFirst());
		switch (formatString) {
		case human_readable_no_rotate:
			return readHumanReadableNoRotateFormat(lines.skip(1).unordered().parallel());
		}
	}

	private Stream<SuperPiece> readHumanReadableNoRotateFormat(Stream<String> lines) {
		ArrayList<SuperPiece> superPieces = new ArrayList<>();
		return lines.flatMap(line -> {
			superPieces.clear();
			Scanner scanner = new Scanner(line);
			while (scanner.hasNext()) {
				scanner.next(); // (
				scanner.next(); // top
				String top = scanner.next();
				scanner.next(); // right
				String right = scanner.next();
				scanner.next(); // bottom
				String bottom = scanner.next();
				scanner.next(); // left
				String right = scanner.next();
				scanner.next(); // )

				superPieces.add(new SuperPiece(top, right, bottom, left));
				superPieces.add(new SuperPiece(left, top, right, bottom));
				superPieces.add(new SuperPiece(bottom, left, top, right));
				superPieces.add(new SuperPiece(right, bottom, left, top));

				if (scanner.hasNext() && scanner.next().equals(",")) {
					continue;
				} else {
					return Stream.of(superPieces);
				}
			}
		});
	}
}

enum SuperPieceFormat {
	human_readable_no_rotate,
}