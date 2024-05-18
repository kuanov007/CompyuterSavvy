package uz.datalife.compyutersavvy.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.adapter.ClazzAdapter
import uz.datalife.compyutersavvy.data.Clazz
import uz.datalife.compyutersavvy.databinding.FragmentLessonsBinding

private val classes by lazy { mutableListOf<Clazz>() }

class LessonsFragment : Fragment(R.layout.fragment_lessons) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentLessonsBinding.bind(view)
        val clazzAdapter = ClazzAdapter(requireContext()) { clazz: Clazz ->
            findNavController().navigate(
                LessonsFragmentDirections.actionLessonsFragmentToChooseFragment2(clazzId = clazz.clazz)
            )
        }

        binding.apply {
            toolbar.title = getString(R.string.classes)
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
            toolbar.setNavigationOnClickListener {
                findNavController().navigateUp()
            }
        }

        binding.catalogs.adapter = clazzAdapter
        clazzAdapter.submitList(classes)
        binding.catalogs.addItemDecoration(
            DividerItemDecoration(
                activity,
                DividerItemDecoration.VERTICAL
            )
        )

        classes.clear()
        for (i in 5 until 12) {
            classes.add(Clazz(i - 5, i))
        }
    }
}