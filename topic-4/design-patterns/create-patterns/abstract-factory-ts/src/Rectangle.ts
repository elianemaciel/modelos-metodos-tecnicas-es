import { Shape } from "./Shape";

export abstract class Rectangle extends Shape {

    base: number;

    constructor(base: number, color: string) {
        super(color);
        this.base = base;
    }

    public getBase(): number {
        return this.base;
    }

    public setBase(base: number): void {
        this.base = base;
    }
}