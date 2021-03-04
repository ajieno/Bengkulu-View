package com.ajieno.bengkuluview.activity

import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ajieno.bengkuluview.R
import com.ajieno.bengkuluview.model.Wisata
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val Extra = "Extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            description_detail.justificationMode = JUSTIFICATION_MODE_INTER_WORD
        }

        val wisata : Wisata = intent.getParcelableExtra(Extra)

        title_detail.setText(wisata.name)
        description_detail.setText(wisata.detail)
        Picasso.get().load(wisata.photo).into(img_detail);

    }
}