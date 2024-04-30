import ShapeFactory from "./ShapeFactory";
export class FactoryPatternDemo {
    public main(): void {
        const shapeFactory = new ShapeFactory();
        const circle = shapeFactory.getShape("CIRCLE");
        circle?.draw();
        const rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle?.draw();
        const square = shapeFactory.getShape("SQUARE");
        square?.draw();
    }
}