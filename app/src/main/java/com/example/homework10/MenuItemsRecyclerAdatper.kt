package com.example.homework10

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework10.databinding.ProfileMenuItemBinding

class MenuItemsRecyclerAdatper(private val menuItems: MutableList<ProfileMenuItem>): RecyclerView.Adapter<MenuItemsRecyclerAdatper.MenuItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemHolder {
        return MenuItemHolder(ProfileMenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return menuItems.size
    }


    override fun onBindViewHolder(holder: MenuItemHolder, position: Int) {
        var item = menuItems[position]
        holder.binding.menuItemIcon.setImageResource(item.icon)
        holder.binding.menuItemText.text = item.itemText
        if (item.itemType == "logout"){
            holder.binding.menuItemText.setTextColor(Color.parseColor("#f25454"))
            holder.binding.imageViewArrow.visibility = View.GONE
        }
        if (item.itemType == "language"){
            holder.binding.menuItemTextLang.text = "En(US)"
        }
    }

    inner class MenuItemHolder(var binding: ProfileMenuItemBinding): RecyclerView.ViewHolder(binding.root){

    }
}