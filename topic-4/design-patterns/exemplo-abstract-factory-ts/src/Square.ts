import { Shape } from "./Shape";

export abstract class Square extends Shape {
    height: number;

    constructor(height: number, color: string) {
        super(color);
        this.height = height;
    }

    public getHeight(): number {
        return this.height;
    }

    public setHeight(height: number): void {
        this.height = height;
    }
}