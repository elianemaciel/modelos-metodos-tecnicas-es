import { Circle } from "./Circle";

export class RedCircle extends Circle {
    constructor(ray: number) {
        super(ray, 'red');
    }
    draw() {
        console.log('Inside RedCircle::draw() method.');
    }
}