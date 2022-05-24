package com.dicoding.fauzimaulana.programminglanguageinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.fauzimaulana.programminglanguageinfo.adapter.ListLanguageAdapter
import com.dicoding.fauzimaulana.programminglanguageinfo.databinding.ActivityMainBinding
import com.dicoding.fauzimaulana.programminglanguageinfo.model.Language
import com.dicoding.fauzimaulana.programminglanguageinfo.model.LanguageData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ListLanguageAdapter
    private val list = ArrayList<Language>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.addAll(LanguageData.listData)

        adapter = ListLanguageAdapter(list)
        binding.rvLanguage.setHasFixedSize(true)
        binding.rvLanguage.addItemDecoration(DividerItemDecoration(this@MainActivity, LinearLayoutManager.VERTICAL))

        showRecyclerList()
        setListClickAction()
    }

    private fun showRecyclerList() {
        binding.rvLanguage.layoutManager = LinearLayoutManager(this)
        binding.rvLanguage.adapter = adapter
    }

    private fun setListClickAction() {
        adapter.setOnItemClickCallback(object : ListLanguageAdapter.OnItemClickCallback {
            override fun onItemClick(data: Language) {
                val choose = resources.getString(R.string.choose, data.name)
                Toast.makeText(this@MainActivity, choose, Toast.LENGTH_SHORT).show()
                val moveIntent = Intent(this@MainActivity, DetailLanguageActivity::class.java)
                moveIntent.putExtra(DetailLanguageActivity.LANGUAGE_DATA, data)
                startActivity(moveIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}