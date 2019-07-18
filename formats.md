# Board

**Notice:** The board with the mandatory piece is not rotationally symetric. Therefore it is possible to determine a welldefined  coordinate system.

```

      0 1 2 3 4 5 6 7 8 9 A B C D E F

0     $ # # # # # # # # # # # # # # $
1     # . . . . . . . . . . . . . . #
2     # . ! . . . . . . . . . . ! . #
3     # . . . . . . . . . . . . . . #
4     # . . . . . . . . . . . . . . #
5     # . . . . . . . . . . . . . . #
6     # . . . . . . . . . . . . . . #
7     # . . . . . . . . . . . . . . #
8     # . . . . . . . M . . . . . . #
9     # . . . . . . . . . . . . . . #
A     # . . . . . . . . . . . . . . #
B     # . . . . . . . . . . . . . . #
C     # . . . . . . . . . . . . . . #
D     # . ! . . . . . . . . . . ! . #
E     # . . . . . . . . . . . . . . #
F     $ # # # # # # # # # # # # # # $

```

In this diagram the following symbols are used:
	-  The **$** symbol indicate a cornor piece
	-  The **#** symbol indicate a border piece
	-  The **.** symbol indicate a center piece
	-  The **M** symbol indicate the mandatory piece
	-  The **!** symbol indicate a clue piece

Coordinates should always be writen in the xy format in hexidecimal like: `A1, K2, BA`.
Some important coordinates are:
The mandatory piece: `88`
The clue pieces: `22, D2, 2D, DD`

# Edges
In total there are 24 distinct edges. They are listed below together with a unique name.

## Border edges
| `VOID` ![img](./pieces_images/VOID.bmp)       | `LEATHER` ![img](./pieces_images/LEATHER.bmp) |
| --------------------------------------------- | --------------------------------------------- |
| `FLOWER` ![img](./pieces_images/FLOWER.bmp)   | `BOLT` ![img](./pieces_images/BOLT.bmp)       |
| `BISQUIT` ![img](./pieces_images/BISQUIT.bmp) | `STOP` ![img](./pieces_images/STOP.bmp)       |

--------------------
figure indexes
--------------------
NONE            = 00 
VOID            = 01 
BISQUIT         = 02 
BLUE_CASTLE     = 03 
BLUE_DIAMOND    = 04 
BLUE_RECTANLE   = 05 
BLUE_STAR       = 06 
BOLT            = 07 
FLOWER          = 08 
GREEN_CIRCLE    = 09 
GREEN_RECTANGLE = 10 
LEATHER         = 11 
ORANGE_DIAMOND  = 12 
ORANGE_PIPES    = 13 
PINK_CASTLE     = 14 
PINK_CIRCLE     = 15 
PINK_DIAMOND    = 16 
PINK_PIPES      = 17 
PURPLE_STAR     = 18 
STOP            = 19 
YELLOW_PIPES    = 20 
YELLOW_CASTLE   = 21 
YELLOW_CIRCLE   = 22 
YELLOW_STAR     = 23 

--------------------
piece format
--------------------
1. top
2. right
3. bottom
4. left

## Center edges
| `YELLOW_PIPES` ![img](./pieces_images/YELLOW_PIPES.bmp)       | `GREEN_CIRCLE` ![img](./pieces_images/GREEN_CIRCLE.bmp)   |
| ------------------------------------------------------------- | --------------------------------------------------------- |
| `BLUE_DIAMOND` ![img](./pieces_images/BLUE_DIAMOND.bmp)       | `BLUE_STAR` ![img](./pieces_images/BLUE_STAR.bmp)         |
| `ORANGE_DIAMOND` ![img](./pieces_images/ORANGE_DIAMOND.bmp)   | `YELLOW_STAR` ![img](./pieces_images/YELLOW_STAR.bmp)     |
| `PINK_DIAMOND` ![img](./pieces_images/PINK_DIAMOND.bmp)       | `BLUE_CASTLE` ![img](./pieces_images/BLUE_CASTLE.bmp)     |
| `PURPLE_STAR` ![img](./pieces_images/PURPLE_STAR.bmp)         | `YELLOW_CASTLE` ![img](./pieces_images/YELLOW_CASTLE.bmp) |
| `YELLOW_CIRCLE` ![img](./pieces_images/YELLOW_CIRCLE.bmp)     | `PINK_PIPES` ![img](./pieces_images/PINK_PIPES.bmp)       |
| `PINK_CIRCLE` ![img](./pieces_images/PINK_CIRCLE.bmp)         | `PINK_CASTLE` ![img](./pieces_images/PINK_CASTLE.bmp)     |
| `GREEN_RECTANGLE` ![img](./pieces_images/GREEN_RECTANGLE.bmp) | `ORANGE_PIPES` ![img](./pieces_images/ORANGE_PIPES.bmp)   |
| `BLUE_RECTANGLE` ![img](./pieces_images/BLUE_RECTANGLE.bmp)   |                                                           |

# Mandatory piece
At the coordinate `88` the follwing piece is mandatory: `( top BLUE_STAR right YELLOW_CIRCLE bottom YELLOW_CIRCLE left ORANGE_DIAMOND )`

# Clue pieces
`C3` is given as `( top PINK_CIRCLE right GREEN_CIRCLE bottom ORANGE_DIAMOND left YELLOW_STAR )`
`N3` is given as `( top PINK_CIRCLE right PURPLE_STAR bottom PINK_CIRCLE left BLUE_RECTANGLE )`
`C14` is given as `( top BLUE_RECTANGLE right YELLOW_CIRCLE bottom YELLOW_CASTLE left ORANGE_DIAMOND )`
`N14` is given as `( top PINK_DIAMOND right YELLOW_CASTLE bottom GREEN_RECTANGLE left BLUE_CASTLE )`

# Super pieces formats

## Filename
A super pieces file should be named after the positions of the pieces it represents. Like:
`A1A2` `F3F4` `B3`
The positions should be ordered the order of the hexdecimal values the positions represent. No file extension is given.

## Format indicator
The first line of the file should always contain the format like:
``<format>`` where `<format>` should be replaced by the used format.

**Notice:** A single piece is identified by its edges which is possible by property **~xxx~**.

## Formats

### Human readable format
``human_readable_no_rotate``
Each piece is stored as: 
```
( top <edge_name> right <edge_name> bottom <edge_name> left <edge_name> )
```
Each `<edge_name>` should be replaced by the edge name as given in **~xxx~**
Each piece represents all rotations, so to get the full set, all possible rotations should read.

**Restriction:** Only supports one dimensional super pieces











