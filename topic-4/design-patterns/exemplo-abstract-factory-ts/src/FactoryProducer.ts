import { AbstractFactory } from "./AbstractFactory";
import { BlueShapeFactory } from "./BlueShapeFactory";
import { RedShapeFactory } from "./RedShapeFactory";

export class FactoryProducer {
    static getFactory(choice: string): AbstractFactory | null {
        if (choice === 'BLUE') {
            return new BlueShapeFactory();
        } else if (choice === 'RED') {
            return new RedShapeFactory();
        }
        return null;
    }
}