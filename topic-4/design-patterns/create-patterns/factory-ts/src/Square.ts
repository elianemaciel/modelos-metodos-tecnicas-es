import { Shape } from "./interfaces/Shape.interface";

export class Square implements Shape {
    side: number;
    constructor(side: number) {
        this.side = side;
    }
    draw() {
        console.log('Inside Square::draw() method.');
    }
}