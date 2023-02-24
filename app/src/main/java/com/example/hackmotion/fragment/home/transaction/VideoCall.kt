package com.example.hackmotion.fragment.home.transaction

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hackmotion.databinding.ActivityVideoCallBinding
import org.jitsi.meet.sdk.JitsiMeetActivity
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions
import java.net.URL



class VideoCall : AppCompatActivity(){
    private lateinit var binding: ActivityVideoCallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoCallBinding.inflate(layoutInflater)
        val view = binding.root

        binding.imageView9.setOnClickListener {
            try {
                val options: JitsiMeetConferenceOptions = JitsiMeetConferenceOptions.Builder()
                    .setServerURL(URL("https://meet.jit.si"))
                    .setRoom("bismillah123")
                    .setAudioMuted(false)
                    .setVideoMuted(false)
                    .setAudioOnly(false)

                    .setConfigOverride("requireDisplayName", true)
                    .build()

                JitsiMeetActivity.launch(this,options)
            }catch (e:Exception){
                Log.d("errorVc", e.toString())
            }
        }

        setContentView(view)
    }
}