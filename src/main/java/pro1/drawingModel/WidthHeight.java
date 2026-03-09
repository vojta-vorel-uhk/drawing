package pro1.drawingModel;

public abstract class WidthHeight extends XY {
    protected int width;
    protected int height;

    public WidthHeight(int x, int y,int height, int width) {
        super(x,y);
        this.height = height;
        this.width = width;
    }
}
