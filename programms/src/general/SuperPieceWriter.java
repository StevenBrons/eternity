package general;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class SuperPieceWriter {

	public Stream<SuperPiece> writePieces(File file, Stream<SuperPiece> pieces, SuperPieceFormat format) {
		switch (format) {
		case human_readable_no_rotate:
			writeHumanReadableNoRotateFormat(file, pieces);
		}
	}

	private void writeHumanReadableNoRotateFormat(File file, Stream<String> pieces) {
		BufferedWriter out = new BufferedWriter(new PrintWriter(file));
		pieces.map(superPiece -> {

		}).forEach(out::write);
	}
}