package org.d3if4040.galerianalog

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.d3if4040.galerianalog.databinding.ListItemBinding

class MainAdapter(private val data: List<Analog>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    class ViewHolder(
        private val binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(analog: Analog) = with(binding) {
            namaTextView.text = analog.nama
            penemuTextView.text = analog.penemu
            imageView.setImageResource(analog.imageresId)

            root.setOnClickListener {
                val message = root.context.getString(R.string.message, analog.nama)
                Toast.makeText(root.context, message, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}