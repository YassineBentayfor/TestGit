package MultiThreading;

public class MoniteurImpression //Le moniteur
{ //La méthode d'affichage de la chaîne t avec un délai d'attente d entre deux caractères.
    synchronized public void Imprimer(String t, int d)
    { for (int i=0; i<t.length(); i++)
    { System.out.print(t.charAt(i));
        try { Thread.currentThread().sleep(d); // Le thread appelant s'endort pendant d (ms)
        } catch (InterruptedException e) {System.out.println(e.toString());};
    }
    }
}
