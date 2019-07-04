# Board

**Notice:** The board with the mandatory piece is not rotationally symetric. Therefore it is possible to determine a welldefined  coordinate system.

```

      A B C D E F G H I J K L M N O P

1     $ # # # # # # # # # # # # # # $
2     # . . . . . . . . . . . . . . #
3     # . ! . . . . . . . . . . ! . #
4     # . . . . . . . . . . . . . . #
5     # . . . . . . . . . . . . . . #
6     # . . . . . . . . . . . . . . #
7     # . . . . . . . . . . . . . . #
8     # . . . . . . . . . . . . . . #
9     # . . . . . . . M . . . . . . #
10    # . . . . . . . . . . . . . . #
11    # . . . . . . . . . . . . . . #
12    # . . . . . . . . . . . . . . #
13    # . . . . . . . . . . . . . . #
14    # . ! . . . . . . . . . . ! . #
15    # . . . . . . . . . . . . . . #
16    $ # # # # # # # # # # # # # # $

```

In this diagram the following symbols are used:
	-  The **$** symbol indicate a cornor piece
	-  The **#** symbol indicate a border piece
	-  The **.** symbol indicate a center piece
	-  The **M** symbol indicate the mandatory piece
	-  The **!** symbol indicate a clue piece

Coordinates should always be writen in the xy format like: `A1, K2, B10`.
Some important coordinates are:
The mandatory piece: `I9`
The clue pieces: `C3, N3, C14, N14`

# Edges
In total there are 24 distinct edges. They are listed below together with a unique name.

## Border edges
| `VOID` ![img](./pieces_images/VOID.bmp)       | `LEATHER` ![img](./pieces_images/LEATHER.bmp) |
| --------------------------------------------- | --------------------------------------------- |
| `FLOWER` ![img](./pieces_images/FLOWER.bmp)   | `BOLT` ![img](./pieces_images/BOLT.bmp)       |
| `BISQUIT` ![img](./pieces_images/BISQUIT.bmp) | `STOP` ![img](./pieces_images/STOP.bmp)       |








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

# Super pieces formats
A super pieces file should be named after the positions of the pieces it represents. Like:
``A1A2``
``F3F4G3G4``
``B3``
The first line of the file should always contain the format like:
``format <format>`` where `<format>` should be replaced by the used format.

**Notice:** A single piece is identified by its edges which is possible by property **~xxx~**.

## Human readable format
``format hrf``
Each piece is stored as: 
```
(top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>)
```
Each `<edge_name>` should be replaced by the edge name as given in **~xxx~**

A single possiblility of a super piece is stored as the pieces concatinated by ` , `.
```
(top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>) , (top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>)
```

Every super piece possebility is seperated by a line break.

```
(top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>) , (top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>)
(top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>) , (top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>)
(top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>) , (top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>)
(top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>) , (top <edge_name> right <edge_name> bottom <edge_name> right <edge_name>)
```













