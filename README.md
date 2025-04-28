<h1>Akakce.com Test Otomasyon Projesi</h1>

<h2>📚 Proje Hakkında</h2>
<p>
Bu proje, <strong>Java programlama dili</strong> kullanılarak, <strong>Selenium WebDriver</strong> ile geliştirilmiş bir web test otomasyon projesidir.<br>
Akakce.com sitesinde bir kullanıcının gerçekleştirebileceği temel işlemler (hesap oluşturma, giriş yapma, çıkış yapma, sipariş listesi kontrolü, mesaj kutusu kontrolü ve hesap silme) senaryoları otomatikleştirilmiştir.
</p>
<p>
Amacım, Akakce.com kullanıcı akışlarının doğru çalıştığını test etmek ve olası hataları önceden tespit etmektir.
</p>

<h2>📋 Gerçekleştirilen Kullanıcı Hikayeleri</h2>
<table>
<thead>
<tr>
<th>Kullanıcı Hikayesi</th>
<th>Açıklama</th>
</tr>
</thead>
<tbody>
<tr>
<td>US_101</td>
<td>Kullanıcı hesabı oluşturma</td>
</tr>
<tr>
<td>US_102</td>
<td>Giriş yaptıktan sonra kullanıcı adının doğrulanması</td>
</tr>
<tr>
<td>US_103</td>
<td>Kullanıcının hesabından çıkış yapması</td>
</tr>
<tr>
<td>US_104</td>
<td>Sisteme giriş yapma</td>
</tr>
<tr>
<td>US_105</td>
<td>Sipariş listesi kontrolü</td>
</tr>
<tr>
<td>US_106</td>
<td>Mesaj kutusu kontrolü</td>
</tr>
<tr>
<td>US_107</td>
<td>Kullanıcı hesabının silinmesi</td>
</tr>
</tbody>
</table>

<h2>✅ Uygulanan Test Senaryoları</h2>
<ul>
<li><strong>Pozitif Testler:</strong>
  <ul>
    <li>Başarılı hesap oluşturma</li>
    <li>Başarılı giriş yapma ve hesap doğrulama</li>
    <li>Başarılı çıkış yapma</li>
    <li>Boş sipariş listesi ve mesaj kutusu kontrolü</li>
    <li>Başarılı hesap silme</li>
  </ul>
</li>
<li><strong>Negatif Testler:</strong>
  <ul>
    <li>Eksik bilgiyle hesap oluşturma (hata kontrolü)</li>
    <li>Geçersiz e-posta veya şifre ile giriş denemesi</li>
    <li>Boş (null) bilgi ile giriş denemesi</li>
    <li>Yanlış şifre ile hesap silmeye çalışma</li>
  </ul>
</li>
</ul>

