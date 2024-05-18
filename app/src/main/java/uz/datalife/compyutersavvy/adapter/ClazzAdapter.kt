package uz.datalife.compyutersavvy.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.datalife.compyutersavvy.R
import uz.datalife.compyutersavvy.data.Clazz
import uz.datalife.compyutersavvy.databinding.ItemClassBinding

class ClazzAdapter(
    val context: Context,
    val onItemClicked: ((Clazz) -> Unit)
) : ListAdapter<Clazz, ClazzAdapter.ClazzHolder>(ClazzDiffUtil) {

    inner class ClazzHolder(private val itemClassBinding: ItemClassBinding) :
        ViewHolder(itemClassBinding.root) {

        @SuppressLint("StringFormatMatches")
        fun onBindView(clazz: Clazz) {
            itemClassBinding.inputNameClass.text = context.getString(R.string.sinf, clazz.clazz)
            itemClassBinding.root.setOnClickListener { onItemClicked(clazz) }
        }

    }

    object ClazzDiffUtil : DiffUtil.ItemCallback<Clazz>() {
        override fun areItemsTheSame(oldItem: Clazz, newItem: Clazz): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Clazz, newItem: Clazz): Boolean {
            return oldItem.clazz == newItem.clazz
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClazzHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ClazzHolder(ItemClassBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: ClazzHolder, position: Int) {
        holder.onBindView(currentList[position])
    }
}