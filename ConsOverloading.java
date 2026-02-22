public class ConsOverloading{

// When we have mad many fuctions of same name-this is calles function overloading

//NOW WE WILL DISCUSS CONSTRUCTOR OVEROADING-but for this each constructor should have diff number of parameters

// 1st constructor
String name; String fatherName;
ConsOverloading(String name, String fatherName){
this.name=name;
this.fatherName=fatherName;
}

// 2nd constructor
String grade;
ConsOverloading(String name, String fatherName, String grade){
this(name, fatherName);  //Constructor calling inside constrctor-this should be the first statement
this.grade=grade;

}

public String toString(){
if(grade!=null){
 return (name+ " "+fatherName+ " " +grade);
}
else{
 return " ";
}
}
}