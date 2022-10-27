package ni.edu.uca.nav_allan_silva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.nav_allan_silva.databinding.FragmentEjedosBinding
import ni.edu.uca.nav_allan_silva.databinding.FragmentEjeunoBinding

class EjeunoFragment : Fragment() {
    private  lateinit var binding: FragmentEjeunoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEjeunoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCubo.setOnClickListener {




        }
    }

    fun moda(num:Int):Int{
        return num*num*num
    }

}