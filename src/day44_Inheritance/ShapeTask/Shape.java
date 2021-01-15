package day44_Inheritance.ShapeTask;

    public class Shape { // this is a super class something common for every shape
    public String name;
    public final static boolean isShape, hasArea, hasPerimeter;

        public Shape(String name) {
            this.name= name;
        }
        // final is used to not change the variables anymore to make the method constant


    static{
        isShape = true;
        hasArea= true;
        hasPerimeter = true;
    }

    public double calcArea(){
        return 0;
    }
    public double calcPerimeter(){
        return 0;
    }

        @Override
        public String toString() {
            return "Shape{" +
                    "name='" + name + '\'' +
                    "Area ='"+calcArea()+'\''+
                    "Perimeter = '"+ calcPerimeter()+'\''+
                    '}';
        }
    }
/*
     1. create a class called Shape
                        variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
                        methods: setInfo, calcArea(), calcPerimeter(),
                                 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()

 */


