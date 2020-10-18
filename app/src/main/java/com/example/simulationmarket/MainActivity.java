package com.example.simulationmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button welcome1;
    Button increase;
    Button decrease;
    ImageView money1;
    ImageView house1;
    ImageView gold1;
    ImageView rice1;
    ImageView lipstick1;
    ImageView oil1;
    TextView moneyBar1;
    TextView houseBar1;
    TextView goldBar1;
    TextView riceBar1;
    TextView lipstickBar1;
    TextView oilBar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome1 = (Button) findViewById(R.id.welcomeMes);

        String welcomeTemp = "Welcome to Simulation Market! Here is where you get to experiment " +
                "increasing/decreasing price market and see how it will turn out " +
                "in the real world.\n Tap here to continue.";

        welcome1.setText(welcomeTemp);

    }


    public void onClick(View view) {
        welcome1.setVisibility(View.GONE);

        scene1();
    }

    public void scene1() {
        money1 = (ImageView) findViewById(R.id.money01);
        money1.setVisibility(View.VISIBLE);
        money1.setClickable(true);

        house1 = (ImageView) findViewById(R.id.house01);
        house1.setVisibility(View.VISIBLE);
        house1.setClickable(true);

        gold1 = (ImageView) findViewById(R.id.gold01);
        gold1.setVisibility(View.VISIBLE);
        gold1.setClickable(true);

        rice1 = (ImageView) findViewById(R.id.rice01);
        rice1.setVisibility(View.VISIBLE);
        rice1.setClickable(true);

        lipstick1 = (ImageView) findViewById(R.id.lipstick01);
        lipstick1.setVisibility(View.VISIBLE);
        lipstick1.setClickable(true);

        oil1 = (ImageView) findViewById(R.id.oil01);
        oil1.setVisibility(View.VISIBLE);
        oil1.setClickable(true);

        houseBar1 = (TextView) findViewById(R.id.houseBar);
        riceBar1 = (TextView) findViewById(R.id.riceBar);
        goldBar1 = (TextView) findViewById(R.id.goldBar);
        moneyBar1 = (TextView) findViewById(R.id.moneyBar);
        lipstickBar1 = (TextView) findViewById(R.id.lipstickBar);
        oilBar1 = (TextView) findViewById(R.id.oilBar);

        increase = (Button) findViewById(R.id.increasePrice);
        decrease = (Button) findViewById(R.id.decreasePrice);


        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                gold1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 30;

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //inflation

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 30; //high price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 30; //cannot afford, higher price

                    }
                });

                money1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 30;

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 30; //can afford, lower price

                    }
                });

                house1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 30; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 30; //can afford, lower price
                    }
                });

                rice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 40; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 50; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 40;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 40; //can afford, lower price
                    }

                });

                lipstick1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 40; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 10; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 40; //can afford, lower price
                    }
                });

                oil1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 30; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 50;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 30; //can afford, lower price
                    }

                });

            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gold1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 30;

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //inflation

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 30; //high price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 30; //cannot afford, higher price

                    }
                });

                money1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 30;

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 30; //can afford, lower price

                    }
                });

                house1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 30; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 30; //can afford, lower price
                    }
                });

                rice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 40; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 50; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 40;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 40; //can afford, lower price
                    }

                });

                lipstick1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 40; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 10; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 40; //can afford, lower price
                    }
                });

                oil1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 30; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 50;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 30; //can afford, lower price
                    }

                });
            }
        });


    }


}