package mcjty.lostcities.gui.elements;

import com.mojang.blaze3d.matrix.MatrixStack;

public class GuiElement {

    protected final int x;
    protected final int y;

    protected final String page;

    public GuiElement(String page, int x, int y) {
        this.page = page;
        this.x = x;
        this.y = y;
    }

    public void tick() {

    }

    public void render(MatrixStack stack) {

    }

    public void update() {

    }

    public void setEnabled(boolean b) {

    }

    public void setBasedOnMode(String mode) {

    }
}
