package com.sandeep.qrlib

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sandeep.qr.my_qr.MyQrFragment
import com.sandeep.qr.scanner.ScannerFragment

class QrPageAdater(fm: FragmentManager, var listener:ScannerFragment.OnScannerListener, var code:String): FragmentPagerAdapter(fm) {
    /**
     * Return the Fragment associated with a specified position.
     */
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> ScannerFragment.instance(listener)
            else -> MyQrFragment.instance(code)
        }
    }

    /**
     * Return the number of views available.
     */
    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Scan"
            else -> "My QR"
        }
    }

}