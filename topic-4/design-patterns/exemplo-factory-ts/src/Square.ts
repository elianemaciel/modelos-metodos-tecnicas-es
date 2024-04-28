import { Shape } from "./interfaces/Shape.interface";

export class Square implements Shape {
    draw() {
        console.log('Inside Square::draw() method.');
    }
}