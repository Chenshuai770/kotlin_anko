package cs.com.kotlin_anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.button
import org.jetbrains.anko.editText
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.verticalLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       //MainActivityUI().setContentView(this)

        verticalLayout {
            val name = editText()
            button("Say heelo") {
                onClick {
                    toast("Hello,${name.text}")
                }
            }
        }

    }


}




