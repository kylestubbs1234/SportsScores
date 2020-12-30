package edu.ucsb.cs.cs184.sportsscores.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import edu.ucsb.cs.cs184.sportsscores.R

class nbaFragment : Fragment() {

    private lateinit var nbaViewModel: nbaViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        nbaViewModel =
                ViewModelProvider(this).get(nbaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nba, container, false)
        return root
    }
}