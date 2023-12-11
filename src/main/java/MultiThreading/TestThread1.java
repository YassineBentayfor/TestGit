package MultiThreading;

public class TestThread1{
    static public void main(String[] args)
    {
        TAfficher A = new TAfficher("Bonjour", 100); //Création du premier thread A
        TAfficher B = new TAfficher ("Au revoir", 200); //Création du deuxième thread B
        A.start(); // Démarrage de l'exécution du premier thread  exécution de la méthode run()
        B.start(); // Démarrage de l'exécution du deuxième thread
    }
}