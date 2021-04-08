package se.magictechnology.pia9merdatabind

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StartAdapter() : RecyclerView.Adapter<StartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {

        val vh = StartViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.start_item, parent, false))
        return vh
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {



    }

}

class StartViewHolder (view: View) : RecyclerView.ViewHolder(view) {



}