package se.magictechnology.pia9merdatabind

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import se.magictechnology.pia9merdatabind.databinding.StartItemBinding

class StartAdapter() : RecyclerView.Adapter<StartViewHolder>() {

    var people = mutableListOf<Person>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val binding = StartItemBinding.inflate(inflater)

        val vh = StartViewHolder(binding)
        return vh
    }

    override fun getItemCount(): Int {
        return people.size
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {

        holder.bind(people[position])



    }

}

class StartViewHolder (val binding : StartItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(someone : Person)
    {
        binding.rowperson = someone

        binding.executePendingBindings()

        /*
        if(someone.isActive)
        {
            binding.textView4.text = "BANAN"
        }
         */
    }

}