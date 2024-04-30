import { Square } from "./Square";

export class BlueSquare extends Square {

    constructor(height: number) {
        super(height, 'blue');
    }
    draw() {
        console.log('Inside BlueSquare::draw() method.');
    }
}