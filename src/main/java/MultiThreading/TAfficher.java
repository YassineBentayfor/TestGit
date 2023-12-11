package MultiThreading;

class TAfficher1 extends Thread // la classe qui représente le thread.
{   String txt; // La chaîne à afficher
    int attente; // Le délai d'attente entre deux caractères
    public TAfficher1 (String t, int p) { txt = t; attente = p;}
    @Override
    public void run() // Une méthode contenant le code du thread
    { for (int i=0; i<txt.length(); i++) // Parcourt de la chaîne txt
    {System.out.print(txt.charAt(i) +" "); // Affichage du caractère d'indice i dans la chaîne txt
        try {
            sleep(attente); // le thread s'endort
        } //Traitement d'erreur
        catch(InterruptedException e) {System.out.println(e.toString());};
    }
    }
}

public class TAfficher extends Thread // La classe des threads.
{ String txt; // La chaîne à afficher
    int attente; // Le délai d'attente entre deux caractères
    static MoniteurImpression M = new MoniteurImpression(); // attribut static
    public TAfficher (String t, int p) { txt = t; attente = p;}
    public void run()
    { for (int i=1; i<3; i++) // Affichage de la chaîne txt trois fois avec la fonction Imprimer du moniteur
    { M.Imprimer (txt, attente);
        // Une attente de 50 millisecondes après chaque accès au moniteur
        try{ sleep(50);} catch (InterruptedException e) {};
    }
    }
}
