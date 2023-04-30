@Login
Feature: Login
  As a user
  I want to login
  So that I can login my account

  @SuccessToLogin
  Scenario: Success To Login
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click button Masuk
    And I input "081806442929" on field Nomor HP atau No. kartu member
    And I input "12345678" on field Masukkan Password
#   sorry fake password because it's a real account
    And I click button Lanjut
    Then Success to login
    Then Open to beranda page

  @LoginWrongPassword
  Scenario: Login Wrong Password
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click button Masuk
    And I input "081806442929" on field Nomor HP atau No. kartu member
    And I input "87654321" on field Masukkan Password
    And I click button Lanjut
    Then Fail to login
    Then Error mesage Password Anda salah. Silahkan coba lagi

  @LoginDifferentAccountInOneDevice
  Scenario: Login Different Account In One Device
    Given Account created
    Given Application opened
    Given Account not logged in
    Given Device connected with account 081806442929
    When I click button Masuk
    And I input "081806442928" on field Nomor HP atau No. kartu member
    And I input "12345678" on field Masukkan Password
    And I click button Lanjut
    Then Fail to login
    Then Pop up error message Login Gagal, Maaf device ini sudah terhubung dengan Id:xxx, No:xxx, dan No Hp:0818xxxxx929. Mohon hubungi Sahabat Alfamart

  @LoginNomorHPdanPasswordEmpty
  Scenario: Login Nomor HP dan Password Empty
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click button Masuk
    And I click button Lanjut
    Then Fail to login
    Then Error message Nomor HP atau No. kartu Member tidak boleh kosong
    Then Error message Kolom ini diperlukan

  @LoginPasswordEmpty
  Scenario: Login Password Empty
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click button Masuk
    And I input "081806442929" on field Nomor HP atau No. kartu member
    And I click button Lanjut
    Then Fail to login
    Then Error message Kolom ini diperlukan

  @LoginPasswordIsLessThan8Character
  Scenario: Login Password Is Less Than 8 Character
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click button Masuk
    And I input "081806442929" on field Nomor HP atau No. kartu member
    And I input "1234567" on field Masukkan Password
    And I click button Lanjut
    Then Fail to login
    Then Error message Password minimum delapan karakter

  @LoginVisiblePassword
  Scenario: Login Visible Password
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click button Masuk
    And I input "081806442929" on field Nomor HP atau No. kartu member
    And I input "12345678" on field Masukkan Password
    And I click icon visible password
    And I click button Lanjut
    Then Success to login
    Then Open to beranda page