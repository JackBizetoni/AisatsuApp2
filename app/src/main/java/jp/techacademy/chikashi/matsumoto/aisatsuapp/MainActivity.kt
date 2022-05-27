package jp.techacademy.chikashi.matsumoto.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/*
* あいさつアプリ
* */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button1.setOnClickListener(this)
//        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
//        button4.setOnClickListener(this)
    }

    //    押下すると時刻を入力するダイアログを表示する。
    override fun onClick(v: View) {
        when (v.id) {
//            R.id.button1 -> textView.text = editText.text.toString()
//            R.id.button2 -> showAlertDialog()
            R.id.button3 -> showTimePickerDialog()
//            R.id.button4 -> showDatePickerDialog()
        }
    }

    //    設定した時刻によりあいさつを表示する。
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            { view, hour, minute ->
                if (hour >= 2 && hour < 10) {
                    textView.text = "おはよう"
                } else if (hour >= 10 && hour < 18) {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            },
//            時刻の初期設定は0:00とする。
            0, 0, true
        )
        timePickerDialog.show()
    }


    /* private fun showAlertDialog() {
         // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
         val alertDialogBuilder = AlertDialog.Builder(this)
         alertDialogBuilder.setTitle("タイトル")
         alertDialogBuilder.setMessage("メッセージ")

         // 肯定ボタンに表示される文字列、押したときのリスナーを設定する
         alertDialogBuilder.setPositiveButton("肯定") { dialog, which ->
             Log.d("UI_PARTS", "肯定ボタン")
         }

         // 中立ボタンに表示される文字列、押したときのリスナーを設定する
         alertDialogBuilder.setNeutralButton("中立") { _, _ ->
             Log.d("UI_PARTS", "中立ボタン")
         }

         // 否定ボタンに表示される文字列、押したときのリスナーを設定する
         alertDialogBuilder.setNegativeButton("否定") { _, _ ->
             Log.d("UI_PARTS", "否定ボタン")
         }

         // AlertDialogを作成して表示する
         val alertDialog = alertDialogBuilder.create()
         alertDialog.show()
     }
 */

/* private fun showDatePickerDialog() {
     val datePickerDialog = DatePickerDialog(
             this,
             DatePickerDialog.OnDateSetListener() { view, year, month, dayOfMonth ->
                 Log.d("UI_PARTS", "$year/${month + 1}/$dayOfMonth")
             },
             2018,
             4,
             1)
     datePickerDialog.show()
 }*/
}