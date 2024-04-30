/// <reference lib="dom" />

import { Shape } from "./Shape";

export abstract class Circle extends Shape {
    ray: number;

    constructor(ray: number, color: string) {
        super(color);
        this.ray = ray;
    }

    public getRay(): number {
        return this.ray;
    }

    public setRay(ray: number): void {
        this.ray = ray;
    }
}