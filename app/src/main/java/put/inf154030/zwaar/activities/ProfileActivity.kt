package put.inf154030.zwaar.activities

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import put.inf154030.zwaar.R
import put.inf154030.zwaar.databinding.ActivityProfileBinding
import put.inf154030.zwaar.fragments.ButtonDumbbellFragment
import put.inf154030.zwaar.fragments.ButtonSaveChangesFragment
import put.inf154030.zwaar.fragments.NavigationBarFragment

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var gender: EditText
    private lateinit var height: EditText
    private lateinit var weight: EditText
    private lateinit var bmi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gender = binding.editTextGender
        height = binding.editTextHeight
        weight = binding.editTextWeight
        bmi = binding.textViewBmi

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_dumbbell, ButtonDumbbellFragment())
            .replace(R.id.fragment_container_save_changes, ButtonSaveChangesFragment())
            .replace(R.id.fragment_container_nav_bar, NavigationBarFragment())
            .commit()
    }

    fun getGender(): String {
        return gender.text.toString()
    }
    fun getHeight(): String {
        return height.text.toString()
    }
    fun getWeight(): String {
        return weight.text.toString()
    }
    fun setBMI(bmi: Double) {
        this.bmi.text = bmi.toString()
    }
}