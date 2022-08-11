package com.ron.splashactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ron.splashactivity.databinding.ActivityRouteaBinding

class RouteaActivity : AppCompatActivity() {
    lateinit var binding:ActivityRouteaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRouteaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displatContacts()
    }
    fun displatContacts(){
        var Route1=Routes("Bwindi-Kanungu","")
        var Route2=Routes("Bwindi-Kambuga","")
        var Route3=Routes("Bwindi-Nyakabungo","")
        var Route4=Routes("Bwind-Kanungu","")
        var Route5=Routes("Bwindi-Rukungiri","")
        var Route6=Routes("Bwindi-Mbarara","")
        var Route7=Routes("Kanungu-Mbarara","")
        var Route8=Routes("Kanungu-Kambuga","")
        var Route9=Routes("Kanungu-Rukungiri","")
        var Route10=Routes("Kanungu-Masaka","")
        var Route11=Routes("Rukungiri-Kampala","")
        var Route12=Routes("Kanungu-Kampala","")
        var Route13=Routes("Kanungu-Bushenyi","")
        var Route15=Routes("Kanungu-Ryantonde","")

        var Contact = listOf(Route1,Route2,Route3,Route4,Route5,Route6,Route7,Route8,Route9,Route10,Route11,Route12,Route13,Route15)

        var TweetAdapter=RoutesRvAdapter(Contact)
        binding.rvRoutes.layoutManager= LinearLayoutManager(this)
        binding.rvRoutes.adapter=TweetAdapter

    }
}