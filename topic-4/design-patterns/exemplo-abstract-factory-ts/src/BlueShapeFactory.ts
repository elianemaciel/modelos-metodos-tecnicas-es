import { AbstractFactory } from "./AbstractFactory";
import { BlueCircle } from "./BlueCircle";
import { BlueRectangle } from "./BlueRetangle";
import { BlueSquare } from "./BlueSquare";

export class BlueShapeFactory extends AbstractFactory {
  getCircle(ray: number) {
    return new BlueCircle(ray);
  }
  getRetangle(base: number) {
    return new BlueRectangle(base);
  }
  getSquare(height: number) {
    return new BlueSquare(height);
  }

}