package uz.datalife.compyutersavvy.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.adapter.LectureAdapter
import uz.datalife.compyutersavvy.data.Lecture
import uz.datalife.compyutersavvy.data.Sources
import uz.datalife.compyutersavvy.databinding.FragmentClassesBinding

private var onFavorite: Boolean = false


class ClassesFragment : Fragment(R.layout.fragment_classes) {
    private val navArgs: ClassesFragmentArgs by navArgs()
    private lateinit var lectureAdapter: LectureAdapter

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val clazzId = navArgs.clazzId
        val binding = FragmentClassesBinding.bind(view)
        val contents = Sources.getLectureList().filter { it.clazzId == clazzId }.toMutableList()
        val titleName = binding.toolbar.findViewById<TextView>(R.id.title_name)

        titleName.text = getString(R.string.contents)

        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        lectureAdapter = LectureAdapter(
            onItemClicked = { content ->
                val action =
                    ClassesFragmentDirections.actionClassesFragmentToLectureFragment(content)
                findNavController().navigate(action)
            },
            onFavoriteClicked = { content ->
                val indexOfContent = contents.indexOf(content)

                contents.add(
                    indexOfContent,
                    Lecture(
                        content.id, content.name, content.text, content.clazzId, !content.favorite
                    )
                )
                contents.remove(content)
                lectureAdapter.notifyItemChanged(indexOfContent)
                if (onFavorite) {
                    binding.btnFavorite.setImageResource(R.drawable.ic_unfavorite)
                    lectureAdapter.submitList(
                        contents.filter { it.favorite }
                    )
                } else {
                    binding.btnFavorite.setImageResource(R.drawable.ic_favorites)
                    lectureAdapter.submitList(contents)
                }
            }
        )

        binding.btnFavorite.setOnClickListener {
            onFavorite = !onFavorite

            if (onFavorite) {
                binding.btnFavorite.setImageResource(R.drawable.ic_unfavorite)
                lectureAdapter.submitList(
                    contents.filter { it.favorite }
                )
            } else {
                binding.btnFavorite.setImageResource(R.drawable.ic_favorites)
                lectureAdapter.submitList(contents)
            }
        }


        binding.catalogs.adapter = lectureAdapter
        lectureAdapter.submitList(contents)

        binding.catalogs.addItemDecoration(
            DividerItemDecoration(
                activity,
                DividerItemDecoration.VERTICAL
            )
        )

        if (onFavorite) {
            binding.btnFavorite.setImageResource(R.drawable.ic_unfavorite)
            lectureAdapter.submitList(contents.filter { it.favorite })
        } else {
            binding.btnFavorite.setImageResource(R.drawable.ic_favorites)
            lectureAdapter.submitList(contents)
        }
    }


}
