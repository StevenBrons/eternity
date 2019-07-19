package copy_to_format;

import java.io.File;
import java.util.stream.Stream;

import general.*;
import super_pieces.*;

public class CopyToFormat {

	public static void main(String[] temp) throws Exception {
		String[] args = { "complete_bit_f1", "base_pieces", "./output/00" };
		if (args.length < 3) {
			throw new Exception("Please provide three arguments, see manuel");
		}
		SuperPieceFormat format = SuperPieceFormat.valueOf(args[0]);
		Stream<SuperPiece> pieces = SuperPieceReader.readPieces(args[1]);
		SuperPieceWriter.writePieces(new File(args[2]), pieces, format);
	}

}