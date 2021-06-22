package MineSweeper;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class MineSweeper {
    public static void main(String[] args) {
        String [][] map = {
                {"*", "."}
        };

        final int MAP_HEIGHT = map.length;
        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
        for(int yIndex = 0; yIndex < MAP_HEIGHT; yIndex++){
            for(int xIndex = 0; xIndex < MAP_WIDTH; xIndex++) {
                String curentCell = map[0][xIndex];
                if (curentCell.equals("*")) {
                    mapReport[0][xIndex] = "*";
                } else {
                    final int[][] NEIGHBOURS_ORDINATE = {
                            {0, xIndex - 1}, {0, xIndex + 1}
                    };

                    int minesAround = 0;

                    for (int i = 0; i < NEIGHBOURS_ORDINATE.length; i++) {
                        int[] neighbourOrdinate = NEIGHBOURS_ORDINATE[i];
                        int xOrdinateOfNeighbour = neighbourOrdinate[1];
                        int yOrdinateOfNeighbour = neighbourOrdinate[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == MAP_WIDTH;
                        if (isOutOfMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                        if (isMineOwnerNeighbour) minesAround++;
                    }

//                boolean hasNeighbourAtLeft = xIndex - 1 >= 0;
//                boolean hasMineAtLeft = hasNeighbourAtLeft && map[0][xIndex - 1].equals("*");
//                if(hasMineAtLeft) minesAround++;
//
//                boolean hasNeighbourAtRight = xIndex + 1 < MAP_WIDTH;
//                boolean hasMineAtRight = hasNeighbourAtRight && map[0][xIndex + 1].equals("*");
//                if (hasMineAtRight) minesAround++;

                    mapReport[0][xIndex] = String.valueOf(minesAround);
                }
            }
        }

        for (int xIndex = 0; xIndex < MAP_WIDTH; xIndex++) {
            String currentCellReport = mapReport[0][xIndex];
            System.out.print(currentCellReport);
        }
    }
}
