package com.example.simulationmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button welcome1;
    Button welcome2;
    Button despButton1;
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
        welcome2 = (Button) findViewById(R.id.welcomeMes2);
        despButton1 = (Button) findViewById(R.id.despButton);

        String welcomeTemp = "Welcome to Simulation Market! Here is where you get to experiment " +
                "increasing/decreasing price market and see how it will turn out " +
                "in the real world.\n Tap here to continue.";

        welcome1.setText(welcomeTemp);

    }


    public void onClick(View view) {

        String welcomeTemp2 = "To start, click on the button \"Increase\" or \"Decrease\". " +
                "Then click on the icon you wish to increase/decrease.";
        welcome1.setVisibility(View.GONE);

        welcome2.setText(welcomeTemp2);
        welcome2.setVisibility(View.VISIBLE);
        welcome2.setClickable(true);


        welcome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcome2.setVisibility(View.GONE);
                scene1();
            }
        });

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

                        String temp1 = "When GOLD increases, this is almost like an inflation situation. Besides OIL, everything reduces in value " +
                                       "and hence decreases market value.";
                        despButton1.setText(temp1);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

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

                        String temp2 = "When MONEY increases, everything else are more affordable." +
                                       "But houses continues to increase in value because of demands.";
                        despButton1.setText(temp2);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 20;

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 20; //can afford, lower price

                    }
                });

                house1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String temp2 = "When HOUSE increases, it means its on high demand. Economy is growing, hence money increases, and everything rises.." +
                                "But gold and oil drops due to affordability.";
                        despButton1.setText(temp2);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 10; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 50; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 20; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() -10; //can afford, lower price
                    }
                });

                rice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String temp4 = "When RICE increases, it means economy is decreasing, because even necessities are expensive. " +
                                "Money value decreases, gold value will rise.";
                        despButton1.setText(temp4);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

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

                        String temp5 = "When LUXURIES increases, it means economy is increasing, because luxuries are in demand " +
                                "(Consumer has extra cash to spend). " +
                                "Money value increases, gold value will decrease.";
                        despButton1.setText(temp5);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() - 10; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() + 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() + 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() + 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() - 10; //can afford, lower price
                    }
                });

                oil1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String temp6 = "When OIL increases, it means inflation is happening. " +
                                "Money value decreases, everything else drops. " + "But oil has a direct relationship with gold, " +
                                "so gold value rises.";
                        despButton1.setText(temp6);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

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

                        String temp7 = "When GOLD decreases, this is almost like an inverse " +
                                "inflation situation. Besides OIL, everything rise in value " +
                                "and hence increases market value.";
                        despButton1.setText(temp7);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

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

                        String temp8 = "When MONEY decreases, everything else are less affordable." +
                                "And houses continues to increase in value because of demands.";
                        despButton1.setText(temp8);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 20;

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() + 30; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 10; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 20; //can afford, lower price

                    }
                });

                house1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String temp9 = "When HOUSE increases, it means its on high demand. Economy is growing, hence money increases, and everything rises.." +
                                "But gold and oil drops due to affordability.";
                        despButton1.setText(temp9);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 10; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 50; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 20; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 10; //can afford, lower price
                    }
                });

                rice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String temp10 = "When RICE decreases, it means economy is increasing, because necessities are cheaper. " +
                                "Money value increases, gold value will drop.";
                        despButton1.setText(temp10);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });

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

                        String temp11 = "When LUXURIES decreases, it means economy is decreasing, because luxuries are less in demand " +
                                "(Consumer has less cash to spend). " +
                                "Money value decreases, gold value will increase.";
                        despButton1.setText(temp11);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });
                        goldBar1.requestLayout();
                        goldBar1.getLayoutParams().height = goldBar1.getHeight() + 10; //will increase no matter what

                        moneyBar1.requestLayout();;
                        moneyBar1.getLayoutParams().height = moneyBar1.getHeight() - 30; //inflation

                        houseBar1.requestLayout();;
                        houseBar1.getLayoutParams().height = houseBar1.getHeight() - 30;  //got potential to buy

                        riceBar1.getLayoutParams();
                        riceBar1.getLayoutParams().height = riceBar1.getHeight() - 10; //lower price to buy

                        lipstickBar1.getLayoutParams();
                        lipstickBar1.getLayoutParams().height = lipstickBar1.getHeight() - 30; //high price to buy

                        oilBar1.getLayoutParams();
                        oilBar1.getLayoutParams().height = oilBar1.getHeight() + 10; //can afford, lower price
                    }
                });

                oil1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String temp12 = "When OIL decreases, it means negative inflation is happening. " +
                                "Money value increases, everything else rises. " + "But oil has a direct relationship with gold, " +
                                "so gold value decreases.";
                        despButton1.setText(temp12);
                        despButton1.setVisibility(View.VISIBLE);
                        despButton1.setClickable(true);

                        despButton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                despButton1.setVisibility(View.GONE);

                            }
                        });
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