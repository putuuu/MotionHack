package com.example.hackmotion.fragment.home.transaction

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.navigation.navArgs
import com.bumptech.glide.Glide
import com.example.hackmotion.Menu
import com.example.hackmotion.databinding.ActivityVideoCallBinding
import org.jitsi.meet.sdk.JitsiMeetActivity
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions
import java.net.URL


class VideoCall : AppCompatActivity(){
    private lateinit var binding: ActivityVideoCallBinding

    private val args : TransactionMenuArgs by navArgs()
    private var name =""
    val tanggal =""
    val judul =""
    val desc =""
    val harga =""
    val category =""
    val foto =""

    override fun onBackPressed() {
        val intent = Intent(this, Menu::class.java)
        intent.putExtra("Back", "1")
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoCallBinding.inflate(layoutInflater)
        val view = binding.root

        binding.username.text = args.name
        binding.textviewtitle.text = args.judul
        binding.category.text = args.category
        binding.textviewTanggal2.text = args.tanggal
        binding.textViewdesc.text = args.desc
        binding.textviewHarga2.text = args.harga
        Glide.with(this)
            .load(args.foto)
            .into(binding.profileImage2);

        binding.textViewrating.visibility = View.GONE
        binding.ratingBar.visibility = View.GONE

        if (args.status == "Done"){
            binding.textViewrating.visibility = View.VISIBLE
            binding.ratingBar.visibility = View.VISIBLE
            binding.imageView9.visibility = View.GONE
        }

        binding.imageView9.setOnClickListener {
            try {
                val options: JitsiMeetConferenceOptions = JitsiMeetConferenceOptions.Builder()
                    .setServerURL(URL("https://meet.jit.si"))
                    .setRoom(args.name+" - "+args.judul)
                    .setAudioMuted(false)
                    .setVideoMuted(false)
                    .setAudioOnly(false)

                    .setConfigOverride("requireDisplayName", true)
                    .build()

                binding.textViewrating.visibility = View.VISIBLE
                binding.ratingBar.visibility = View.VISIBLE

                JitsiMeetActivity.launch(this,options)
            }catch (e:Exception){
                Log.d("errorVc", e.toString())
            }
        }

        binding.linearLayoutBack.setOnClickListener{
            onBackPressed()
        }

        setContentView(view)
    }
}