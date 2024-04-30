import { AbstractFactory } from "./AbstractFactory";
import { RedCircle } from "./RedCircle";
import { RedRectangle } from "./RedRectangle";
import { RedSquare } from "./RedSquare";

export class RedShapeFactory extends AbstractFactory {
  getCircle(ray: number) {
    return new RedCircle(ray);
  }
  getRetangle(base: number) {
    return new RedRectangle(base);
  }
  getSquare(height: number) {
    return new RedSquare(height);
  }

}