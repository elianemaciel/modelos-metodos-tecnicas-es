import { FactoryProducer } from "./FactoryProducer";


const shapeBlueFactory = FactoryProducer.getFactory('BLUE');

const shape1 = shapeBlueFactory?.getCircle(1);

shape1.draw();
