package com.sandeep.qrlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sandeep.qr.scanner.ScannerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp_qr.adapter = QrPageAdater(supportFragmentManager, object : ScannerFragment.OnScannerListener {
            override fun onResult(result: com.google.zxing.Result) {
                Toast.makeText(this@MainActivity, result.text, Toast.LENGTH_SHORT).show()
                  }

            override fun onClose() {
                finish()
            }


        }, "Testing")
        tab_qr.setupWithViewPager(vp_qr,true)
    }
}
