public class Parallelogram {
   int p;
//    int width;
//    int sideLength;

    int calculatePerimeter(int length, int width) {
    int perimetru=2*(length+width);
                System.out.println("Length este = "+length+"  Width este= "+width+ "  Perimetrul calculat este:   "+perimetru);
return perimetru;
    }
        int calculatePerimeter(int sideLength) {
        int p=6*(sideLength);
            System.out.println("Perimetrul este:   "+p);
        return p;

        }

        double calculateArea(int length, double width) {
            System.out.println("Length este = "+length+"  Width este= "+width+ "  Aria calculata este:   "+length*width);
        return length*width;


       }
        int calculateArea(int sideLength) {
        int Area=sideLength*5;
        System.out.println("Aria calculata este:   "+Area);
        return  Area;



       }

}
//2.	Creați o clasă cu denumirea Parallelogram. Definiți următoarele 4 metode și logica corespunzătoare pentru calculul arie și al perimetrului:
//
//        int calculatePerimeter(int length, int width) { }
//        int calculatePerimeter(int sideLength) { }--lungime latura
//
//        double calculateArea(int length, double width) { }
//        int calculateArea(int sideLength) { }
//
//        Într-o clasă care are metoda main, instanțiați obiecte de tipul clasei Parallelogram, apelați metodele de calcul al ariei și perimetrului. Asigurați-vă că rezultatul invocării acestor metode este corect.
