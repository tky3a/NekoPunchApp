package com.example.nekopunchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // 画面タッチ
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        // view取得
        var iv :ImageView = findViewById(R.id.iv)

        // 条件分岐　押した時動か機したとき話した時
        // ? null許容 !!はnullを許容しない
        when(event?.action) {
            // 処理
            // 画面をタップしたときMotionEvent.ACTION_DOWN
            // iv.setImageResource(R.drawable.cat02)  この部分は、ivに現在は初期値の画像がはいっていて、iv.setImageResource(R.drawable.cat02)で画像を切り替えている
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.cat02) // タップ
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.cat03) // タップしたまま動かす
            MotionEvent.ACTION_UP -> iv.setImageResource(R.drawable.cat01) // 話した時
        }

        return super.onTouchEvent(event)
    }
}