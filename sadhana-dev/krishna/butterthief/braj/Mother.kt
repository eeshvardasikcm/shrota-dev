package com.eeshvardasikcm.krishna.butterthief.braj

import android.os.Parcel
import android.os.Parcelable

/**
 * `Mother`s are one type of `Inhabitant` in `braj`
 */
class Mother() : Inhabitant(), Parcelable {
    constructor(parcel: Parcel) : this() {
        val braj: String = "place of inhabitance"
    }

    /**
     * writeToParcel is an override implementation of `Parcelable`
     */
    override fun writeToParcel(parcel: Parcel, flags: Int) {
    }

    /**
     * describeContents is an override implementation of `Parcelable`
     */
    override fun describeContents(): Int = 0

    /**
     * CREATOR is an override implementation of `Parcelable`
     */
    companion object CREATOR : Parcelable.Creator<Mother> {
        /**
         * createFromParcel is an override implementation of `Parcelable`
         */
        override fun createFromParcel(parcel: Parcel): Mother = Mother(parcel)

        /**
         * newArray  is an override implementation of `Parcelable`
         */
        override fun newArray(size: Int): Array<Mother?> = arrayOfNulls(size)
    }

}
