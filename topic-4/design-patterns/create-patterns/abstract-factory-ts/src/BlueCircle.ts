import { Circle } from "./Circle";

export class BlueCircle extends Circle {

    constructor(ray: number) {
        super(ray, 'blue');
    }
    draw() {
        console.log('Inside BlueCircle::draw() method.');
    }
}