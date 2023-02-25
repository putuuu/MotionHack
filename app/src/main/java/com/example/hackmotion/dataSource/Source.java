package com.example.hackmotion.dataSource;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;

import com.example.hackmotion.R;
import com.example.hackmotion.fragment.model.Call;
import com.example.hackmotion.fragment.model.Kategori;
import com.example.hackmotion.fragment.model.LiveStream;
import com.example.hackmotion.fragment.model.Notif;
import com.example.hackmotion.fragment.model.Users;

import java.util.ArrayList;
import java.util.List;

public class Source {

    public static List<Call> getCall(){
        List<Call> lstCall = new ArrayList<>();
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "HBD in dong",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Video Call",
                "https://cdn.pixabay.com/photo/2022/10/20/19/31/dog-7535633_960_720.jpg",
                "Done"));
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "Pengen makan titan?",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp50.000", "Video Call",
                "https://cdn.pixabay.com/photo/2022/10/20/19/31/dog-7535633_960_720.jpg",
                "Ongoing"));
        lstCall.add(new Call("Mikasa", "15 Maret 2023", "Childfree itu pilihan?",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Private Call",
                "https://cdn.pixabay.com/photo/2014/12/16/22/25/woman-570883_960_720.jpg",
                "Ongoing"));
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "Cara Boker",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Video Call",
                "https://cdn.pixabay.com/photo/2022/10/20/19/31/dog-7535633_960_720.jpg",
                "Done"));
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "HBD in dong",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Video Call",
                "https://cdn.pixabay.com/photo/2022/10/20/19/31/dog-7535633_960_720.jpg",
                "Available"));
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "Pengen makan titan?",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp50.000", "Video Call",
                "https://cdn.pixabay.com/photo/2022/10/20/19/31/dog-7535633_960_720.jpg",
                "Available"));
        lstCall.add(new Call("Mikasa", "15 Maret 2023", "Childfree itu pilihan?",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Private Call",
                "https://cdn.pixabay.com/photo/2014/12/16/22/25/woman-570883_960_720.jpg",
                "Available"));
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "Cara Boker",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Video Call",
                "https://cdn.pixabay.com/photo/2022/10/20/19/31/dog-7535633_960_720.jpg",
                "Available"));


        return lstCall;
    }

    public static List<Users> getUser(){
        List<Users> lstUser = new ArrayList<>();

        lstUser.add(new Users("1", "admin", "+6234567890", "admin",
                "example@gmail.com","admin123",
                "https://us-tuna-sounds-images.voicemod.net/1a1c77ef-bd48-42d6-a0c6-6d1b8ac8c916-1652883579309.jpg",
                "true"));


        return lstUser;
    }

    public static List<Notif> getNotif(){
        List<Notif> lstNotif = new ArrayList<>();

        lstNotif.add(new Notif("Mikasa Group Call Done!", "5 minutes ago",
                "https://cdn.pixabay.com/photo/2014/12/16/22/25/woman-570883_960_720.jpg"));

        lstNotif.add(new Notif("Mikasa Group Call Start!", "10 minutes ago",
                "https://cdn.pixabay.com/photo/2014/12/16/22/25/woman-570883_960_720.jpg"));

        lstNotif.add(new Notif("Erna Private Call Done!", "23 minutes ago",
                "https://images.unsplash.com/photo-1676824448402-f2b534d6bb4e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));

        lstNotif.add(new Notif("Erna Private Call Start!", "40 minutes ago",
                "https://images.unsplash.com/photo-1676824448402-f2b534d6bb4e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));

        lstNotif.add(new Notif("Kimmy Private Call Done!", "1 day ago",
                "https://images.unsplash.com/photo-1676824452052-b030b9026b5b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));

        lstNotif.add(new Notif("Kimmy Private Call Start!", "1 day ago",
                "https://images.unsplash.com/photo-1676824452052-b030b9026b5b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));

        return lstNotif;
    }

    public static List<LiveStream> getStream(){
        List<LiveStream> lstStream = new ArrayList<>();

        lstStream.add(new LiveStream("Eren Yaeger", "Mukbang Titan",
                "https://images.unsplash.com/photo-1676824454725-21847de1611f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));

        lstStream.add(new LiveStream("Sergio Marquina", "Ngerampok Bank",
                "https://images.unsplash.com/photo-1676824456321-ab40df50875c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        lstStream.add(new LiveStream("Pak Joni", "Mandi Lumpur",
                "https://images.unsplash.com/photo-1676824469794-9d8deeaf1f2c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"));
        lstStream.add(new LiveStream("Pesulap Ungu", "Cari Dukun",
                "https://images.unsplash.com/photo-1677181517395-043e274ba2c4?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"));



        return lstStream;
    }

    public static List<Kategori> getKategori(){
        List<Kategori> lstKategoti = new ArrayList<>();

        lstKategoti.add(new Kategori(R.drawable.groupcall,"Group Call"));
        lstKategoti.add(new Kategori(R.drawable.privatecall,"Private Call"));
        lstKategoti.add(new Kategori(R.drawable.giftspeech,"Gift Speech"));
        lstKategoti.add(new Kategori(R.drawable.personalchat,"Personal Chat"));
        lstKategoti.add(new Kategori(R.drawable.livestream,"Live Stream"));

        return lstKategoti;
    }

}
