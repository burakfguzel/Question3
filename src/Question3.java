import java.io.*;
import java.lang.*;
import java.util.*;

class Question3 {
	public static void main(String[] args) throws java.lang.Exception {

		File file = new File("problem.txt"); // Okunacak olan dosya yolu
		Scanner s = new Scanner(file); // Dosya okunuyor

		Map<String, Integer> hashMap = new HashMap<>(); // Hashmap tanýmlama ve örnekleme
		TreeSet<String> ts = new TreeSet<>(); // Treeset tanýmlama ve örnekleme

		int t;
		t = s.nextInt(); // t kadar olacak olan test adetini nextInt() ile okuyoruz
		for (int i = 0; i < t; i++) { // t kadar olan test adeti döngüsü
			hashMap.clear();
			ts.clear();
			// Örneklediðimiz HashMap ve Treeseti temizliyoruz

			int n;
			n = s.nextInt(); // n kadar olacak olan banka hesap adetini nextInt() ile okuyoruz
			String s1;
			s1 = s.nextLine();
			for (int j = 0; j < n; j++) { // döngüde n kadar satýr(banka hesabý) okunuyor
				s1 = s.nextLine();
				ts.add(s1);
				if (hashMap.get(s1) != null) { // if kontrolünde
					int val = hashMap.get(s1); // daha önce böyle bir banka hesabý olup olmadýðýný kontrol ediyoruz
					val++; // banka hesabý daha önceden varsa val deðerini 1 artýrýyoruz
					hashMap.put(s1, val); // banka hesabýný val deðeri ile birlikte hashmape ekliyoruz
				} else { // banka hesabý daha önce yoksa key=>hesap numarasý value=>1 deðerini veriyoruz
					hashMap.put(s1, 1);
				}
			}
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				s1 = itr.next();
				System.out.println(s1 + " " + hashMap.get(s1)); // Iterator ile banka hesap numaralarýný ve tekrar
																// adetlerini yazdýrýyoruz
			}
			
			System.out.println();
		}
	}
}