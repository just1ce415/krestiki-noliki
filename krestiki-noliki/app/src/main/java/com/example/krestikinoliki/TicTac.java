package com.example.proj3;

/**
 * false = krest
 * true = null
 */

public class TicTac {
    private boolean turn = false;
    public boolean isTurn() {
        return turn;
    }
    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public boolean IsEnd (int[] pole){
        if (pole[getXY(1, 1, 1)] != 0 && pole[getXY(1, 1, 1)] == pole[getXY(1, 2, 1)] && pole[getXY(1, 2, 1)] == pole[getXY(1, 3, 1)]) {
            return true;
        }
        else if (pole[getXY(4, 1, 1)] != 0 && pole[getXY(4, 1, 1)] == pole[getXY(4, 2, 1)] && pole[getXY(4, 2, 1)] == pole[getXY(4, 3, 1)]) {
            return true;
        }
        else if (pole[getXY(7, 1, 1)] != 0 && pole[getXY(7, 1, 1)] == pole[getXY(7, 2, 1)] && pole[getXY(7, 2, 1)] == pole[getXY(7, 3, 1)]) {
            return true;
        }
        else if (pole[getXY(1, 1, 3)] != 0 && pole[getXY(1, 1, 3)] == pole[getXY(1, 2, 3)] && pole[getXY(1, 2, 3)] == pole[getXY(1, 3, 3)]) {
            return true;
        }
        else if (pole[getXY(2, 1, 3)] != 0 && pole[getXY(2, 1, 3)] == pole[getXY(2, 2, 3)] && pole[getXY(2, 2, 3)] == pole[getXY(2, 3, 3)]) {
            return true;
        }
        else if (pole[getXY(3, 1, 3)] != 0 && pole[getXY(3, 1, 3)] == pole[getXY(3, 2, 3)] && pole[getXY(3, 2, 3)] == pole[getXY(3, 3, 3)]) {
            return true;
        }
        else if (pole[getZ(3, 1)] != 0 && pole[getZ(3, 1)] == pole[getZ(3, 2)] && pole[getZ(3, 2)] == pole[getZ(3, 3)]) {
            return true;
        }
        else if (pole[getZ(1, 1)] != 0 && pole[getZ(1, 1)] == pole[getZ(1, 2)] && pole[getZ(1, 2)] == pole[getZ(1, 3)]) {
            return true;
        }
        else if(pole[0] != 0 && pole[1] != 0 && pole[2] != 0 && pole[3] != 0 && pole[4] != 0 && pole[5] != 0 && pole[6] != 0 && pole[7] != 0 && pole[8] != 0){
            return true;
        }
        else {
            return false;
        }
    }

    private int getXY (int val, int i, int xy){
        if (i == 1)
            return val - 1;
        else if (i == 2)
            return val + xy - 1;
        else
            return val + xy*2 - 1;
    }
    private int getZ (int val, int i){
        if (val == 1){
            if (i == 1)
                return val - 1;
            else if (i == 2)
                return val + 3;
            else
                return val + 7;
        }
        else{
            if (i == 1)
                return val - 1;
            else if (i == 2)
                return val + 1;
            else
                return val + 3;
        }
    }
}
