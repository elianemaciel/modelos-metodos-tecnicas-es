import { Rectangle } from "./Rectangle";

export class BlueRectangle extends Rectangle {
      
      constructor(base: number) {
          super(base, 'blue');
      }
  
      draw(): void {
          console.log('Inside BlueRectangle::draw() method.');
      }
}