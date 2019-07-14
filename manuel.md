# Program manuel

### Copy and convert super piece files

Command: ``copy_to_format $1 $2 $3``
Arguments:
All file locations are relative tot the executed program.
- **$1** The super piece format to write the file new file in.
- **$2** The source super piece file location.
- **$3** The destination super piece file location.

### Border heuristic

Command: ``border_heuristic $1``
Arguments:
- **$1** The super piece to perform the border heuristic on. By definition nothing happens if the specified super piece does not lie at the border.

### Mandatory heuristic

Commmand: ``mandatory_heuristic $1``
Arguments:
- **$1** The super piece to perform the mandatory heuristic on. By definition nothing happens if the specified super piece lies not at position of the mandatory piece.

### Clue heuristic

Commmand: ``clue_heuristic $1``
Arguments:
- **$1** The super piece to perform the clue heuristic on. By definition nothing happens if the specified super piece lies not at position of either of the four clue piece positions.

### Combine super pieces
Combines two super pieces to create one of a higher dimension. The `edge_heuristic` and `duplicate_heuristic` are performed.

Command: ``save_and_combine $1 $2``
Arguments:
- **$1** First super piece
- **$2** Second super piece
