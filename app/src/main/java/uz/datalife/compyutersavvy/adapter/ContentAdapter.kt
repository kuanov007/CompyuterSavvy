package uz.datalife.compyutersavvy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.data.Lecture
import uz.datalife.compyutersavvy.databinding.ItemContentBinding

class LectureAdapter(
    val onItemClicked: ((Lecture) -> Unit),
    val onFavoriteClicked: ((Lecture) -> Unit)
) : ListAdapter<Lecture, LectureAdapter.LectureHolder>(LectureDiffUtil) {
    inner class LectureHolder(private val itemLectureBinding: ItemContentBinding) :
        ViewHolder(itemLectureBinding.root) {

        fun onBindView(content: Lecture) {
            itemLectureBinding.contentName.text = content.name

            itemLectureBinding.contentName.setOnClickListener {
                onItemClicked(content)
            }

            itemLectureBinding.btnFavorite.setOnClickListener {
                onFavoriteClicked(content)

                itemLectureBinding.btnFavorite.setImageResource(
                    if (content.favorite) {
                        R.drawable.ic_unfavorite
                    } else {
                        R.drawable.ic_favorites
                    }
                )
            }

            itemLectureBinding.btnFavorite.setImageResource(
                if (content.favorite) {
                    R.drawable.ic_unfavorite
                } else {
                    R.drawable.ic_favorites
                }
            )
        }
    }

    object LectureDiffUtil : DiffUtil.ItemCallback<Lecture>() {
        override fun areItemsTheSame(oldItem: Lecture, newItem: Lecture): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Lecture, newItem: Lecture): Boolean {
            return oldItem.name == newItem.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LectureHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LectureHolder(ItemContentBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: LectureHolder, position: Int) {
        holder.onBindView(currentList[position])
    }
}