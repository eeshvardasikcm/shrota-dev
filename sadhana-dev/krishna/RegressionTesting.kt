package com.eeshvardasikcm.krishna

import android.os.Parcel
import android.os.Parcelable
import com.eeshvardasikcm.graha.Efficiency

/**
 * `RegressionTesting` uses the `googletest` package in `cpplib`
 */
internal class RegressionTesting() : Dharma(), Parcelable {
    private val positioningCpplibIntoShrotaApp =
        "cpplib needs to make an AAR file. Shrota app needs to use the aar file. Shrota app needs to use the RegressionTesting in the krishna app to analyze the results created by cpplib and the googletest implementation within cpplib."

    constructor(parcel: Parcel) : this() {
        this.mostBelovedResult =
            "Test units are tested over a span of time. Failures and Successes are tracked. Historical test results influence new tests and help developers to manage issues and fix failed tests quickly."
        this.motMischievousResult =
            "Test units are not tested over a span of time. Failures and successes are not tracked. There is no historical test results. Developers are doing one by one manual tests. Units tests may be written poorly and finding the root cause of issues may be difficult."
    }

    /**
     *
     */
    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    /**
     * Parcelable override
     */
    override fun describeContents(): Int = 0

    /**
     * Parcelable override
     */
    companion object CREATOR : Parcelable.Creator<RegressionTesting> {
        /**
         * Parcelable override
         */
        override fun createFromParcel(parcel: Parcel): RegressionTesting =
            RegressionTesting(parcel)

        /**
         * Parcelable override
         */
        override fun newArray(size: Int): Array<RegressionTesting?> = arrayOfNulls(size)
    }
}