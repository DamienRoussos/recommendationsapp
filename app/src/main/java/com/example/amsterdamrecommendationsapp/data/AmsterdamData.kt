package com.example.amsterdamrecommendationsapp.data

import com.example.amsterdamrecommendationsapp.R
import com.example.amsterdamrecommendationsapp.model.Recommendation

object AmsterdamData {
    fun loadRestaurants(): List<Recommendation> =
        listOf(
            Recommendation(
                id = 1,
                name = "Tolhuistuin",
                description = R.string.tolhuistuin_description,
                image = R.drawable.tolhuistuin,
                address = "Ijpromenade 2 1031 CL Amsterdam",
                phoneNumber = "020 760 4820",
                websiteUrl = "tolhuistuin.nl",
                openingHours = "daily 1am-1am",
            ),
            Recommendation(
                id = 2,
                name = "Rijsel",
                description = R.string.rijsel_description,
                image = R.drawable.rijsel,
                address = "Marcusstraat 52B 1091 TK Amsterdam",
                phoneNumber = "020 463 2142",
                websiteUrl = "rijsel.com",
                openingHours =
                    "mon - fri from 6pm on\n" +
                        "closed sat-sun",
            ),
            Recommendation(
                id = 3,
                name = "De Foodhallen",
                description = R.string.defoodhallen_description,
                image = R.drawable.defoodhallen,
                address = "Bellamyplein 51 1053AT Amsterdam",
                phoneNumber = "",
                websiteUrl = "foodhallen.nl",
                openingHours =
                    "thu-sat 11am-9pm\n" +
                        "sun-wed 11am-8pm\n" +
                        "(bar closes at midnight)",
            ),
            Recommendation(
                id = 4,
                name = "De Plantage",
                description = R.string.deplantage_description,
                image = R.drawable.deplantage,
                address = "Plantage Kerklaan 36 1018 CZ Amsterdam",
                phoneNumber = "020 760 6800",
                websiteUrl = "caferestaurantdeplantage.nl",
                openingHours =
                    "mon-fri 9am-1am\n" +
                        "sat/sun 10am-1am",
            ),
            Recommendation(
                id = 5,
                name = "Librije\\'s Zusje",
                description = R.string.librijeszusje_description,
                image = R.drawable.librijeszusje,
                address = "Herengracht 542 1017 CG Amsterdam",
                phoneNumber = "020 718 4600",
                websiteUrl = "waldorfastoria3.hilton.com",
                openingHours =
                    "lunch thu-sat 12:30pm - 2pm\n" +
                        "dinner tue-sat 6:30 10:30pm\n" +
                        "sun/mon closed",
            ),
            Recommendation(
                id = 6,
                name = "De Biertuin",
                description = R.string.librijeszusje_description,
                image = R.drawable.debiertuin,
                address = "Linnaeusstraat 29 1093 EE Amsterdam",
                phoneNumber = "020 665 0956",
                websiteUrl = "biertuin.nl",
                openingHours = "daily 11am-1am (3am weekends)",
            ),
        )

