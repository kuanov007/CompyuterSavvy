package uz.datalife.compyutersavvy.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.databinding.FragmentChooseBinding

class ChooseFragment : Fragment(R.layout.fragment_choose) {

    private val navArgs: ChooseFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentChooseBinding.bind(view)

        binding.apply {
            toolbar.title = "${navArgs.clazzId} - sinf"
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
            toolbar.setNavigationOnClickListener {
                findNavController().navigateUp()
            }
        }

        binding.goLecture.setOnClickListener {
            val action =
                ChooseFragmentDirections.actionChooseFragment2ToClassesFragment(navArgs.clazzId)
            findNavController().navigate(action)
        }

        binding.goTest.setOnClickListener {
            val action =
                ChooseFragmentDirections.actionChooseFragment2ToFragmentGame(navArgs.clazzId)
            findNavController().navigate(action)
        }
    }
}