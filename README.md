Akakce.com Test Otomasyon Projesi
📚 Proje Hakkında
Bu proje, Java programlama dili kullanılarak, Selenium WebDriver ile geliştirilmiş bir web test otomasyon projesidir.
Akakce.com sitesinde bir kullanıcının gerçekleştirebileceği temel işlemler (hesap oluşturma, giriş yapma, çıkış yapma, sipariş listesi kontrolü, mesaj kutusu kontrolü ve hesap silme) senaryoları otomatikleştirilmiştir.

Amacım, Akakce.com kullanıcı akışlarının doğru çalıştığını test etmek ve olası hataları önceden tespit etmektir.

📋 Gerçekleştirilen Kullanıcı Hikayeleri

Kullanıcı Hikayesi	Açıklama
US_101	Kullanıcı hesabı oluşturma
US_102	Giriş yaptıktan sonra kullanıcı adının doğrulanması
US_103	Kullanıcının hesabından çıkış yapması
US_104	Sisteme giriş yapma
US_105	Sipariş listesi kontrolü
US_106	Mesaj kutusu kontrolü
US_107	Kullanıcı hesabının silinmesi
✅ Uygulanan Test Senaryoları
Pozitif Testler:

Başarılı hesap oluşturma

Başarılı giriş yapma ve hesap doğrulama

Başarılı çıkış yapma

Boş sipariş listesi ve mesaj kutusu kontrolü

Başarılı hesap silme

Negatif Testler:

Eksik bilgiyle hesap oluşturma (hata kontrolü)

Geçersiz e-posta veya şifre ile giriş denemesi

Boş (null) bilgi ile giriş denemesi

Yanlış şifre ile hesap silmeye çalışma

