package org.d3if4040.galerianalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4040.galerianalog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }

    private fun getData(): List<Analog> {
        return listOf(
            Analog("SLR", "Louis Desire B.E.", R.drawable.slr),
            Analog("TLR Camera", "Franke & Heidecke", R.drawable.tlr),
            Analog("Rangefinder Camera", "Epson", R.drawable.rangefinder),
            Analog("Point & Shoot", "Eastman", R.drawable.pns),
            Analog("Instant Camera", "Edwin Land", R.drawable.instant),
            Analog("Stereo Camera", "Jules Richard V.", R.drawable.stereo),
            Analog("Panoramic Camera", "Friedrich V.M.", R.drawable.panoramic),
            Analog("Folding Camera", "Francis Fowke", R.drawable.folding),
            Analog("Pinhole Camera", "Ibn al-Haytham", R.drawable.pinhole),
            Analog("Toy Camera", "Diana", R.drawable.toy),
        )
    }

}