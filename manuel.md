# Program manuel

### Copy and convert super piece files

Command: ``java -jar copy_to_format $1 $2 $3``
Arguments:
All file locations are relative tot the executed program.
- **$1** The super piece format to write the file new file in.
- **$2** The source super piece file location.
- **$3** The destination super piece file location.

### Border heuristic

Command: ``start_heuristics $1``
Arguments:
- **$1** The super piece to perform the starting heuristics on: the mandatory piece, clue piece and border heuristics. Only works for one dimensional super pieces.

### Combine super pieces
Combines two super pieces to create one of a higher dimension. The `edge_heuristic` and `duplicate_heuristic` are performed.

Command: ``save_and_combine $1 $2``
Arguments:
- **$1** First super piece
- **$2** Second super piece
