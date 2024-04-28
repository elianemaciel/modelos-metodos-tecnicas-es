import { Shape } from "./interfaces/Shape.interface";

export class Rectangle implements Shape {
    draw(): void {
        console.log('Inside Rectangle::draw() method.');
    }
}