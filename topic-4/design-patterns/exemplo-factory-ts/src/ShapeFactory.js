"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Circle_1 = require("./Circle");
var Rectangle_1 = require("./Rectangle");
var Square_1 = require("./Square");
var ShapeFactory = /** @class */ (function () {
    function ShapeFactory() {
    }
    ShapeFactory.prototype.getShape = function (shapeType) {
        if (shapeType === 'CIRCLE') {
            return new Circle_1.Circle();
        }
        else if (shapeType === 'RECTANGLE') {
            return new Rectangle_1.Rectangle();
        }
        else if (shapeType === 'SQUARE') {
            return new Square_1.Square();
        }
        return null;
    };
    return ShapeFactory;
}());
exports.default = ShapeFactory;
