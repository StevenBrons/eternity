package general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.stream.Stream;

import super_pieces.*;

public class SuperPieceWriter {

	public static void writePieces(File file, Stream<SuperPiece> pieces, SuperPieceFormat format) throws IOException {
		switch (format) {
		case base_piece_format:
			writeBasePieceFormat(file, pieces);
			break;
		case complete_bit_f1:
			writeCompleteBitFormat(file, pieces);
			break;
		}
	}

	public static void writeCompleteBitFormat(File file, Stream<SuperPiece> pieces) throws IOException {
		OutputStream out = new FileOutputStream(file);
		out.write("complete_bit_f1\n".getBytes());
		pieces.map(SuperPieceFormatConvertor::superPieceObjectToCompactBitFormat).forEach(t -> {
			try {
				for (int i = 0; i < t.length; i++) {
					out.write(ByteBuffer.allocate(4).putInt(t[i]).array());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		out.close();
	}

	private static void writeBasePieceFormat(File file, Stream<SuperPiece> pieces) throws IOException {
		BufferedWriter out = new BufferedWriter(new PrintWriter(file));
		out.write("base_piece_format\n");
		pieces.map(SuperPieceFormatConvertor::superPieceObjectToBasePieceFormat).forEach(t -> {
			try {
				out.write(t);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		out.close();
	}
}
