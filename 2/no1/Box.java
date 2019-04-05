public class Box{
    private double width, height, depth, density, mass;
    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getDensity() {
        density = mass / (height * width *depth);
        return density;
    }
}
