import { Square } from "./Square";

export class RedSquare extends Square {

    constructor(height: number) {
        super(height, 'red');
    }
    draw() {
        console.log('Inside RedSquare::draw() method.');
    }
}