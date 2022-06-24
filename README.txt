1. patikahm1_1 içinde immutable bir car sınıfı oluşturulup mainde constructorla içi doldurulmuştur, dha sonra toString() metoduyla ekrana yazıdılmıştır.

2. Producer-consurmer ödevi için iki ayrı proje oluşturulmuştur, patikahw1_2_Consumer ve patikahw1_2_Producer:

	- Projeler çalıştırılmadan önce, "D" dizini altına boş bir score.txt dosyası oluşturulmalıdır.

	- Öncelikle consumer projesini çalıştırılması gerekmektedir, bu proje score.txt' nin içi doluysa içindeki değerleri yazdırdıktan sonra dosyanın içini silmektedir.

	- Daha sonra producer projesini çalıştırınız, producer projesi konsoldan girdiğiniz değerleri score.txt' ye yazacaktır, 
	  Producer projesini durdurmak ve Consumer projesinin çalışmasını görmek için skor girmenizi isteyen yere hiçbir şey girmeden enter' a basın, 
	  Daha sonra Consumer projesinin çalıştığını göreceksiniz.

3. Üçüncü proje ikinci projenin threadler ile yapılmış ve score.txt yerine linkedlist string kullanılmış halidir, patikahw1_3: 
	
	- Program sizden skor istemekte daha sonra bu skor önce producer sonra da consumer thread' i tarafından konsola yazılmaktadır.

	- Programı bitirmek için kendinizin terminate etmesi gerekmektedir.