    fun loadMusicVenues(): List<Recommendation> =
        listOf(
            Recommendation(
                id = 1,
                name = "Paradiso",
                description = R.string.paradiso_description,
                image = R.drawable.paradiso,
                address = "Weteringschans 6-8 1017 SG Amsterdam",
                phoneNumber = "020 626 4521",
                websiteUrl = "paradiso.nl",
                openingHours = "see website",
            ),
            Recommendation(
                id = 2,
                name = "Melkweg",
                description = R.string.melkweg_description,
                image = R.drawable.melkweg,
                address = "Lijnbaansgracht 234a 1017 PH Amsterdam",
                phoneNumber = "020 531 8181",
                websiteUrl = "melkweg.nl",
                openingHours = "see website",
            ),
            Recommendation(
                id = 3,
                name = "De Nieuwe Anita",
                description = R.string.denieuweanita_description,
                image = R.drawable.denieuweanita,
                address = "Frederik Hendrikstraat 115 1052 HN Amsterdam",
                phoneNumber = "",
                websiteUrl = "denieuweanita.nl",
                openingHours = "varies",
            ),
            Recommendation(
                id = 4,
                name = "The Waterhole",
                description = R.string.thewaterhole_description,
                image = R.drawable.thewaterhole,
                address = "Korte Leidsedwarsstraat 49 1017 PW Amsterdam",
                phoneNumber = "020 620 8904",
                websiteUrl = "waterhole.nl",
                openingHours = "daily 4pm-3am (4am weekends)",
            ),
            Recommendation(
                id = 5,
                name = "Bitterzoet",
                description = R.string.bitterzoet_description,
                image = R.drawable.bitterzoet,
                address = "Spuistraat 2 hs 1012 TS Amsterdam",
                phoneNumber = "020 421 2318",
                websiteUrl = "bitterzoet.nl",
                openingHours = "daily 9pm-3am (11pm-4am weekends)",
            ),
            Recommendation(
                id = 6,
                name = "Occii",
                description = R.string.occii_description,
                image = R.drawable.occii,
                address = "Amstelveenseweg 134 1075 XL Amsterdam",
                phoneNumber = "020 671 7778",
                websiteUrl = "occii.org",
                openingHours = "daily 9:30pm-2am (3am weekends)",
            ),
        )

    fun loadClubs(): List<Recommendation> =
        listOf(
            Recommendation(
                id = 1,
                name = "Air",
                description = R.string.air_description,
                image = R.drawable.air,
                address = "Amstelstraat 16 1017 DA Amsterdam",
                phoneNumber = "020 820 0670",
                websiteUrl = "air.nl",
                openingHours =
                    "thu-sun 11pm-4am\n" +
                        "sat 11pm-5am",
            ),
            Recommendation(
                id = 2,
                name = "ClubNL",
                description = R.string.clubnl_description,
                image = R.drawable.clubnl,
                address = "Nieuwezijds Voorburgwal 169 1012 RK Amsterdam",
                phoneNumber = "020 622 7510",
                websiteUrl = "clubnl.nl",
                openingHours = "daily 11pm-3am (4am weekends)",
            ),
            Recommendation(
                id = 3,
                name = "Westerunie",
                description = R.string.westerunie_description,
                image = R.drawable.westerunie,
                address = "Klonne Plein 4-6 1014 DD Amsterdam",
                phoneNumber = "020 684 8496",
                websiteUrl = "westerunie.nl",
                openingHours = "see website",
            ),
            Recommendation(
                id = 5,
                name = "Escape",
                description = R.string.escape_description,
                image = R.drawable.escape,
                address = "Rembrandtplein 11 1017 CT Amsterdam",
                phoneNumber = "020 622 1111",
                websiteUrl = "escape.nl",
                openingHours =
                    "thu,sun 11pm-4am\n" +
                        "fri,sat 11pm-5am",
            ),
        )

