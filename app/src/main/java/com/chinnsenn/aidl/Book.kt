package com.chinnsenn.aidl

import android.os.Parcel
import android.os.Parcelable

class Book() : Parcelable {
	private var name:String? = null
	private var id:Int? = null

	constructor(parcel: Parcel) : this() {
		name = parcel.readString()
		id = parcel.readValue(Int::class.java.classLoader) as? Int
	}

	override fun writeToParcel(dest: Parcel?, flags: Int) {
		dest?.writeString(name)
		dest?.writeValue(id)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<Book> {
		override fun createFromParcel(parcel: Parcel): Book {
			return Book(parcel)
		}

		override fun newArray(size: Int): Array<Book?> {
			return arrayOfNulls(size)
		}
	}
}