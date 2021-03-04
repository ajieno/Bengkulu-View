package com.ajieno.bengkuluview.util

import com.ajieno.bengkuluview.model.Wisata

object WisataData {
    private val wisataNames = arrayOf("Pantai Panjang",
        "Benteng Marlborough",
        "Danau Dendam Tak Sudah",
        "Pantai Tapak Paderi",
        "Pantai Sungai Suci",
        "Pantai Pasir Putih",
        "Rumah Pengasingan Soekarno",
        "Monumen Thomas parr",
        "Taman Pantai Berkas",
        "Pantai Jakat")

    private val wisataDetails = arrayOf("Terletak di bagian Barat Kota Bengkulu sekitar 3 km dari pusat  kota, Pantai berpasir putih dengan kerindangan pohon cemara laut sepanjang 7 km sangat ideal untuk rekreasi, menyaksikan matahari terbenam dan aktivitas olahraga, juga tersedia lapangan golf dengan perpaduan keindahan panorama alam, muara sungai dan pantai.",
        "Benteng Marlborough (Benteng Marlborough Indonesia, juga dikenal sebagai Malabero) adalah bekas benteng Perusahaan India Timur yang terletak di Kota Bengkulu, Sumatera. Dibangun antara 1713-1719 oleh Perusahaan India Timur di bawah kepemimpinan Gubernur Joseph Collett sebagai benteng pertahanan untuk Kediaman Perusahaan India Timur Inggris di sana. Itu adalah salah satu benteng Inggris terkuat di wilayah timur, kedua setelah Fort St. George di Madras, India.",
        "Terletak di dalam kota Bengkulu, kurang lebih 7 km dari pusat kota. Danau ini merupakan cagar alam dengan luas 577 ha terdapat flora langkah anggrek pensil, ideal untuk rekreasi, memancing, bersampang, dan penelitian.",
        "Pantai Tapak Paderi Bengkulu, suasana pantai yang sangat indah sambil menikmati indahnya sunset",
        "Pantai Sungai Suci adalah Objek wisata yang terletak di Desa Pasar Pedati, Kecamatan Pondok Kelapa, Kabupaten Bengkulu Tengah. yang kawasannya terbentang sepanjang 2Km, Objek wisata ini berjarak 15Km dari pusat Kota Bengkulu atau sekita 25Km dari Bandar Udara Fatmawati Soekarno.\n\n" +
                "Meskipun nama nya Pantai Sungai Suci Objek wisata ini tidak terdapat Sungai seperti namanya. Selain menjadi tempat objek wisata Pantai Sungai Suci ini juga merupakan salah satu lokasi mencari batu akik, di Pantai Sungai Suci ini juga terdapat Pulau kecil juga yang bisa di seberangin dengan Jembatan gantung, yang terbuat dari tali tambang yang kuat dan dasar Jembatan terbuat dari potongan papan kayu yang tebal.",
        "Pantai Panjang Bengkulu memiliki hamparan pasir putih yang halus dan lembut sehingga sangat cocok bagi Anda yang ingin berjemur dibawah sinar matahari. \n\n Berjalan kaki atau joging juga merupakan favorit di pantai ini karena Pantai Panjang Bengkulu membentang sepanjang 7 km dikelilingi pohon cemara dan pinus yang indah. Air yang bersih dan ombak yang tidak terlalu besar di Pantai Panjang menjadikan pantai ini tempat ideal untuk berenang atau bermain air.",
        "Rumah ini terletak di tengah Kota Bengkulu, tepatnya di jalan Sukarno Hatta Kelurahan Anggut Atas kecamatan Gading Cempaka. Awalnya, rumah tersebut adalah milik seorang pedagang Tionghoa yang bernama Lion Bwe Seng yang disewa oleh orang Belanda untuk menempatkan Soekarno selama diasingkan di Bengkulu. Soekarno menempati rumah itu pada 1938-1942.\n\nDi rumah ini terdapat barang-barang peninggalan Soekarno. Ada ranjang besi yang pernah dipakai Soekarno dan keluarganya, koleksi buku yang mayoritas berbahasa Belanda serta seragam grup tonil Monte Carlo asuhan Soekarno semasa di Bengkulu. Ada juga foto-foto Soekarno dan keluarganya yang menghiasi hampir seluruh ruangan dan yang tidak kalah menarik adalah sepeda tua yang dipakai Soekarno selama di Bengkulu.",
        "Tugu ini dibangun oleh Gubernur Raffles untuk memperingati matinya Gubernur Inggris yang bernama Thomas Parr. Tugu ini terletak berseberangan dengan Benteng  Marlborough di kampung Cina atau didepan pasar baru koto kota Bengkulu.",
        "Taman Pantai Berkas ini dibangun sebagai tempat tongkrongan baru buat yang pengen menikmati pantai dengan sensasi bersantai. Ikon utama yang menarik dari Taman Pantai Berkas sendiri yaitu adanya jembatan panjang yang dibangun meliuk di sepanjang kawasan taman.\n\nJembatan setinggi kurang-lebih dua hingga tiga meter tersebut dibangun menghadap ke muka pantai. Dengan lebar sekitar dua meter, pengunjung dapat menapaki jembatan sambil menikmati terpaan angin dari pantai.",
        "Pantai Jakat Bengkulu, terletak sekitar 1 kilometer dari pusat Kota Bengkulu. Berdekatan dengan Benteng Marlborough dan Pantai Tapak Paderi. Keindahan Pantai Jakat menjadi surga bagi para traveler dan backpacker. Pasalnya, keindahan pantai ini masih terjaga. Pantai \n\nJakat juga relatif aman untuk menjadi tempat mandi dan berenang. Terlebih lagi disediakan fasilitas sewa pelampung, banana boat dan lain sebagainya. Semuanya lengkap.")

