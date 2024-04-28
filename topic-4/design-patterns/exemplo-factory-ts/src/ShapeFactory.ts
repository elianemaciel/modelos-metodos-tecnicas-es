import { Circle } from "./Circle";
import { Rectangle } from "./Rectangle";
import { Square } from "./Square";
import { Shape } from "./interfaces/Shape.interface";

export default class ShapeFactory {
    public getShape(shapeType: string): Shape | null {
        if (shapeType === 'CIRCLE') {
            return new Circle();
        } else if (shapeType === 'RECTANGLE') {
            return new Rectangle();
        } else if (shapeType === 'SQUARE') {
            return new Square();
        }
        return null;
    }
}