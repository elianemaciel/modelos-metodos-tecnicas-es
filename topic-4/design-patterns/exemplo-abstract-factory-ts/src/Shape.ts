export abstract class Shape {
    private color: string;
    constructor(color: string) {
        this.color = color;
    }

    public getColor(): string {
        return this.color;
    }

    public setColor(color: string): void {
        this.color = color;
    }

    public abstract draw(): void;
}