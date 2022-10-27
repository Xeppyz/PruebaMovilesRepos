package ni.edu.uca.nav_allan_silva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.nav_allan_silva.databinding.FragmentEjedosBinding
import ni.edu.uca.nav_allan_silva.databinding.FragmentEjetresBinding


class EjetresFragment: Fragment() {
    private lateinit var binding: FragmentEjetresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEjetresBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCadena.setOnClickListener {


cadena()
        }
    }

    fun cadena() {
        val cadena: Int = binding.etNombre.text.length

        if (cadena % 2 == 0) {
            binding.tvRes.text = "El nombre tiene ${cadena} letras y es par"
        } else {
            binding.tvRes.text = "El nombre tiene ${cadena} letras y es impar"
        }

    }



}