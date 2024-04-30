/// <reference lib="dom" />

import { Shape } from "./interfaces/Shape.interface";

export class Circle implements Shape {
    draw() {
        console.log('Inside Circle::draw() method.');
    }
}