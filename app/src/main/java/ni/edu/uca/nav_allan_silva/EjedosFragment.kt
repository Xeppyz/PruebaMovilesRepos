package ni.edu.uca.nav_allan_silva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.nav_allan_silva.databinding.FragmentEjedosBinding


class EjedosFragment : Fragment() {
private  lateinit var binding: FragmentEjedosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
binding = FragmentEjedosBinding.inflate(layoutInflater)
       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
binding.btnCubo.setOnClickListener {

val num =binding.etNum.text.toString().toInt()
val res = cubo(num)

    binding.tvRes.setText(res.toString())
}
    }

    fun cubo(num:Int):Int{
        return num*num*num
    }

}