    fun loadMuseums(): List<Recommendation> =
        listOf(
            Recommendation(
                id = 1,
                name = "Van Gogh Museum",
                description = R.string.vangoghmuseum_description,
                image = R.drawable.vangoghmuseum,
                address = "Paulus Potterstraat 7 1071 CX Amsterdam",
                phoneNumber = "020 570 5200",
                websiteUrl = "vangoghmuseum.nl",
                openingHours = "daily 9am-5pm",
            ),
            Recommendation(
                id = 2,
                name = "Rijksmuseum",
                description = R.string.rijksmuseum_description,
                image = R.drawable.rijksmuseum,
                address = "Museumstraat 1 1071 XX Amsterdam",
                phoneNumber = "020 674 7000",
                websiteUrl = "rijksmuseum.nl",
                openingHours = "daily 9am-5pm",
            ),
            Recommendation(
                id = 3,
                name = "Stedelijk Museum",
                description = R.string.stedelijkmuseum_description,
                image = R.drawable.stedelijkmuseum,
                address = "Museumplein 10 1071 DJ Amsterdam",
                phoneNumber = "020 573 2911",
                websiteUrl = "stedelijk.nl",
                openingHours = "daily 10am-6pm",
            ),
            Recommendation(
                id = 4,
                name = "Anne Frank Huis",
                description = R.string.annefrankhuis_description,
                image = R.drawable.annefrankhuis,
                address = "Prinsengracht 263 1016 GV Amsterdam",
                phoneNumber = "020 556 7100",
                websiteUrl = "annefrank.org",
                openingHours =
                    "jul-aug 9am-10pm\n" +
                        "apr-jun & sep-oct 9am-9pm\n" +
                        "nov-mar 9am-7pm",
            ),
            Recommendation(
                id = 5,
                name = "Joods Historisch Museum",
                description = R.string.joodshistorischmuseum_description,
                image = R.drawable.joodshistorischmuseum,
                address = "Nieuwe Amstelstraat 1 1011 PL Amsterdam",
                phoneNumber = "020 531 0310",
                websiteUrl = "jhm.nl",
                openingHours = "daily 11am-5pm",
            ),
            Recommendation(
                id = 6,
                name = "Scheepvaart Museum",
                description = R.string.scheepvaartmuseum_description,
                image = R.drawable.scheepvaartmuseum,
                address = "Kattenburgerplein 1 1018 KK Amsterdam",
                phoneNumber = "020 523 2222",
                websiteUrl = "hetscheepvaartmuseum.nl.nl",
                openingHours = "daily 9am-5pm",
            ),
        )

    fun loadCoffeeShops(): List<Recommendation> =
        listOf(
            Recommendation(
                id = 1,
                name = "Grey Area",
                description = R.string.greyarea_description,
                image = R.drawable.greyarea,
                address = "Oude Leliestraat 2 1015 AW Amsterdam",
                phoneNumber = "020 420 4301",
                websiteUrl = "greyarea.nl",
                openingHours = "daily 12am-8pm",
            ),
            Recommendation(
                id = 2,
                name = "De Dampkring",
                description = R.string.dedampkring_description,
                image = R.drawable.dedampkring,
                address = "Handboogstraat 29 1012 XM Amsterdam",
                phoneNumber = "020 638 0705",
                websiteUrl = "dampkring-coffeeshop-amsterdam.nl",
                openingHours = "daily 10am-1pm",
            ),
            Recommendation(
                id = 3,
                name = "The Bulldog",
                description = R.string.thebulldog_description,
                image = R.drawable.thebulldog,
                address = "Oudezijds Voorburgwal 90 1012 GG Amsterdam",
                phoneNumber = "020 624 8248",
                websiteUrl = "thebulldog.com",
                openingHours = "daily 8pm-1pm",
            ),
            Recommendation(
                id = 3,
                name = "Amnesia",
                description = R.string.amnesia_description,
                image = R.drawable.amnesia,
                address = "Herengracht 133 1015 BG Amsterdam",
                phoneNumber = "020 427 7874",
                websiteUrl = "n/a",
                openingHours = "daily 9:30am-1pm",
            ),
            Recommendation(
                id = 4,
                name = "Abraxas",
                description = R.string.abraxas_description,
                image = R.drawable.abraxas,
                address = "Jonge Roelensteeg 12 1012 PL Amsterdam",
                phoneNumber = "020 625 5763",
                websiteUrl = "abraxas.tv",
                openingHours = "daily 10am-1pm",
            ),
            Recommendation(
                id = 5,
                name = "Rusland",
                description = R.string.rusland_description,
                image = R.drawable.rusland,
                address = "Rusland 16 1012 CL Amsterdam",
                phoneNumber = "020 845 6463",
                websiteUrl = "coffeeshop-rusland-amsterdam.com",
                openingHours = "daily 10am-1pm",
            ),
        )
}
