package Dasar;
public class Game {
public static void main(String[] args){
// membuat objek player
Run cilsy = new Run();
// mengisi atribut player
cilsy.name = "Cilsy";
cilsy.speed = 90;
cilsy.healthPoin = 50;
// menjalankan method
cilsy.run();
if(cilsy.isDead()){
System.out.println("Game Over!");
}
}
}