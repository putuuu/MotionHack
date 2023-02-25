package com.example.hackmotion.dataSource;

import com.example.hackmotion.fragment.model.Call;

import java.util.ArrayList;
import java.util.List;

public class Source {

    public static List<Call> getCall(){
        List<Call> lstCall = new ArrayList<>();
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "Cara Boker",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Video Call",
                "https://pixabay.com/id/photos/anjing-satwa-matahari-terbenam-7535633/",
                "Done"));
        lstCall.add(new Call("Eren Yaeger", "15 Maret 2023", "Cara Boker",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp50.000", "Video Call",
                "https://pixabay.com/id/photos/anjing-satwa-matahari-terbenam-7535633/",
                "Ongoing"));
        lstCall.add(new Call("Mikasa", "15 Maret 2023", "Childfree itu pilihan?",
                "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini." +
                        "Childfree adalah keputusan pasangan untuk tidak memiliki anak dalam pernikahan mereka. Tak dimungkiri ada banyak pasangan yang bahkan memutuskan pilihan ini.",
                "Rp40.000", "Private Call",
                "https://pixabay.com/id/photos/anjing-satwa-matahari-terbenam-7535633/",
                "Ongoing"));

        return lstCall;
    }


}
