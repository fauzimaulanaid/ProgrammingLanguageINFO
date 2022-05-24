package com.dicoding.fauzimaulana.programminglanguageinfo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.fauzimaulana.programminglanguageinfo.databinding.ItemRowLanguageBinding
import com.dicoding.fauzimaulana.programminglanguageinfo.model.Language

class ListLanguageAdapter(private val listLanguage: ArrayList<Language>): RecyclerView.Adapter<ListLanguageAdapter.ListViewHolder>() {

    private var onItemClickCallback : OnItemClickCallback? = null

    class ListViewHolder(private val binding: ItemRowLanguageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(language: Language) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(language.logo)
                    .apply(RequestOptions().override(55, 55))
                    .into(languageLogo)
                tvLanguageName.text = language.name
                tvLanguageDescription.text = language.description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowLanguageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listLanguage[position])
        holder.itemView.setOnClickListener {
            onItemClickCallback?.onItemClick(listLanguage[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listLanguage.size

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClick(data: Language)
    }
}