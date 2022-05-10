# JAVAbaseApps
temel desktop uygulamaları
*****Kitap Sıralayıcı*****

Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.


*****GenericClass*****

Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.<br>
MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.<br>
MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.<br>
size() : dizideki eleman sayısını verir.<br>
getCapacity() : dizinin kapasite değerini verir.<br>
add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.<br>
get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.<br>
remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.<br>
set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.<br>
String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.<br>
int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.<br>
int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.<br>
boolean isEmpty() : Listenin boş olup olmadığını söyler.<br>
T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.<br>
clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.<br>
MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.<br>
boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.<br>


*****maaşHesaplama*****

Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.<br>
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.<br>
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.<br>
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.<br>
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.<br>
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.<br>
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.<br>

*****mayınTarlası****

bilgisayarlarda yer alan mayın tarlası oyununun konsol uygulaması

*****ögrenciNot*****

temel okul öğrenci sistemlerinin yer aldığı not uygulaması

****oyun*****

Java ile boks maçını simüle eden console uygulaması

*****atm projesi*****

temel atm fonksiyonlarını gösteren console uygulaması

