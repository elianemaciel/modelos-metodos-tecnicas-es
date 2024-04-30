import { Rectangle } from "./Rectangle";

export class RedRectangle extends Rectangle{

    constructor(base: number) {
        super(base, 'red');
    }
    draw() {
        console.log('Inside RedRectangle::draw() method.');
    }
}