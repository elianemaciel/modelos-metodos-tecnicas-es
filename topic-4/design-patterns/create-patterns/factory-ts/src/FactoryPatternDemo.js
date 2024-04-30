"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FactoryPatternDemo = void 0;
var ShapeFactory_1 = require("./ShapeFactory");
var FactoryPatternDemo = /** @class */ (function () {
    function FactoryPatternDemo() {
    }
    FactoryPatternDemo.prototype.main = function () {
        var shapeFactory = new ShapeFactory_1.default();
        var circle = shapeFactory.getShape("CIRCLE");
        circle === null || circle === void 0 ? void 0 : circle.draw();
        var rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle === null || rectangle === void 0 ? void 0 : rectangle.draw();
        var square = shapeFactory.getShape("SQUARE");
        square === null || square === void 0 ? void 0 : square.draw();
    };
    return FactoryPatternDemo;
}());
exports.FactoryPatternDemo = FactoryPatternDemo;