    private val wisataesImages = arrayOf("https://t3iomg.sn.files.1drv.com/y4mZAIE4OKsukUO5szIE8rC8G63nU8-31jDIL7yjRw1zPf15cZcw81tEzjQ3KBZMwmvVTeS9nTXrWzNlv6WujwAttAYqgs012xQnf4nA9bDzgPstQnzZpTD8FNiU91p5hhVd9UdBDIdxIA_hYo8jH1n66gdcK9fV7YmipE2YA0UbQT476zpeWtV8kzMPsYypYxTc5yIJ5vkp9oYovNhcRQF_A/pantai-panjang-bengkulu-around.png?psid=1",
        "https://t3iomg.sn.files.1drv.com/y4myufTbcOcjco_22Zk2n1vZOJw1pUyiXpUJeXB96VIXcIzzAf7hU4UBfjHUJX9lJxjTjFKapmOho5lkHYuhaplZPUm8ejRJEpwfHa8YFc73pQu2h1a2T5M4DXNvLpBC6zq695GQoW4osnbLSvo7Qs0mx4VK9VnjqNdCu06EH2aO4UORjAbYSZbiPyAmHiaqgt9VKfNj9Edxy0eSXtBnTe3cw/Front_gate_of_Fort_Marlborough%2C_Bengkulu_2015-04-19_02.png?psid=1",
        "https://t3iomg.sn.files.1drv.com/y4m6k7v2DSGz7RY58I6fbQVAiULjmPuIrbhzuk86SxCE_hm5K1F5-hHRn8bGgVdg-S9KMRFjyiC-rp0r7yT5SowWJzZtAyYIizvG1tAxwhRYMm89rF37y3lk_VQH-NF5rfbLXA888dpinFEO4rlATJB0Ehm687Eeof3hLLQPrM1oZSPt9p1pCxdFN8FVVFyes0EsO9BAYhTjgfcv5WnzFxB1A/Danau-Dendam-Tak-Sudah-3.png?psid=1",
        "https://sn3301files.storage.live.com/y4mGGqaEEOmjCNNvunw9I6LB131J7z2DtT7Kos2-YS8OZGl2TeaJ_Sp52SD9L08Rp2jWgeO29-khHjjPMsLS6L-Rd2_8ujw4R3XN74iAAudKYN9nc-PRTxNHjUvQACVW7MQ--ZYfPNO0llDtvmVB-HbGlNI5Y6GTDmvSh1B6TZCHh0iiH2Q5KBxmmd-8PVQjjH-J0z528ztPfxSjwBKzSEtqw/PSX_20190706_174831.jpg?psid=1&width=939&height=528",
        "https://t3iomg.sn.files.1drv.com/y4mFvHplJqjNQBN46szGMs3nIsgnArYzGIWJOmyDGjtNagwA2Y35uYY3wv7wYHk9PsIdK4mowkl6Q2wtgdrFPprzg9prZ9tzLHGHTNzjvcQBgErcpdM9-8qQwZRK-Aoy1SQcKMO2Kg12Pf-WXzhI6_ikimVJ5WzIQeIsVOnE3FMO1yIK5J0vD5SjvrGe3BRedzEhBiwZR_F2sMV-8uB0W1qGQ/ss.png?psid=1",
        "https://t3lraq.sn.files.1drv.com/y4m_geeJLYRMRYksRtrVXM3mP7oCysOwLrAqF-YzlQrqBpCbmlTH1x-O7gIV0y7d_9EaRJwbYFOnVApQg8v23zdhod4Loe_VoNHouEMuH9pwsWxxD9THkm9X0ujPCvdT6BtPazLGXV1NLDYx6Dxh9LfXwAfa-6tw5Lu6nj_U6JCPSzAr8KVhRzc0QAbO8Hj4nk9QbJChuxU37aBI_8p_VyhOA/IMG_3479-2.png?psid=1",
        "https://t3iomg.sn.files.1drv.com/y4m32Gtd10uLNTso7c9NzvC-dnqeB90s67MNEVPFsW7fWXrVqGmwu3b6bD6ljHC955MiEdF6VlXM-4xue7epEmEmaExcMLLhsagcmPRsLwi_4n1yZylV8qlpNxno6b91CGxegmcd54VN0J_Sngzv7Yk8LOEWiKE4BhRQcweM6r_QM7MEBDpNyH7OE1rGMl3rO1RIAqcTm34nLxFWlJLcE-xlA/rumah-pengasingan-bung-karno.jpg?psid=1",
        "https://txlraq.sn.files.1drv.com/y4mMupfR4IYoeRkWGh8Y3VeGTgVSBGYXjNrRZv0_3XG7i24wF_rpsNvu7ejft7fLkHSZa9jzJDZKC77iF0A64liDeXKsGSrHOJTVrc4dLRxDCIzkBNGpZLs9qn1GPaX47UvlZ6aCcHl-1jywZwod4e5FzhFIvm1RnrsC-HvqPtV89uhJhOFk2RrPLpNOyLGkE5H2YKTd_Sdu46k1XzVbplOwg/Thomas_Parr_Monument%2c_Bengkulu%2c_2015-04-19_01.png?psid=1",
        "https://t3iomg.sn.files.1drv.com/y4m3Ng07eQ_CXlfU5qpznnuBSNDyj6AH8RvxtJr2NU2wKMytUy1-Mx-85TgoogHFJhxjkGlxbwEa94m1sBOcXnhtVFO6olNz2MTp3xw3mKc3L2RV-QmVuWmEo0CPIbm4C6nKIv_w4nrzl8o6iS5PyljuSSpwX927uoIwymqYVAQ3AGmr35HnrOkucw1AI_X1-AtUSgdngPpIWiZPbkIO3nhuA/WhatsApp-Image-2019-03-16-at-23.36.34.jpeg?psid=1",
        "https://t3iomg.sn.files.1drv.com/y4m9jjy03LAkDAwyZ8vmxiuzzCrLjJjpWaCyhjMmPjP_JT-iXj7T68Sw4Y_iBIvtH6PIQal1393fecGDeMRFgdISUbkKBizdqGhozhHeRv366dmIHzxmEsO9GbPjP6WWkao83SiYkSp780vDC9ie8qLwPOr-A177txUpVlAT9KnzssUdRp97JvbD9lUrBssCte3T3GxGOLQedJZhQuGQnV8Zw/IMG_802311.jpg?psid=1")

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataesImages[position]
                list.add(wisata)
            }
            return list
        }
}