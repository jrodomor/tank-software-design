package ru.mipt.bit.platformer.util;

import ru.mipt.bit.platformer.Tank;

import static com.badlogic.gdx.math.MathUtils.isEqual;

public class MovementUtils {
    public static Tank moveUp(Tank tank) {
        if (isEqual(tank.getTankMovementProgress(), 1f)) {
            tank.getTankDestinationCoordinates().y++;
            tank.setTankMovementProgress(0f);
            tank.setTankRotation(90);
        }
        return tank;
    }
// оставил подглядывать как было
    /*public static float moveDown(GridPoint2 playerDestinationCoordinates, float playerMovementProgress) {
        if (isEqual(playerMovementProgress, 1f)) {//if that true then go for one step if not do not go
            playerDestinationCoordinates.y--;
            playerMovementProgress = 0f;
        }
        return playerMovementProgress;
    }*/

    public static Tank moveDown(Tank tank) {
        if (isEqual(tank.getTankMovementProgress(), 1f)) {//if that true then go for one step if not do not go
            tank.getTankDestinationCoordinates().y--;
            tank.setTankMovementProgress(0f);
            tank.setTankRotation(-90);
        }
        return tank;
    }

    public static Tank moveLeft(Tank tank) {
        if (isEqual(tank.getTankMovementProgress(), 1f)) {
            tank.getTankDestinationCoordinates().x--;
            tank.setTankMovementProgress(0f);
            tank.setTankRotation(180f);
        }
        return tank;
    }
    public static Tank moveRight(Tank tank) {
        if (isEqual(tank.getTankMovementProgress(), 1f)) {
            tank.getTankDestinationCoordinates().x++;
            tank.setTankMovementProgress(0f);
            tank.setTankRotation(0f);
        }
        return tank;
    }
}