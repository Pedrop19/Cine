public class App {
    public static void main(String[] args) throws Exception {
        //Personas
        Persona persona = new Persona("555X");
        Joven joven = new Joven("666X", 5);
        Jubilado jubilado = new Jubilado("777X", "55555X");

        //Salas
        Sala sala = new Sala("Titatic", 5, 6, 0, 0);
        Sala sala2 = new Sala("Terminator", 1, 1, 0, 0);

        sala.asignarAsientos(persona);
        sala2.asignarAsientos(joven);
        sala2.asignarAsientos(jubilado);

        System.out.println(sala2.toString());

        int result = 0;
for (int i = 0; i < 5; i++) {
  if (i == 3) { 
     result += 10;
   } else {
     result += i;
   }	
}
System.out.println(result);
    }
}
