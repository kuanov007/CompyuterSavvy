package uz.datalife.compyutersavvy.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentMainBinding.bind(view)

        binding.apply {
            selectedKarakalpak.setOnClickListener {
                val action = MainFragmentDirections.actionMainFragmentToLessonsFragment(0)
                findNavController().navigate(action)
            }
            selectedUzbek.setOnClickListener {
                val action = MainFragmentDirections.actionMainFragmentToLessonsFragment(1)
                findNavController().navigate(action)
            }
            selectedRussian.setOnClickListener {
                val action = MainFragmentDirections.actionMainFragmentToLessonsFragment(2)
                findNavController().navigate(action)
            }

            btnAbout.setOnClickListener {
                TODO("ABOUT")
            }
        }
    }
}