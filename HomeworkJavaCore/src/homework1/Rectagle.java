package homework1;

public class Rectagle {
int widthOfRectagle;
int hightOfRectagle;

public Rectagle(){
widthOfRectagle = 3;
hightOfRectagle = 5;

}

public Rectagle(int widthOfRectagle, int hightOfRectagle) {
	this.widthOfRectagle = widthOfRectagle;
	this.hightOfRectagle = hightOfRectagle;
}
public int area(){
	return widthOfRectagle * hightOfRectagle;
}

public int perimeter(){
	return 2 * (widthOfRectagle+hightOfRectagle);
}

@Override
public String toString() {
	return "Rectagle [widthOfRectagle=" + widthOfRectagle + ", hightOfRectagle=" + hightOfRectagle + "]";
}

}
