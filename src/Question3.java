import java.io.*;
import java.lang.*;
import java.util.*;

class Question3 {
	public static void main(String[] args) throws java.lang.Exception {

		File file = new File("problem.txt"); // Okunacak olan dosya yolu
		Scanner s = new Scanner(file); // Dosya okunuyor

		Map<String, Integer> hashMap = new HashMap<>(); // Hashmap tan�mlama ve �rnekleme
		TreeSet<String> ts = new TreeSet<>(); // Treeset tan�mlama ve �rnekleme

		int t;
		t = s.nextInt(); // t kadar olacak olan test adetini nextInt() ile okuyoruz
		for (int i = 0; i < t; i++) { // t kadar olan test adeti d�ng�s�
			hashMap.clear();
			ts.clear();
			// �rnekledi�imiz HashMap ve Treeseti temizliyoruz

			int n;
			n = s.nextInt(); // n kadar olacak olan banka hesap adetini nextInt() ile okuyoruz
			String s1;
			s1 = s.nextLine();
			for (int j = 0; j < n; j++) { // d�ng�de n kadar sat�r(banka hesab�) okunuyor
				s1 = s.nextLine();
				ts.add(s1);
				if (hashMap.get(s1) != null) { // if kontrol�nde
					int val = hashMap.get(s1); // daha �nce b�yle bir banka hesab� olup olmad���n� kontrol ediyoruz
					val++; // banka hesab� daha �nceden varsa val de�erini 1 art�r�yoruz
					hashMap.put(s1, val); // banka hesab�n� val de�eri ile birlikte hashmape ekliyoruz
				} else { // banka hesab� daha �nce yoksa key=>hesap numaras� value=>1 de�erini veriyoruz
					hashMap.put(s1, 1);
				}
			}
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				s1 = itr.next();
				System.out.println(s1 + " " + hashMap.get(s1)); // Iterator ile banka hesap numaralar�n� ve tekrar
																// adetlerini yazd�r�yoruz
			}
			
			System.out.println();
		}
	}
}