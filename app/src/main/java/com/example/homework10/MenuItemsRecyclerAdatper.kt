package com.example.homework10

import android.view.LayoutInflater
import android.view.MenuItem
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

    }


    inner class MenuItemHolder(var binding: ProfileMenuItemBinding): RecyclerView.ViewHolder(binding.root){

    }


}