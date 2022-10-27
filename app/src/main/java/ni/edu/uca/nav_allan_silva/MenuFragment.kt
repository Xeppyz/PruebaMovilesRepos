package ni.edu.uca.nav_allan_silva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ni.edu.uca.nav_allan_silva.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnEj1.setOnClickListener {
            it.findNavController().navigate(R.id.action_menuFragment_to_ejeunoFragment)


        }
        binding.btnEj2.setOnClickListener {
            it.findNavController().navigate(R.id.action_menuFragment_to_ejedosFragment)
        }
        binding.btnEj3.setOnClickListener {
            it.findNavController().navigate(R.id.action_menuFragment_to_ejetresFragment)
        }
    }
}