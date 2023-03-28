package com.example.shared_preference;

import  android.content.Context;
import  android.content.SharedPreferences;
import  android.preference.PreferenceManager;
public class Preferences {
    //** pendklarasian key data berupa string untuk sebagia wadah penyimpanan data .
     //* jadi setiap data mempunyai key yang berbeda satu lain */

    static  final  String KEY_USER_TERGISTER = "user", KEY_PASS_TERGISTER ="pass";
    static  final  String KEY_USERNAME_SEDANG_LOGIN = "username_logged_IN";
    static  final  String KEY_STATUS_SEDANG_OGIN ="Status_logged_in";

    //** pendeklarasian Shared preference yang berdasarkan parameter context */
     private  static  SharedPreferences getSharedPreferences(Context context){
         return PreferenceManager.getDefaultSharedPreferences(context);
     }

     //**deklarasi edit preference dan mengubah data yang
    // di miliki key isi KEY_USER dengan parameter username
    public  static  void  setRegisteredUser(Context context, String username){
         SharedPreferences.Editor editor = getSharedPreferences(context).edit();
         editor.putString(KEY_USER_TERGISTER, username);
         editor.apply();
    }
    //** mengembalikan nilai dari KEY_USER_TERGISTERED berupa string
    public static  String getRegisteredUser(Context context){
         return  getRegisteredUser(context).getString(KEY_USER_TERGISTER);
    }

}
