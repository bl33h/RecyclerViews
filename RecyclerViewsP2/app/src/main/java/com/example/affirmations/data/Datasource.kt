package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://imgur.com/gallery/9eio5uA.jpg"),
            Affirmation(R.string.affirmation2, "https://imgur.com/gallery/ejtUPd5.jpg"),
            Affirmation(R.string.affirmation3, "https://imgur.com/gallery/GgLvq6L.jpg"),
            Affirmation(R.string.affirmation4, "https://imgur.com/gallery/PyZlRmH.jpg"),
            Affirmation(R.string.affirmation5, "https://imgur.com/gallery/0CAOb6y.jpg"),
            Affirmation(R.string.affirmation6, "https://imgur.com/gallery/u8i4nmR.jpg"),
            Affirmation(R.string.affirmation7, "https://imgur.com/gallery/hlftmP2.jpg"),
            Affirmation(R.string.affirmation8, "https://imgur.com/gallery/WyjERPX.jpg"),
            Affirmation(R.string.affirmation9, "https://imgur.com/gallery/DtaFS.jpg"),
            Affirmation(R.string.affirmation10, "https://imgur.com/gallery/NMCdnV5.jpg"))
    }
}