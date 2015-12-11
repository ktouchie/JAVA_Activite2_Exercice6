import java.util.Scanner;
class Exercice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une annee:");
        int annee = sc.nextInt();
        String string1 = "est une annee bissextile.";
        String string2 = "n'est pas une annee bissextile.";
        String ly = (annee%100==0) ? ((annee%400==0) ? string1 : string2) : ((annee%4==0) ? string1 : string2);
        System.out.println("Cette annee " + ly);
	}

}