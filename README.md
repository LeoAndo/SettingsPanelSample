# Settings Panels

## Feature

Android 9までは、Wi-Fi設定など、プリインストールされてる設定アプリを起動する手間があったが、
Android 10からアプリ上で設定パネルを開き、一部の機能の設定が可能になった。
[link1](https://developer.android.com/about/versions/10/highlights#settings_panels)
[link2](https://developer.android.com/about/versions/10/features#settings-panels)
[link3](https://developer.android.com/reference/android/provider/Settings.Panel)

Android 10から、[WifiManager#setWifiEnabled](https://developer.android.com/reference/android/net/wifi/WifiManager#setWifiEnabled(boolean)) による
Wi-FI設定が禁止されたのでその代替処理として、設定パネルを使います。
[link4](https://developer.android.com/about/versions/10/privacy/changes#enable-disable-wifi)

# capture For Pixcel 5 (OS: 11)
<img src="screenshot/capture.gif" width=320 />
