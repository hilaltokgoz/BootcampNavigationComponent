package com.bootcampnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bootcampnavigationcomponent.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    //Fragment'ta viewBinding kurulumu
    private var _binding: FragmentHomePageBinding? =
        null //lateinit var olarak tanımlanmadığı için default olarak null değeri verildi.
    private val binding get() = _binding!! //yukarıda verilen değiştirilebilir binding yapısını değiştirilemez hale getirdik.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePageBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    //Oluşturulan view kapandığında yapılmasını istediklerimizi yazacağımız fonksiyondur.
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null //ui ile ilgili veriler gereksiz yer kaplamasın diye
    }
}