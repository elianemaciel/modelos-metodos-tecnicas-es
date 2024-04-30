export abstract class AbstractFactory {
    abstract getCircle(ray: number): any;
    abstract getRetangle(base: number): any;
    abstract getSquare(height: number): any;
}