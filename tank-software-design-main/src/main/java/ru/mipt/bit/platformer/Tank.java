package ru.mipt.bit.platformer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Rectangle;

import static ru.mipt.bit.platformer.util.GdxGameUtils.createBoundingRectangle;

public class Tank {
    private Texture blueTankTexture;
    private TextureRegion tankGraphics;
    private Rectangle tankRectangle;
    // player current position coordinates on level 10x8 grid (e.g. x=0, y=1)
    private GridPoint2 tankCoordinates;
    // which tile the player want to go next
    private GridPoint2 tankDestinationCoordinates;
    private float tankMovementProgress;
    private float tankRotation;

    public void setPlayerTankParameters(){
        // Texture decodes an image file and loads it into GPU memory, it represents a native resource
        blueTankTexture = new Texture("images/tank_blue.png");
        // TextureRegion represents Texture portion, there may be many TextureRegion instances of the same Texture
        tankGraphics = new TextureRegion(blueTankTexture);
        tankRectangle = createBoundingRectangle(tankGraphics);
        // set player initial position
        tankDestinationCoordinates = new GridPoint2(1,1);
        tankCoordinates = new GridPoint2(tankDestinationCoordinates);
        tankMovementProgress = 1f;
        tankRotation = 0f;
    }

    public Texture getBlueTankTexture() {
        return blueTankTexture;
    }

    public TextureRegion getTankGraphics() {
        return tankGraphics;
    }

    public Rectangle getTankRectangle() {
        return tankRectangle;
    }

    public GridPoint2 getTankCoordinates() {
        return tankCoordinates;
    }

    public GridPoint2 getTankDestinationCoordinates() {
        return tankDestinationCoordinates;
    }

    public float getTankMovementProgress() {
        return tankMovementProgress;
    }

    public float getTankRotation() {
        return tankRotation;
    }

    public void setBlueTankTexture(Texture blueTankTexture) {
        this.blueTankTexture = blueTankTexture;
    }

    public void setTankGraphics(TextureRegion tankGraphics) {
        this.tankGraphics = tankGraphics;
    }

    public void setTankRectangle(Rectangle tankRectangle) {
        this.tankRectangle = tankRectangle;
    }

    public void setTankCoordinates(GridPoint2 tankCoordinates) {
        this.tankCoordinates = tankCoordinates;
    }

    public void setTankDestinationCoordinates(GridPoint2 tankDestinationCoordinates) {
        this.tankDestinationCoordinates = tankDestinationCoordinates;
    }

    public void setTankMovementProgress(float tankMovementProgress) {
        this.tankMovementProgress = tankMovementProgress;
    }

    public void setTankRotation(float tankRotation) {
        this.tankRotation = tankRotation;
    }
}
