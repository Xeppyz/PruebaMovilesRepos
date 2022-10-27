package ni.edu.uca.nav_allan_silva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ni.edu.uca.nav_allan_silva.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater )
        return binding.root
    }

    fun verifiPw(pw: String, sa: String): Boolean {

        if (pw.equals("uca") && sa.equals("somos")) {
            return true
        }
        return false

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnEntrar.setOnClickListener {
            val sa = binding.etLogin.text.toString()
            val pw = binding.etPw.text.toString()
            if (verifiPw(pw, sa)) {
                it.findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
                binding.etPw.setText("")
                binding.etError.setText("")
            }else{
                binding.etError.setText("INCORRECTO")
            }

        }


    }
}