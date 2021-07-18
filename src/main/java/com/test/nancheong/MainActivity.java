package com.test.nancheong;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.test.nancheong.databinding.ActivityMainBinding;
import com.test.nancheong.ui.SelfTest.SelfTestMainFragment;
import com.test.nancheong.ui.baby_tab.Baby_tabFragment;
import com.test.nancheong.ui.calendar.CalendarFragment;
import com.test.nancheong.ui.consultBoard.ConsultBoardFragment;
import com.test.nancheong.ui.dictionary.DictionaryFragment;
import com.test.nancheong.ui.home.HomeFragment;
import com.test.nancheong.ui.hospital.HospitalFragment;
import com.test.nancheong.ui.login.LoginFragment;

public class MainActivity extends AppCompatActivity {

    HomeFragment homeFragment;
    DictionaryFragment dictionaryFragment;
    CalendarFragment calendarFragment;
    HospitalFragment hospitalFragment;
    Baby_tabFragment baby_tabFragment;
    SelfTestMainFragment selfTestMainFragment;
    ConsultBoardFragment consultBoardFragment;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginFragment loginFragment =(LoginFragment)getSupportFragmentManager().findFragmentById(R.id.login);
    }
    public void onFragmentChange(int index){
     switch (index){
         case 0:getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit(); break;
         case 1:getSupportFragmentManager().beginTransaction().replace(R.id.container, selfTestMainFragment).commit(); break;
         case 2:getSupportFragmentManager().beginTransaction().replace(R.id.container, baby_tabFragment).commit(); break;
         case 3:getSupportFragmentManager().beginTransaction().replace(R.id.container, calendarFragment).commit(); break;
         case 4:getSupportFragmentManager().beginTransaction().replace(R.id.container, dictionaryFragment).commit(); break;
         case 5:getSupportFragmentManager().beginTransaction().replace(R.id.container, consultBoardFragment).commit(); break;
         case 6:getSupportFragmentManager().beginTransaction().replace(R.id.container, hospitalFragment).commit(); break;

     }

    }


}

