class ShapeFactory {
    public getShape(shapeType: string): Shape {
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