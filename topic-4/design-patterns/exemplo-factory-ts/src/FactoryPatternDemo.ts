class FactoryPatternDemo {
    public static main(): void {
        const shapeFactory = new ShapeFactory();
        const circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        const rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        const square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}