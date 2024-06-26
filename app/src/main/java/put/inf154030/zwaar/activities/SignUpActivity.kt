package put.inf154030.zwaar.activities

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import put.inf154030.zwaar.R
import put.inf154030.zwaar.databinding.ActivitySignUpBinding
import put.inf154030.zwaar.fragments.ButtonSignUpFragment
import put.inf154030.zwaar.fragments.FieldsSignUpFragment

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var checkboxAgreement: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_fields, FieldsSignUpFragment())
                .replace(R.id.fragment_container_button, ButtonSignUpFragment())
                .commit()
        }

        checkboxAgreement = binding.checkboxAgreement
    }

    fun getCheckBoxState(): Boolean {
        return checkboxAgreement.isChecked
    }
}