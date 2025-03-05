public class Droid {
   int batteryLevel;
   String name;
   String performTas;

public Droid( String droidName){
name = droidName;
batteryLevel= 100;
}
public String toString(){
   return "hola mundo" + name;
}
public void performTask(String task){
   System.out.println(name + " is performTask  " + task);
   batteryLevel -= 10;
   energyReport();
}

public void energyReport(){
   System.out.println("Current battery lebel: " + batteryLevel + "%.");
}
}