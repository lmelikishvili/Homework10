package com.example.homework10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val menuItems = mutableListOf<ProfileMenuItem>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupMenu()

        binding.MenuItemsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.MenuItemsRecyclerView.adapter = MenuItemsRecyclerAdatper(menuItems = menuItems)

    }

    private fun setupMenu(){
        menuItems.also {
            it.add(
                ProfileMenuItem(
                    itemType ="editProfile",
                    icon = R.drawable.ep_icon,
                    itemText = "Edit Profile"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="address",
                    icon = R.drawable.address_icon,
                    itemText = "Address"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="notification",
                    icon = R.drawable.notification_icon,
                    itemText = "Notification"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="security",
                    icon = R.drawable.security_icon,
                    itemText = "Security"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="language",
                    icon = R.drawable.language_icon,
                    itemText = "Language"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="mode",
                    icon = R.drawable.mode_icon,
                    itemText = "Dark Mode"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="privacyPolicy",
                    icon = R.drawable.policy_icon,
                    itemText = "Privacy Policy"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="helpCenter",
                    icon = R.drawable.help_icon,
                    itemText = "Help Center"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="inviteFriends",
                    icon = R.drawable.invite_icon,
                    itemText = "Invite Friends"
                )
            )
            it.add(
                ProfileMenuItem(
                    itemType ="logout",
                    icon = R.drawable.logout_icon,
                    itemText = "Logout"
                )
            )
        }
    }
}