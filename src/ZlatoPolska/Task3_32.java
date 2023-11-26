package ZlatoPolska;

public class Task3_32 {
    /*
    Записать условие, которое является истинным, когда точка с координатами (х, у)
    попадает в заштрихованные участки плоскости, включая их границы
     */
    public static void main(String[] args) {
        //a
        int x = 0, y = 0;
        boolean isInCoordinates = x<=-2 && y>=1;
        //b
        isInCoordinates = y>=-2 && y<=1.5;
        //c
        isInCoordinates = (x>=1 && x<=2) && (y>=1 && y<=4);
        //d
        isInCoordinates = x>=1 && (y>=2 && y<=4);
        //e
        isInCoordinates = (x>=2 && y>=0) || (x>=1 && y<=-1);
        //f
        isInCoordinates = x>=2 && (y>1 || y<=-1.5);
        //g
        isInCoordinates = (x>=1 && x<=3) && (y<=-1 && y>=-2);
        //h
        isInCoordinates = (x<2 && (y>=0.5 && y<=1.5)) || x>=2;
    }
}
