package com.dicoding.fauzimaulana.programminglanguageinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.dicoding.fauzimaulana.programminglanguageinfo.databinding.ActivityDetailLanguageBinding
import com.dicoding.fauzimaulana.programminglanguageinfo.model.Language

class DetailLanguageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailLanguageBinding

    companion object {
        const val LANGUAGE_DATA = "language_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Detail"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val language = intent.getParcelableExtra(LANGUAGE_DATA) as Language?

        Glide.with(this)
            .load(language?.logo)
            .into(binding.logoDetail)
        binding.languageName.text = language?.name
        binding.languageRelease.text = language?.release
        binding.languageDesigned.text = language?.designed
        binding.languageDeveloper.text = language?.developer
        binding.languageWebsite.text = language?.website
        binding.languageDescription.text = language?.description
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about -> {
                val intent = Intent(this@DetailLanguageActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}