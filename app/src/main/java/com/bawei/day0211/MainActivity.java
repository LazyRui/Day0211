package com.bawei.day0211;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bawei.day0211.view.OrderByStatusFragment;

import java.util.ArrayList;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.vp)
    ViewPager vp;

    @BindView(R.id.rb_home)
    RadioButton rbHome;
    @BindView(R.id.rb_pay)
    RadioButton rbPay;
    @BindView(R.id.rb_evaluation)
    RadioButton rbEvaluation;
    @BindView(R.id.rb_ping)
    RadioButton rbPing;
    @BindView(R.id.rb_over)
    RadioButton rbOver;

    private final int STATUS_0 = 0;
    private final int STATUS_1 = 1;
    private final int STATUS_2 = 2;
    private final int STATUS_3 = 3;
    private final int STATUS_9 = 9;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        ButterKnife.bind(this);

        list = new ArrayList<>();

        OrderByStatusFragment instance0 = OrderByStatusFragment.getInstance(STATUS_0);
        OrderByStatusFragment instance1 = OrderByStatusFragment.getInstance(STATUS_1);
        OrderByStatusFragment instance2 = OrderByStatusFragment.getInstance(STATUS_2);
        OrderByStatusFragment instance3 = OrderByStatusFragment.getInstance(STATUS_3);
        OrderByStatusFragment instance9 = OrderByStatusFragment.getInstance(STATUS_9);


        list.add(instance0);
        list.add(instance1);
        list.add(instance2);
        list.add(instance3);
        list.add(instance9);


        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_home:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.rb_pay:
                        vp.setCurrentItem(1);
                        break;
                    case R.id.rb_evaluation:
                        vp.setCurrentItem(2);
                        break;
                    case R.id.rb_ping:
                        vp.setCurrentItem(3);
                        break;
                    case R.id.rb_over:
                        vp.setCurrentItem(4);
                        break;
                }
            }
        });



        vp.setOffscreenPageLimit(list.size());


    }


}
