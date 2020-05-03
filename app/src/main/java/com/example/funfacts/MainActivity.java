package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.factTextView);
        button = findViewById(R.id.showFactButton);
        linearLayout = findViewById(R.id.linerLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        " আইসক্রিম সর্বপ্রথম\n" +
                                "চীনে তৈরী হয়েছিল, তাও\n" +
                                "খ্রীস্টের জন্মের ২০০০ বছর আগে",
                        "ইংরেজি বর্ণমালায় সর্বাধিক\n" +
                                "ব্যাবহার করা বর্ণ হলো \"E\"\n" +
                                "এবং সবচেয়ে কম ব্যাবহার করা বর্ণ\n" +
                                "হলো \"Q\"",
                        "একজন মানুষ কোনো খাবার\n" +
                                "না খেয়ে বাঁচতে পারে এক মাস,\n" +
                                "কিন্তু পানি পান না করলে এক\n" +
                                "সপ্তাহের\n" +
                                "বেশি বাঁচতে পারে না!!",
                        "গোল্ড ফিস ৩ সেকেন্ডের\n" +
                                "জন্যে তার\n" +
                                "স্মৃতিশক্তি ধরে রাখতে পারে",
                        "পিঁপড়েরা তাদের দেহের\n" +
                                "ওজনের দশগুণ বেশি ওজন বহন\n" +
                                "করতে পারে",
                        "পৃথিবীর প্রথম নভোচারী কিন্তু\n" +
                                "মানুষ নয়, একটি কুকুর",
                        "পৃথিবীর মোট জীবিত প্রানির\n" +
                                "৮৫ ভাগই পানিতে বাস\n" +
                                "করে (সমুদ্রে)!!",
                        "প্রতিদিন মানুষ ৩.২৫ পাউন্ড খাদ্য\n" +
                                "গ্রহন করে!!",
                        "মেয়েদের হার্ট(Heart) ছেলেদের\n" +
                                "হার্টের চেয়ে দ্রুত স্পন্দিত হয়",
                        "সিংহের গর্জন ৫ মাইল দূর থেকেও\n" +
                                "দিব্যি শোনা যায়",
                        "কেউ যখন ঘুম এর মধ্যে নাক\n" +
                                "ডাকে এর অর্থ হচ্ছে সে স্বপ্ন\n" +
                                "দেখছে না!!",
                        "হাসার জন্য ব্রেন এর\n" +
                                "পাঁচটি অংশের কার্যক্রম এর\n" +
                                "প্রয়োজন হয়!! তাই হাসাটা এত সহজ\n" +
                                "নয়!!",
                        "এক কাপ কফিতে ১০০ এরও\n" +
                                "বেশি রাসায়নিক পদার্থ আছে।",
                        "আপেল খেতে যতই স্বাদ লাগুক,\n" +
                                "জেনে নিন, আপেলের ৮৪ ভাগই\n" +
                                "পানি",
                        "প্রজাপতির চোখের\n" +
                                "সংখ্যা ১২০০টি",
                        "হাড়ের মধ্যে ৭৫% জল",
                        "সুইজারল্যান্ডে শব্দ করে গাড়ির\n" +
                                "দরজা আটকানো বেআইনি!!",
                        "শুধু মানুষ নয়,\n" +
                                "আয়না দেখে নিজেদের\n" +
                                "চিনতে পারে আরো দুটো প্রানি,\n" +
                                "শিম্পাঞ্জি এবং ডলফিন!!",
                        "রঙ্গিন টেলিভিশন আবিস্কারের\n" +
                                "পর থেকে মানুষের সাদাকাল স্বপ্ন\n" +
                                "দেখার হার কমে গেছে!!",
                        "যুক্তরাষ্টের ৭০ শতাংশ নাগরিক\n" +
                                "চাঁদে অবতরণের ঘটনাটি বিশ্বাস\n" +
                                "করে না!!",
                        "মানুষের ডি.এন.এ.(DNA)এর মোট\n" +
                                "দৈর্ঘ্য পৃথিবী থেকে সূর্যে ৭০বার\n" +
                                "যাতায়াতের সমান।"};
                String[] colors = {
                        "#39add1", // light blue
                        "#3079ab", // dark blue
                        "#c25975", // mauve
                        "#e15258", // red
                        "#f9845b", // orange
                        "#838cc7", // lavender
                        "#7d669e", // purple
                        "#53bbb4", // aqua
                        "#51b46d", // green
                        "#e0ab18", // mustard
                        "#637a91", // dark gray
                        "#f092b0", // pink
                        "#b7c0c7"  // light gray
                };

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);

                String fact = facts[randomNumber];
                textView.setText(fact);

                int randomColor = randomGenerator.nextInt(colors.length);
                int color = Color.parseColor(colors[randomColor]);
                linearLayout.setBackgroundColor(color);
                button.setTextColor(color);
            }
        };
        button.setOnClickListener(listener);

    }
}
