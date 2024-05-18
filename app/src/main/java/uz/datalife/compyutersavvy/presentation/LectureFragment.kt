package uz.datalife.compyutersavvy.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.data.Sources
import uz.datalife.compyutersavvy.databinding.FragmentLectureBinding

class LectureFragment : Fragment(R.layout.fragment_lecture) {

    private val navigationArguments: LectureFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentLectureBinding.bind(view)
        val content = navigationArguments.lecture

        val lecture = Sources.getLectureList().first { it.name == content.name }

        binding.lecture.text = lecture.text
        binding.btnBack.setOnClickListener { findNavController().navigateUp() }
    }
}