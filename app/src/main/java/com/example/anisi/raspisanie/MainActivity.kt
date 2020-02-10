package com.example.anisi.raspisanie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dd=0
        button1.setOnClickListener {
            chisl_rasp_1.text = ""
            znam_rasp_1.text = ""
            chisl_rasp_2.text = ""
            znam_rasp_2.text = ""
            chisl_rasp_3.text = ""
            znam_rasp_3.text = ""
            chisl_rasp_4.text = ""
            znam_rasp_4.text = ""
            dd=1
            supportActionBar!!.setTitle("Понедельник")
        }
        button2.setOnClickListener {
            chisl_rasp_1.text = ""
            znam_rasp_1.text = ""
            chisl_rasp_2.text = ""
            znam_rasp_2.text = ""
            chisl_rasp_3.text = ""
            znam_rasp_3.text = ""
            chisl_rasp_4.text = ""
            znam_rasp_4.text = ""
            dd=2
            supportActionBar!!.setTitle("Вторник")
        }
        button3.setOnClickListener {
            chisl_rasp_1.text = ""
            znam_rasp_1.text = ""
            chisl_rasp_2.text = "311 р., Обробка інформації в цифр. СЗ"
            znam_rasp_2.text = "427 г., Психологія і педагогіка в. ш."
            chisl_rasp_3.text = "512 р., Обробка інформації в цифр. СЗ"
            znam_rasp_3.text = "311 р., Інформ.-комунікаційні технології"
            chisl_rasp_4.text = "314 р., Інформ.-комунікаційні технології"
            znam_rasp_4.text = "314 р., Інформ.-комунікаційні технології"
            dd=3
            supportActionBar!!.setTitle("Среда")
        }
        button4.setOnClickListener {
            chisl_rasp_1.text = ""
            znam_rasp_1.text = ""
            chisl_rasp_2.text = "314 р., Обробка інформації в цифр. СЗ"
            znam_rasp_2.text = "314 р., Обробка інформації в цифр. СЗ"
            chisl_rasp_3.text = "311 р., Глобальна інформац. інфрастр."
            znam_rasp_3.text = "311 р., Обробка інформації в цифр. СЗ"
            chisl_rasp_4.text = "312 р., Глобальна інформац. інфрастр."
            znam_rasp_4.text = "312 р., Глобальна інформац. інфрастр."
            dd=4
            supportActionBar!!.setTitle("Четверг")
        }
        button5.setOnClickListener {
            chisl_rasp_1.text = ""
            znam_rasp_1.text = "312 р., Компл. МЗІ та ІВ в телекомунікації"
            chisl_rasp_2.text = "512 р., Компл. МЗІ та ІВ в телекомунікації"
            znam_rasp_2.text = "102 р., Психологія і педагогіка в. ш."
            chisl_rasp_3.text = "317 р., Управл. та якість послуг інформ. мереж зв."
            znam_rasp_3.text = "317 р., Управл. та якість послуг інформ. мереж зв."
            chisl_rasp_4.text = "311 р., Управл. та якість послуг інформ. мереж зв."
            znam_rasp_4.text = ""
            dd=5
            supportActionBar!!.setTitle("Пятница")
        }
        var per=0
        chisl_znam.setOnClickListener {
            if (per == 0){
                per=1
                chisl_rasp_1.setVisibility(View.GONE);
                znam_rasp_1.setVisibility(View.VISIBLE);
                chisl_rasp_2.setVisibility(View.GONE);
                znam_rasp_2.setVisibility(View.VISIBLE);
                chisl_rasp_3.setVisibility(View.GONE);
                znam_rasp_3.setVisibility(View.VISIBLE);
                chisl_rasp_4.setVisibility(View.GONE);
                znam_rasp_4.setVisibility(View.VISIBLE);
                current_state.text="Выбран: Знаменатель"
            }
            else{
                per=0
                chisl_rasp_1.setVisibility(View.VISIBLE);
                znam_rasp_1.setVisibility(View.GONE);
                chisl_rasp_2.setVisibility(View.VISIBLE);
                znam_rasp_2.setVisibility(View.GONE);
                chisl_rasp_3.setVisibility(View.VISIBLE);
                znam_rasp_3.setVisibility(View.GONE);
                chisl_rasp_4.setVisibility(View.VISIBLE);
                znam_rasp_4.setVisibility(View.GONE);
                current_state.text="Выбран: Числитель"
            }
        }
        chisl_rasp_1.setOnClickListener {
            when (dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
            }
        }
        znam_rasp_1.setOnClickListener {
            when (dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
            }
        }
        chisl_rasp_2.setOnClickListener {
            when (dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "проф., Лукін В. В., доц., Єремеєв О. І.", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "ст.викл., Науменко В. В., ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
            }
        }
        znam_rasp_2.setOnClickListener {
            when(dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "ас., Півень М А", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "проф., Лукін В. В., доц., Єремеєв О. І.", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "ас., Півень М А", Toast.LENGTH_SHORT).show()}
            }
        }
        chisl_rasp_3.setOnClickListener {
            when (dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "проф., Лукін В. В., доц., Єремеєв О. І.", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "доц., Васильєва І. К.", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "ст.викл., Абрамова В. В.", Toast.LENGTH_SHORT).show()}
            }
        }
        znam_rasp_3.setOnClickListener {
            when(dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "ас., Рубель А С., проф., Лукін В. В.", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "ст.викл., Абрамова В. В.", Toast.LENGTH_SHORT).show()}
            }
        }
        chisl_rasp_4.setOnClickListener {
            when (dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "ст.викл., Науменко В. В., ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "доц., Васильєва І. К.", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
            }
        }
        znam_rasp_4.setOnClickListener {
            when(dd){
                1->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                2->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
                3->{Toast.makeText(this, "ст.викл., Науменко В. В., ас., Кожемякіна Н. В.", Toast.LENGTH_SHORT).show()}
                4->{Toast.makeText(this, "доц., Васильєва І. К.", Toast.LENGTH_SHORT).show()}
                5->{Toast.makeText(this, "", Toast.LENGTH_SHORT).show()}
            }
        }
    }
}
