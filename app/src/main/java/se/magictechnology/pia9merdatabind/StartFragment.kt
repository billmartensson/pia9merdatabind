package se.magictechnology.pia9merdatabind

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import se.magictechnology.pia9merdatabind.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    var startadapter = StartAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = FragmentStartBinding.inflate(inflater, container, false)

        binding.thestarttext = "BANAN!!"

        binding.startRV.layoutManager = LinearLayoutManager(context)
        binding.startRV.adapter = startadapter

        return binding.root

        //return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var names = mutableListOf<Person>()
        names.add(Person("Arne", "Arnesson", true))
        names.add(Person(firstname = "Berit", lastname = "Beritsson", isActive = true))
        names.add(Person(firstname = "Ceasar", lastname = "Romsson", isActive = false))

        startadapter.people = names
        startadapter.notifyDataSetChanged()

    }

}