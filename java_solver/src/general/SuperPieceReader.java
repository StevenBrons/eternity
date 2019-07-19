package general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.*;

import super_pieces.*;

public class SuperPieceReader {

	static byte piece_index = Byte.MIN_VALUE;

	public static Stream<SuperPiece> readPieces(String fileName) throws IOException {
		BufferedReader brTest = new BufferedReader(new FileReader(new File(fileName)));
		SuperPieceFormat format = SuperPieceFormat.valueOf(brTest.readLine());
		brTest.close();
		switch (format) {
		case base_piece_format:
			return readBasePieceFormat(fileName);
		// case complete_bit_format:
		// return readCompleteBitFormat(fileName);
		default:
			return null;
		}
	}

	private static Stream<SuperPiece> readBasePieceFormat(String fileName) throws IOException {
		piece_index = 0;
		return Files.lines(Paths.get(fileName)).skip(1)
				.flatMap((x) -> SuperPieceFormatConvertor.basePieceFormatToSuperPieceObject(x, piece_index++));
	}
}
