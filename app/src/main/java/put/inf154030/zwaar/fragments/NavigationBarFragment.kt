package put.inf154030.zwaar.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import put.inf154030.zwaar.R
import put.inf154030.zwaar.activities.ProfileActivity
import put.inf154030.zwaar.activities.SettingsActivity
import put.inf154030.zwaar.activities.TrainingPlanActivity

class NavigationBarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_navigation_bar, container, false)

        val buttonDate = view.findViewById<ImageButton>(R.id.image_button_date)
        val buttonProfile = view.findViewById<ImageButton>(R.id.image_button_profile)
        val buttonSettings = view.findViewById<ImageButton>(R.id.image_button_settings)

        buttonDate.setOnClickListener {
            val intent = Intent(requireActivity(), TrainingPlanActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        buttonProfile.setOnClickListener {
            val intent = Intent(requireActivity(), ProfileActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        buttonSettings.setOnClickListener {
            val intent = Intent(requireActivity(), SettingsActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        return view
    }
}