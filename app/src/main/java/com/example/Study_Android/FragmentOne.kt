package com.example.Study_Android

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne:Fragment(){
    interface OnDataPassLinstener{
        fun onDataPass(data : String?)
    }
    lateinit var dataPasserLinstener : OnDataPassLinstener


    override fun onAttach(context: Context) {
        Log.d("life_cycle","F onAttach")
        super.onAttach(context)
        dataPasserLinstener = context as OnDataPassLinstener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle","F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle","F onCreateView")

        //프라그먼트가 인터페이스를 처음으로 그릴 때 호출된다.
        //inflater -> 뷰를 그려주는 역할
        //container -> 부모뷰(달라붙을 곳)
        return inflater.inflate(R.layout.fragment_one,container,false)
    }


    //onViewCreated : Activity의 Oncreate에서 했던 작업을 여기서 한다다
   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle","F onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        pass.setOnClickListener {
            dataPasserLinstener.onDataPass("Good bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle","F onActivityCreated")

        val data = arguments?.getString("hello")
        Log.d("data1",""+data)
        super.onActivityCreated(savedInstanceState)

    }

    override fun onStart() {
        Log.d("life_cycle","F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle","F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle","F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle","F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle","F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle","F onDetach")
        super.onDetach()
    }

}