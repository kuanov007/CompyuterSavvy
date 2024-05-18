package uz.datalife.compyutersavvy.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.databinding.FragmentResultBinding

class FragmentResult : Fragment(R.layout.fragment_result) {
    private lateinit var binding: FragmentResultBinding
    private val navArguments: FragmentResultArgs by navArgs()

    @SuppressLint("StringFormatMatches")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)

        binding.tvResult.text =
            getString(
                R.string.siz_sorawdan_soraw_na_dur_s_juwap_bere_ald_n_z,
                navArguments.correctAnswer, navArguments.count
            )

        binding.btnReset.setOnClickListener { findNavController().navigateUp() }
    }
}