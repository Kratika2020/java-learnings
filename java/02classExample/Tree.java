public class Tree {
    double heightft;
    double diameter;
    Treetype treetype;

    Tree(double heightft, double diameter,Treetype treetype) {
        this.heightft = heightft;
        this.diameter = diameter;
        this.treetype = treetype;
    }

    void grow() {
        this.heightft = this.heightft + 10;
        this.diameter = this.diameter + 1;
    }

}

