package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    HashMap<String,Integer> mp=new HashMap<String, Integer>();
    String arr[] = new String[20];
    String dp[]=new String[100000];
    Random r = new Random();
    int pre,ans,globalans,globalcounter;
    int target;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17,bl1,bl2,bl3;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bl1=(Button)findViewById(R.id.bl1);
        bl2=(Button)findViewById(R.id.bl2);
        bl3=(Button)findViewById(R.id.bl3);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b1 = (Button) findViewById(R.id.b1);
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        arr[3] = "4";
        arr[4] = "5";
        arr[5] = "6";
        arr[6] = "7";
        arr[7] = "8";
        arr[8] = "9";
        arr[9] = "10";
        arr[10] = "11";
        arr[11] = "12";
        arr[12] = "13";
        arr[13] = "14";
        arr[14] = "15";
        arr[15] = "16";
        arr[19] = " ";
        arr[16]="17";
        arr[17]="18";
        arr[18]="19";
        target = -1;
        pre = 19;
        String init="12345678910111213141516 ";
        mp.put(init,0);
        ini();
        int loop = Math.abs(r.nextInt(500)) + 500;
        int i;
        for (i = 0; i < loop; i++) {
            int index = get();
            String prestr,currstr;
            prestr=getstr();
            swap(index);
            currstr=getstr();
            if(isfound(currstr)){

            }
            else{
                int ans1=mp.get(prestr);
                ans1++;
                mp.put(currstr,ans1);
            }

        }

        String globalstr=getstr();
        globalans=mp.get(globalstr);
        globalcounter=1000+globalans;
        show();
        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ini();
                int loop = Math.abs(r.nextInt(10)) + 10;
                int i;
                for (i = 0; i < loop; i++) {
                    int index = get();
                    String prestr,currstr;
                    prestr=getstr();
                    swap(index);
                    currstr=getstr();
                    if(isfound(currstr)){

                    }
                    else{
                        int ans1=mp.get(prestr);
                        ans1++;
                        mp.put(currstr,ans1);
                    }
                }

                String globalstr=getstr();
                globalans=mp.get(globalstr);
                globalcounter=globalans+1000;
                show();
            }
        });
        bl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ini();
                int loop = Math.abs(r.nextInt(100)) + 100;
                int i;
                for (i = 0; i < loop; i++) {
                    int index = get();
                    String prestr,currstr;
                    prestr=getstr();
                    swap(index);
                    currstr=getstr();
                    if(isfound(currstr)){

                    }
                    else{
                        int ans1=mp.get(prestr);
                        ans1++;
                        mp.put(currstr,ans1);
                    }
                }

                String globalstr=getstr();
                globalans=mp.get(globalstr);
                globalcounter=globalans+1000;
                show();
            }
        });
        bl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ini();
                int loop = Math.abs(r.nextInt(500)) + 500;
                int i;
                for (i = 0; i < loop; i++) {
                    int index = get();
                    String prestr,currstr;
                    prestr=getstr();
                    swap(index);
                    currstr=getstr();
                    if(isfound(currstr)){

                    }
                    else{
                        int ans1=mp.get(prestr);
                        ans1++;
                        mp.put(currstr,ans1);
                    }
                }
                String globalstr1=getstr();
                globalans=mp.get(globalstr1);
                globalcounter=globalans+1000;
                show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //target=Integer.parseInt(String.valueOf(b1.getText()));
                target=0;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //target=Integer.parseInt(String.valueOf(b2.getText()));
                target=1;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b3.getText()));
                target=2;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //target=Integer.parseInt(String.valueOf(b4.getText()));
                target=3;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b5.getText()));
                target=4;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b6.getText()));
                target=5;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b7.getText()));
                target=6;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b17.getText()));
                target=19;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b8.getText()));
                target=7;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b9.getText()));
                target=8;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b10.getText()));
                target=9;
                int ind=get();
                swap(ind);
                show();
                if(equal()) {
                    tv1.setText("Great you won!!");
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b11.getText()));
                target=10;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b12.getText()));
                target=11;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  target=Integer.parseInt(String.valueOf(b13.getText()));
                target=12;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // target=Integer.parseInt(String.valueOf(b14.getText()));
                target=13;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //target=Integer.parseInt(String.valueOf(b15.getText()));
                target=14;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                    tv1.setText("Great you won!!");
                }

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                target=15;
                int ind=get();
                swap(ind);
                show();
                if(equal()){
                   tv1.setText("Great you won!!");
                }

            }
        });


    }
    boolean isfound(String str1){
        return mp.containsKey(str1);
    }

    String getstr(){
        String temp="";
        int i;
        for(i=0;i<16;i++)
        {
            temp=temp+arr[i];
        }
        temp=temp+arr[19];
        return temp;
    }
    void ini(){

        int i;
        tv1.setText("WELCOME!!");
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        arr[3] = "4";
        arr[4] = "5";
        arr[5] = "6";
        arr[6] = "7";
        arr[7] = "8";
        arr[8] = "9";
        arr[9] = "10";
        arr[10] = "11";
        arr[11] = "12";
        arr[12] = "13";
        arr[13] = "14";
        arr[14] = "15";
        arr[15] = "16";
        arr[19] = " ";
        arr[16]="17";
        arr[17]="18";
        arr[18]="19";
        target = -1;
        pre = 19;
    }
    boolean equal(){

        if(arr[0]=="1" && arr[1]=="2" && arr[2]=="3" && arr[3]=="4"  && arr[4]=="5" && arr[5]=="6" && arr[6]=="7" && arr[7]=="8" && arr[8]=="9" && arr[9]=="10" && arr[10]=="11" && arr[11]=="12" && arr[12]=="13" && arr[13]=="14" && arr[14]=="15" && arr[15]=="16"){
            return true;
        }
        else {
            return false;
        }
    }
    void show(){
        tv2.setText("Score :: "+Integer.toString(globalcounter));
        b1.setText(arr[0]);
        b2.setText(arr[1]);
        b3.setText(arr[2]);
        b4.setText(arr[3]);
        b5.setText(arr[4]);
        b6.setText(arr[5]);
        b7.setText(arr[6]);
        b8.setText(arr[7]);
        b9.setText(arr[8]);
        b10.setText(arr[9]);
        b11.setText(arr[10]);
        b12.setText(arr[11]);
        b13.setText(arr[12]);
        b14.setText(arr[13]);
        b15.setText(arr[14]);
        b16.setText(arr[15]);
        b17.setText(arr[19]);
    }

    int get() {
        int i;
        for (i = 0; i < 20; i++)
            if (arr[i].equals(" "))
                return i;
        return -1;
    }

    void swap(int index) {
        if (target == -1) {
            if (index == 0) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (pre == 1) {
                    String str = arr[index];
                    arr[index] = arr[4];
                    arr[4] = str;
                } if(pre==4) {
                    String str = arr[index];
                    arr[index] = arr[1];
                    arr[1] = str;

                }
                pre = index;

            }
            if (index == 1) {
                int[] temp = new int[3];
                temp[0] = 0;
                temp[1] = 2;
                temp[2] = 5;
                if (pre == 0) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 2) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 5) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 2) {
                int[] temp = new int[3];
                temp[0] = 1;
                temp[1] = 6;
                temp[2] = 3;
                if (pre == 1) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 6) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 3) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 3) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (pre == 2) {
                    String str = arr[index];
                    arr[index] = arr[7];
                    arr[7] = str;
                } if(pre==7) {
                    String str = arr[index];
                    arr[index] = arr[2];
                    arr[2] = str;

                }
                pre = index;

            }
            if (index == 12) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (pre == 8) {
                    String str = arr[index];
                    arr[index] = arr[13];
                    arr[13] = str;
                } if(pre==13) {
                    String str = arr[index];
                    arr[index] = arr[8];
                    arr[8] = str;

                }
                pre = index;

            }
            if(index==19){
                String str = arr[index];
                arr[index] = arr[15];
                arr[15] = str;
                pre=19;
            }
            if (index == 4) {
                int[] temp = new int[3];
                temp[0] = 0;
                temp[1] = 5;
                temp[2] = 8;
                if (pre == 0) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 5) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 8) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 8) {
                int[] temp = new int[3];
                temp[0] = 4;
                temp[1] = 9;
                temp[2] = 12;
                if (pre == 4) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 9) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 12) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 13) {
                int[] temp = new int[3];
                temp[0] = 12;
                temp[1] = 9;
                temp[2] = 14;
                if (pre == 12) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 9) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 14) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 14) {
                int[] temp = new int[3];
                temp[0] = 13;
                temp[1] = 10;
                temp[2] = 15;
                if (pre == 13) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 10) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 15) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 15) {
                int[] temp = new int[3];
                temp[0] = 19;
                temp[1] = 14;
                temp[2] = 11;
                if (pre == 19) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 14) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 11) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 11) {
                int[] temp = new int[3];
                temp[0] = 7;
                temp[1] = 10;
                temp[2] = 15;
                if (pre == 7) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 10) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 15) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 7) {
                int[] temp = new int[3];
                temp[0] = 6;
                temp[1] = 11;
                temp[2] = 3;
                if (pre == 11) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 6) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 3) {
                    int t = Math.abs(r.nextInt(3));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(3));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 5) {
                int[] temp = new int[4];
                temp[0] = 1;
                temp[1] = 6;
                temp[2] = 9;
                temp[3]=4;
                if (pre == 1) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 6) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 9) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 4) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 6) {
                int[] temp = new int[4];
                temp[0] = 2;
                temp[1] = 7;
                temp[2] = 5;
                temp[3]=10;
                if (pre == 2) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 7) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 5) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 10) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 9) {
                int[] temp = new int[4];
                temp[0] = 5;
                temp[1] = 8;
                temp[2] = 10;
                temp[3]=13;
                if (pre == 13) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 5) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 8) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 10) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }
            if (index == 10) {
                int[] temp = new int[4];
                temp[0] = 11;
                temp[1] = 6;
                temp[2] = 9;
                temp[3]=14;
                if (pre == 11) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 6) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 9) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                if (pre == 14) {
                    int t = Math.abs(r.nextInt(4));
                    while (temp[t] == pre)
                        t = Math.abs(r.nextInt(4));
                    String str = arr[index];
                    arr[index] = arr[temp[t]];
                    arr[temp[t]] = str;
                }
                pre = index;
            }




        }
        else {
            if (index == 0) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 1 || target == 4) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 1) {
                int[] temp = new int[3];
                temp[0] = 0;
                temp[1] = 2;
                temp[2]=5;
                if (target == 2 || target == 0 ||target==5) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 2) {
                int[] temp = new int[3];
                temp[0] = 1;
                temp[1] = 3;
                temp[2]=6;
                if (target == 1 || target == 3 || target==6) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 3) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 2 || target == 7) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 4) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 0 || target == 8 || target==5) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 5) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 1 || target == 4 || target==9 || target==6) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 6) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 2 || target == 10 || target==5 || target==7) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 7) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 3 || target == 11 || target==6) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 8) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 12 || target == 4 || target==9) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 9) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target ==8 || target == 5 || target==10 || target==13) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 10) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 9 || target == 11 || target==6 || target==14)  {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 11) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 10 || target == 7 || target==15) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 12) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 13 || target == 8 ) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 13) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 12 || target == 14 || target==9) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 14) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 13 || target == 15 || target==10) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 15) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 14 || target == 11 || target==19) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
            if (index == 19) {
                int[] temp = new int[2];
                temp[0] = 1;
                temp[1] = 4;
                if (target == 15) {
                    String str = arr[index];
                    arr[index] = arr[target];
                    arr[target] = str;
                    globalcounter--;
                }

            }
        }
    }
}
