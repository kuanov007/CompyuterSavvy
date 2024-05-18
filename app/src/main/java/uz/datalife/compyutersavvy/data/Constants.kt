package uz.datalife.compyutersavvy.data

object Constants {

    private val classes = mutableListOf<Clazz>()


    fun fillClasses() {
        for (i in 0 until 7) {
            classes.add(Clazz(i, i + 5))
        }
    }

    fun getClasses(): MutableList<Clazz> = classes
    fun privedeQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        questions.add(
            Question(
                id = 0,
                class_id = 5,
                question = "Kompyuterning asosiy qurilmalari nimalardan iborat?",
                option = listOf(
                    "Modem, printer, monitor, klaviatura",
                    "Sistemali blok, printer, klaviatura, sichqoncha",
                    "Sistemali blok, monitor, klaviatura, sichqonch"
                ),
                correctAnswer = "Sistemali blok, monitor, klaviatura, sichqonch"
            )
        )

        questions.add(
            Question(
                id = 1,
                class_id = 5,
                question = "DELETE klavishining vazifasi-",
                option = listOf(
                    "matn yoki berilganlarni kiritish ",
                    "Matn yoki berilganlarni chap tomonga qarab o'chiráish",
                    "Matn yoki berilganlarni o'ng tomonga qarab o'chirish"
                ),
                correctAnswer = "Matn yoki berilganlarni o'ng tomonga qarab o'chirish",
            )
        )
        questions.add(
            Question(
                id = 2,
                class_id = 5,
                question = "Xavsizlik  texnikasi  qoidalari  to’g’ri  keltirilgan  javobni  belgilang?",
                option = listOf(
                    "Kompyuter  stoliga  20 sm uzoqlikda  o’tirish",
                    "Kompyuterda  ishlash  kuniga  180 daqiqa bo’lishi  kerak",
                    "Kompyuter  ekraniga  qo’l  bilan  tegish"
                ),
                correctAnswer = "Kompyuter  ekraniga  qo’l  bilan  tegish"
            )
        )
        questions.add(
            Question(
                id = 3,
                class_id = 5,
                question = "Kompyuter  so’zining  ma’nosi  ?",
                option = listOf(
                    "Lotincha  hisoblagich",
                    "Inglizcha  ma’lumot",
                    "Inglizcha  hisoblagich"
                ),
                correctAnswer = "Inglizcha  hisoblagich"
            )
        )
        questions.add(
            Question(
                id = 4,
                class_id = 5,
                question = "Kompyuter  yordamida  qanday  ishlar  amalga  oshirilsa  bo’ladi?",
                option = listOf(
                    "Axborotlani  uzatish",
                    "Axborotlarni  faqat  saqlash mumkin",
                    "Axborotlarni  izlash,  to’plash,saqlash,qayta ishlash,vauzatish."
                ),
                correctAnswer = "Axborotlarni  izlash,  to’plash,saqlash,qayta ishlash,vauzatish."
            )
        )
        questions.add(
            Question(
                id = 5,
                class_id = 5,
                question = "Qattiq  disk  nima?",
                option = listOf(
                    "Ma’lumotlarni  qog’ozga  chiqarib  beradi",
                    "A va  B  javob  to’g’ri",
                    "Ma’lumotlarni  saqlovchi  xotira  qurilmasi"
                ),
                correctAnswer = "Ma’lumotlarni  saqlovchi  xotira  qurilmasi"
            )
        )
        questions.add(
            Question(
                id = 6,
                class_id = 5,
                question = "Sistema  bloki  necha  qismdan  iborat?",
                option = listOf("3", "5", "4"),
                correctAnswer = "4"
            )
        )
        questions.add(
            Question(
                id = 7,
                class_id = 5,
                question = "Monitor  so’zining  ma’nosini toping?",
                option = listOf(
                    "Inglizcha   eslatuvchi",
                    "Grekcha  “ eslatuvchi, xabar  beruvchi”",
                    "Lotincha   “eslatuvchi, xabar  beruvchi”"
                ),
                correctAnswer = "Lotincha   “eslatuvchi, xabar  beruvchi”"
            )
        )
        questions.add(
            Question(
                id = 8,
                class_id = 5,
                question = "Tushurib  qoldirilgan  so’zlarni  joyiga  qo’ying?.   Klaviatura  bu ……",
                option = listOf("Sd va DVD  qurilmasi", "Oyna", "Tugmachalar  qurilmasi"),
                correctAnswer = "Tugmachalar  qurilmasi"
            )
        )
        questions.add(
            Question(
                id = 9,
                class_id = 5,
                question = "Kompyuterni  ishga  tushirish  tartibini  belgilang?",
                option = listOf(
                    "Faqat  POWER  tugmasi  bosiladi",
                    "Monitor  yoqiladi",
                    "Elektr  manbasiga  ulash-sistema  blokidagi POWER tugmasi yoqiladi-monitor yoqiladi"
                ),
                correctAnswer = "Elektr  manbasiga  ulash-sistema  blokidagi POWER tugmasi yoqiladi-monitor yoqiladi"
            )
        )
        questions.add(
            Question(
                id = 10,
                class_id = 5,
                question = "Kompyuterrni  o’chirish  tartibini  toping?.",
                option = listOf(
                    "Elektr  tarmogi o’chiriladi",
                    "Monitor  o’chiriladi",
                    "Ishlayotgan dastur  yopiladi-PUSK-завершение работь- monitor o’chiriladi-elektr manbai o’chiriladi."
                ),
                correctAnswer = "Ishlayotgan dastur  yopiladi-PUSK-завершение работь- monitor o’chiriladi-elektr manbai o’chiriladi."

            )
        )
        questions.add(
            Question(
                id = 11,
                class_id = 5,
                question = "Hardware  qanday  ma’noni  bildiradi?",
                option = listOf(
                    "Lotincha. Hard-qattiq, ware-buyum",
                    "Grekcha. Hard-qattiq, ware-buyum",
                    "Ing. Hard-qattiq, ware-buyum"
                ),
                correctAnswer = "Ing. Hard-qattiq, ware-buyum"
            )
        )
        questions.add(
            Question(
                id = 12,
                class_id = 5,
                question = "Software  qanday  ma’noni  bildiradii?",
                option = listOf(
                    "Grekcha. Soft-yumshoq,  ware-buyum",
                    "Lotincha. Soft-yumshoq,  ware-buyum",
                    "Lotincha. Soft-yumshoq,  ware-buyum"
                ),
                correctAnswer = "Lotincha. Soft-yumshoq,  ware-buyum"
            )
        )
        questions.add(
            Question(
                id = 13,
                class_id = 5,
                question = "Operasion  sistema  nima?",
                option = listOf(
                    "Amaliy  dastur",
                    "Ava  B javoblar",
                    "Dasturiy  ta’minotning  asosiy  qismi"
                ),
                correctAnswer = "Dasturiy  ta’minotning  asosiy  qismi"
            )
        )
        questions.add(
            Question(
                id = 14,
                class_id = 5,
                question = "Windows  so’zining  ma’nosi?",
                option = listOf(
                    "Ma’lumotlar",
                    " Papka ",
                    "Ing.  Oynalar, derazalar"
                ),
                correctAnswer = "Ing.  Oynalar, derazalar"
            )
        )
        questions.add(
            Question(
                id = 15,
                class_id = 6,
                question = "Axborotlarni  saqlashning  eng  qadimiy  usullari  nima  hisoblangan?",
                option = listOf("Tosh  devor", "Terilar", "Yozuv"),
                correctAnswer = "Yozuv"

            )
        )
        questions.add(
            Question(
                id = 16,
                class_id = 6,
                question = "Yozuv  vositalari  to’g’ri  keltirilgan  javobni  belgilang?",
                option = listOf(
                    "Axborot , ruchka,qalam",
                    "Kitob, daftar, moyqalam",
                    "Tosh  devor, qog’oz  pat, terilar, qogoz va ruchka, qog’oz va mashinka"
                ),
                correctAnswer = "Tosh  devor, qog’oz  pat, terilar, qogoz va ruchka, qog’oz va mashinka"
            )
        )
        questions.add(
            Question(
                id = 17,
                class_id = 6,
                question = "Matn  muharririning  asosiy  elementlari…………      Jumlani  toping?",
                option = listOf("Menyu", "Yurgich", "Ish  stoli,yurgich  va menyu"),
                correctAnswer = "Ish  stoli,yurgich  va menyu"
            )
        )
        questions.add(
            Question(
                id = 18,
                class_id = 6,
                question = "Yurgich  odatda  qanday   chiziqcha  ko’rinishda  bo’ladi?",
                option = listOf(
                    "Faqat  vertikal",
                    "Faqat  gorizontal",
                    "Vertical  va  gorizontal"
                ),
                correctAnswer = "Vertical  va  gorizontal"
            )
        )
        questions.add(
            Question(
                id = 19,
                class_id = 6,
                question = "Matnni  tahrirlash  deganda  nimani  tushunasiz?",
                option = listOf(
                    "Abzasni o’zgartirish",
                    "So’zlar va satrlarni  o’zgartirish",
                    "Belgilar,so’zlar, satrlar, abzaslar  o’rnini  almashtirish"
                ),
                correctAnswer = "Belgilar,so’zlar, satrlar, abzaslar  o’rnini  almashtirish"
            )
        )
        questions.add(
            Question(
                id = 20,
                class_id = 6,
                question = "“Курсив” – yozuv  shakli  matnda  aks  etishi  qanday  bo’ladi?",
                option = listOf("Oddiy", "Qalin", "Og’ma"),
                correctAnswer = "Og’ma",
            )
        )
        questions.add(
            Question(
                id = 21,
                class_id = 6,
                question = "“Полижирнъй “- yozuv  shakli  matnda  aks  etishi  qanday  bo’ladi?",
                option = listOf("Og’ma", "Oddiy", "Qalin"),
                correctAnswer = "Qalin"
            )
        )
        questions.add(
            Question(
                id = 22,
                class_id = 6,
                question = "“ Полижирнъй  курсив”- yozuv  shakli  matnda  aks  etishi  qanday  bo’ladi?",
                option = listOf("Qalin  og’ma", "Qalin", "Og’ma"),
                correctAnswer = "Qalin  og’ma"
            )
        )
        questions.add(
            Question(
                id = 23,
                class_id = 6,
                question = "Matn  protsessori  yordamida   tayyorlangan   matn  ……………… deb    ataladi ?",
                option = listOf("Format", "Ma’lumot", "Hujjat"),
                correctAnswer = "Hujjat"
            )
        )
        questions.add(
            Question(
                id = 24,
                class_id = 6,
                question = "Til  panelida  yuqoridagi   nechta   til  holatiga  mos  tugmalaridan  biri  aks  etib  turadi ?",
                option = listOf("6ta", "2ta", "3ta"),
                correctAnswer = "3ta"
            )
        )
        questions.add(
            Question(
                id = 25,
                class_id = 6,
                question = "Yangi   abzasga  o’tish  uchun………………klavishini     bosish  shart",
                option = listOf("Ctrl", "Probel", "Enter"),
                correctAnswer = "Enter"
            )
        )
        questions.add(
            Question(
                id = 26,
                class_id = 6,
                question = "Qat’iy   tireni  yozish  uchun …………  ,  …………..  va   ……   klavishlarini  birgalikda  bosiladi",
                option = listOf("Ctrl,  Alt", "Probel,shift", "Ctrl , shift  va  "),
                correctAnswer = "Ctrl , shift  va  "
            )
        )
        questions.add(
            Question(
                id = 27,
                class_id = 6,
                question = "Ishga  tushirilgan  MS Word  dasturi  interfeysiga  sarlavha  …………. aks etadi. Jumlani  to’ldiring?",
                option = listOf(
                    "Sarlavha satri, menyular satri",
                    "tasma, ish  shasi  va  holat  satri",
                    "Sarlavha satri, menyular satri, tasma, ish  shasi  va  holat  satri."
                ),
                correctAnswer = "Sarlavha satri, menyular satri, tasma, ish  shasi  va  holat  satri."
            )
        )
        questions.add(
            Question(
                id = 28,
                class_id = 6,
                question = "Abzas  so’zining  ma’nosini  toping?",
                option = listOf(
                    "Lotincha- matnning  bo’limi",
                    "Grekcha-matnning  bo’limi ",
                    "Nemischa – matnning  bo’limi"
                ),
                correctAnswer = "Nemischa – matnning  bo’limi"
            )
        )
        questions.add(
            Question(
                id = 29,
                class_id = 6,
                question = "Format  so’zining  ma’nosi?",
                option = listOf(
                    "Grekcha - shakl  beraman",
                    "Inglizcha-shakl  beraman",
                    "Lotincha –shakl  beraman"
                ),
                correctAnswer = "Lotincha –shakl  beraman"
            )
        )
        questions.add(
            Question(
                id = 30,
                class_id = 7,
                question = "“Informatsiya” so’zi lotinchadan qaysi so’zdan olingan?",
                option = listOf("Inform", "Formatika", "Formatika", "informatio  to’g’ri javob"),
                correctAnswer = "informatio  to’g’ri javob"

            )
        )
        questions.add(
            Question(
                id = 31,
                class_id = 7,
                question = "Informatika termini (atamasi)qaysi tildagi so’zlarso’zlr asosida hosil bo’lgan?",
                option = listOf("Lotin", "Ingliz", "Nemis", "Fransuz"),
                correctAnswer = "Fransuz"
            )
        )
        questions.add(
            Question(
                id = 32,
                class_id = 7,
                question = "………..deganda biz barcha sezgi a’zolarimiz orqali borliqning ongimizdagi aksini aksini yoki ta’sirini ,borliqlik darajasini tushunamiz",
                option = listOf(
                    "Axborot texnologiyasi",
                    "Axborot sistemasi",
                    "Informatika",
                    "Axborot"
                ),
                correctAnswer = "Axborot"
            )
        )
        questions.add(
            Question(
                id = 33,
                7,
                "Lotincha “informatio”so’zi nimani anglatadi?",
                option = listOf(
                    "Ma’lumotlar,yangiliklarni olish",
                    "Ko’rishni ta’minlash",
                    "Xabar berish",
                    "Tushuntirish ,tavsiflash,xabar olish"
                ),
                correctAnswer = "Tushuntirish ,tavsiflash,xabar olish"
            )
        )
        questions.add(
            Question(
                34,
                7,
                "Informatikaga qachon sos solingan?",
                option = listOf(
                    "XIX asrning 50-yillarida",
                    "XX asrning 60-yillarida",
                    "XIX asrning 60-yillarida",
                    "XX asrning 50-yillarida"
                ),
                correctAnswer = "XX asrning 50-yillarida"
            )
        )
        questions.add(
            Question(
                35,
                7,
                "Bilish nechaga bo’linadi?",
                option = listOf("3", "4", "5", "2"),
                correctAnswer = "2"
            )
        )
        questions.add(
            Question(
                36,
                7,
                "Informatika fani qaysi qismlardan tashkil topgan?",
                option = listOf(
                    "To’liq tushunarli",
                    "Raqmli signalli",
                    "Grafikli,tovushli",
                    "Qattiq yumshoq"
                ),
                correctAnswer = "Qattiq yumshoq"
            )
        )
        questions.add(
            Question(
                37,
                7,
                "Teri badan sezgisi qaysi axborot manbasi bilan mos keladi?",
                option = listOf("Asal", "Rasm", "Atir", "Shamol"),
                correctAnswer = "Shamol"
            )
        )
        questions.add(
            Question(
                38,
                7,
                "Ta’m bilish sezgisi qaysi axborot manbasi bilan mos keladi?",
                option = listOf("Atir", "Rasm", "Qo’shiq", "Asal"),
                correctAnswer = "Asal"
            )
        )
        questions.add(
            Question(
                39,
                7,
                "Inson e’tibori yo’naltirilgan buyum,hodisa,jarayon,amal,xususiytyoki munosabat………….. deb ataladi.",
                option = listOf("Axborot", "Ma’lumot", "Tushuncha", "Ob’yekt"),
                correctAnswer = "Ob’yekt"
            )
        )
        questions.add(
            Question(
                40,
                7,
                "Axborotning qanday ko’rinish va turlari bor",
                option = listOf(
                    "Qattiq yumshoq",
                    "Asosiy qo’shimcha ",
                    "Tashuvchi saqlovchi",
                    "Rasm,chizma,matn,tovush"
                ),
                correctAnswer = "Rasm,chizma,matn,tovush"
            )
        )
        questions.add(
            Question(
                41,
                7,
                "Axborot qanday xususiyatga ega bo’lishi mumkin?",
                option = listOf(
                    "Rasm,chizma,matn,tovush",
                    "Qattiq yumshoq",
                    "Asosiy qo’shimcha ",
                    "Qimmatli ,to’liq.ishonchli,tushunarli"
                ),
                correctAnswer = "Qimmatli ,to’liq.ishonchli,tushunarli"
            )
        )
        questions.add(
            Question(
                42,
                7,
                "Axborotning shakliga ko’ra qanday turlari mavjud?",
                option = listOf(
                    "Qimmatli ,to’liq.ishonchli,tushunarli",
                    "Rasm,chizma,matn,tovush",
                    "Qattiq yumshoq",
                    "Uzluksiz,analog,uzlukli, diskret"
                ),
                correctAnswer = "Uzluksiz,analog,uzlukli, diskret"
            )
        )
        questions.add(
            Question(
                43,
                7,
                "Axborotlar ustida bajariladigan amallar bilan bog’liq barcha jarayonlar………..deyiladi.",
                option = listOf(
                    "Axborot ob’yektlari",
                    "Axborot shakllari",
                    "Axborot ko’rinishlari",
                    "Axborotli jarayonlar"
                ),
                correctAnswer = "Axborotli jarayonlar"
            )
        )
        questions.add(
            Question(
                44,
                7,
                "Uzlukli turdagi axborot….deyiladi",
                option = listOf("Aralash", "Analogli", "Foydali", "Diskretli"),
                correctAnswer = "Diskretli"
            )
        )
        questions.add(
            Question(
                45,
                8,
                "Yo’lboshlovchi  oynasi interfeysi berilgan qatorni toping? ",
                option = listOf(
                    "uskunalar paneli formulalar satri",
                    "holat satri",
                    "jadval maydoni",
                    "sarlovha  satri menyu satri"
                ),
                correctAnswer = "sarlovha  satri menyu satri"
            )
        )
        questions.add(
            Question(
                46,
                8,
                "Windovs y’lboshlovchisining ishlashiga qanday dastur javob beradi",
                option = listOf("Exel dasturi", "word  dasturi", "master", "explorer exe"),
                correctAnswer = "explorer exe"
            )
        )
        questions.add(
            Question(
                47,
                8,
                "Birinchi elektiron jadval dasturi qanday nom bilan qachon ishlab chiqarilgan?",
                option = listOf("Multipilan 1979", "visi calc", "Master", "Visi Cals  1979"),
                correctAnswer = "Visi Cals  1979"
            )
        )
        questions.add(
            Question(
                48,
                8,
                "Bitta kitobda  nechtagacha varaq  joylashtirish mumkin",
                option = listOf("birdan  3 gacha", "65536 ta", "16084", "Birdan 255gacha"),
                correctAnswer = "Birdan 255gacha"
            )
        )
        questions.add(
            Question(
                49,
                8,
                "Katakcha  bu-",
                option = listOf(
                    "Sonning  afsalyut qiymatini hisoblaydigan",
                    "yacheyka",
                    "Satr va  ustun kesishmasi"
                ),
                correctAnswer = "Satr va  ustun kesishmasi"
            )
        )
        questions.add(
            Question(
                50,
                8,
                "Коренъ bu-",
                option = listOf(
                    "Sonning afsalyut qiymatini  hisoblaydi.",
                    "sonni  darajaga",
                    "sonning kuvadrat ildizini  hisoblaydi"
                ),
                correctAnswer = "sonning kuvadrat ildizini  hisoblaydi"
            )
        )

        questions.add(
            Question(
                51,
                8,
                "Значен bu-",
                option = listOf(
                    "sonlarning   eng  katta qiymatlarini  aniqlaydi",
                    "bir nechta   matni bitta  matnga  o`tkazadi",
                    " matn  ko`rinishdagi  sonni songa o`tkazadi"
                ),
                correctAnswer = " matn  ko`rinishdagi  sonni songa o`tkazadi"
            )
        )
        questions.add(
            Question(
                52,
                8,
                "Formula bu-",
                option = listOf(
                    "yacheyka",
                    "joriy  katakcha",
                    ",,=”  belgisidan  boshlangan  ketma-ketlikdir"
                ),
                correctAnswer = ",,=”  belgisidan  boshlangan  ketma-ketlikdir"
            )
        )
        questions.add(
            Question(
                53,
                8,
                "Diagrammalar  necha  xil  bo`ladi?",
                option = listOf("2 turli", "4 turli", "5 turli", "3 turli"),
                correctAnswer = "3 turli"
            )
        )
        questions.add(
            Question(
                54,
                8,
                "Diagrammlar   ustasiga   murujaat  necha   xil  usul  bilan  amalgam  oshiriladi?",
                option = listOf("5", "4", "2", "3"),
                correctAnswer = "3"
            )
        )
        questions.add(
            Question(
                55,
                9,
                "«Kibernitika»so`zini ma’nosi nima?",
                option = listOf(
                    "Darg`a",
                    "kema boshkaruvchi",
                    "Model",
                    "«Darg`a», «kema boshkaruvchi»"
                ),
                correctAnswer = "«Darg`a», «kema boshkaruvchi»"
            )
        )
        questions.add(
            Question(
                56,
                9,
                "Sezgi a’zolari va maksus asboblar yordamida qabul qilingan ma’lumot kanday",
                option = listOf("Algoritm", "Model", "Sistema", "Axborot"),
                correctAnswer = "Axborot"

            )
        )
        questions.add(
            Question(
                57,
                9,
                "Boshkarish sistemasiga nima kiradi?",
                option = listOf(
                    "Boshkarish  kurilmalari",
                    "Boshkarish obe’kti",
                    "Boshkarish  kurilmalari",
                    "Boshkarish ob’ekti va sub’ekti"
                ),
                correctAnswer = "Boshkarish ob’ekti va sub’ekti"
            )
        )
        questions.add(
            Question(
                58,
                9,
                "Avtomat va odam yordamida boshkarish kanday nomlanadi?",
                option = listOf("Avtomatik", "Tabiiy  sistema", "Model", "Avtomatlashtirilgan"),
                correctAnswer = "Avtomatlashtirilgan"
            )
        )
        questions.add(
            Question(
                59,
                9,
                "Avtomat va odam yordamida boshkarish kanday nomlanadi?",
                option = listOf("Avtomatik", "Tabiiy  sistema", "Model", "Avtomatlashtirilgan"),
                correctAnswer = "Avtomatlashtirilgan"
            )
        )
        questions.add(
            Question(
                60,
                9,
                "Eng kam vakt,eng kam mexnat,xom ashyo sarf kilingan boshkarish……… boshkarish deyiladi",
                option = listOf("model", "Tabiiy", "Avtomatlashtirilgan", "Optimal"),
                correctAnswer = "Optimal"
            )
        )
        questions.add(
            Question(
                61,
                9,
                "Model suzining ma’nosi nima?",
                option = listOf(
                    "Eng    maqbul",
                    "Boshkarish",
                    "Avtomatlashtirilgan",
                    "O’lchov,me’yor"
                ),
                "O’lchov,me’yor"
            )
        )
        questions.add(
            Question(
                62,
                9,
                "O’rganilayotgan ob’ektning  matematik formula shaklida kurinishi   qanday nomlanadi?",
                listOf("Tabiiy", "Abstrak", "Amaliy", "Matematik"),
                "Matematik"
            )
        )
        questions.add(
            Question(
                63,
                9,
                "Matematik model necha boskichda amalga oshiriladi?",
                listOf("5", "4", "6", "3"),
                "3"
            )
        )
        questions.add(
            Question(
                64,
                9,
                "Kompyuterdan kalkulyator sifatida foydalanish kaysi mulokot turiga    kiradi?",
                listOf("oddiy", "aktiv", "interaktiv", "passiv"),
                "passiv"
            )
        )
        questions.add(
            Question(
                65,
                10,
                "Informatika va axborot texnologiyalari darsligining muallifi kim?",
                listOf("Karim Muhammidov", "Avar Bahromov", "Abror Boydedayev", "Norbek Taylaqov"),
                "Norbek Taylaqov"
            )
        )
        questions.add(
            Question(
                66,
                10,
                " MS Excel 2010 elektron jadvalida yangi interfeysi asosidagi tasma so’zi ingliz tilidagi qaysi so’zdan olingan",
                listOf("sorrows", "inter", "inter", "ribbon"),
                "ribbon"
            )
        )
        questions.add(
            Question(
                67,
                10,
                "MS Excel 2010 ning standart varag'i harflar orqali belgilanuvchi nechta ustundan iborat",
                listOf("1048576", "256", "65538", "16348"),
                "16348"
            )
        )
        questions.add(
            Question(
                68,
                10,
                "MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda ###### belgi katakka hosil bo’ladi?",
                listOf(
                    "ma’lumot katakka sig‘magan",
                    "MS Excel formuladagi o‘zgaruvchining nomini aniqlay olmadi",
                    "hisoblash formulasida 0 raqamiga bo‘lish holati mavjud",
                    "formulada mumkin bo‘lmagan ifodalar qatnashmoqda, masalan: kirill shriftida o'zgaruvchilar ishlatilayotgan bo‘lishi mumkin"
                ),
                "ma’lumot katakka sig‘magan"
            )
        )
        questions.add(
            Question(
                69,
                10,
                "  MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda #ДЕЛ/0 - belgi katakka hosil bo’ladi?",
                listOf(
                    "MS Excel formuladagi o‘zgaruvchining nomini aniqlay olmadi",
                    " formulada mumkin bo‘lmagan ifodalar qatnashmoqda, masalan: kirill shriftida o'zgaruvchilar ishlatilayotgan bo‘lishi mumkin",
                    "ma’lumot katakka sig‘magan",
                    "Hisoblash  formulasida 0 raqamiga bo‘lish holati mavjud"
                ),
                "Hisoblash  formulasida 0 raqamiga bo‘lish holati mavjud"
            )
        )
        questions.add(
            Question(
                70,
                10,
                "MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda #3HA4!- belgi katakka hosil bo’ladi?",
                listOf(
                    " Hisoblash  formulasida 0 raqamiga bo‘lish holati mavjud",
                    "MS Excel formuladagi o‘zgaruvchining nomini aniqlay olmadi",
                    "  ma’lumot   katakka sig‘magan",
                    "Hisoblash  formulasida 0 raqamiga bo‘lish holati mavjud, formulada mumkin bo‘lmagan ifodalar qatnashmoqda, masalan: kirill shriftida o'zgaruvchilar ishlatilayotgan bo‘lishi mumkin"
                ),
                "Hisoblash  formulasida 0 raqamiga bo‘lish holati mavjud, formulada mumkin bo‘lmagan ifodalar qatnashmoqda, masalan: kirill shriftida o'zgaruvchilar ishlatilayotgan bo‘lishi mumkin"
            )
        )
        questions.add(
            Question(
                71,
                10,
                "MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda #ИМЯ? belgi katakka hosil bo’ladi?",
                listOf(
                    " formulada mumkin bo‘lmagan ifodalar qatnashmoqda, masalan: kirill shriftida o'zgaruvchilar ishlatilayotgan bo‘lishi mumkin",
                    "hisoblash formulasida 0 raqamiga bo‘lish holati mavjud",
                    "ma’lumot katakka sig‘magan",
                    "MS Excel formuladagi o‘zgaruvchining nomini aniqlay olmadi"
                ),
                "MS Excel formuladagi o‘zgaruvchining nomini aniqlay olmadi"
            )
        )
        questions.add(
            Question(
                72,
                10,
                " MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda #ЧИСЛО!   belgi   katakka hosil bo’ladi,",
                listOf(
                    "katakka noto‘g‘ri murojaat qilingan",
                    "katakka noto‘g‘ri oraliqda qiymat kiritilgan",
                    "hisoblash formulasida 0 raqamiga bo‘lish holati mavjud",
                    "formulada funksiya o'zgaruvchisi yoki qiymat noto’g’ri ishlatilmoqda"
                ),
                "formulada funksiya o'zgaruvchisi yoki qiymat noto’g’ri ishlatilmoqda"
            )
        )
        questions.add(
            Question(
                73,
                10,
                "MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda #ССЫЛКА! belgi katakka hosil bo’ladi?",
                listOf(
                    "formulada funksiya o'zgaruvchisi yoki qiymat noto’g’ri ishlatilmoqda",
                    "formu katakka noto‘g‘ri oraliqda qiymat kiritilgan",
                    "hisoblash formulasida 0 raqamiga bo‘lish holati mavjud",
                    "katakka noto‘g‘ri murojaat qilingan"
                ),
                "katakka noto‘g‘ri murojaat qilingan"
            )
        )
        questions.add(
            Question(
                74,
                10,
                " MS Excel 2010 da ishlash jaroyonida qanday xatolik yuzaga kelganda #ПУСТО! belgi katakka hosil bo’ladi?",
                listOf(
                    " formulada funksiya o'zgaruvchisi yoki qiymat noto’g’ri ishlatilmoqda",
                    "katakka noto‘g‘ri murojaat qilingan",
                    "hisoblash formulasida 0 raqamiga bo‘lish holati mavjud",
                    "Katakka    noto‘g‘ri oraliqda qiymat kiritilgan"
                ),
                "Katakka    noto‘g‘ri oraliqda qiymat kiritilgan"
            )
        )
        questions.add(
            Question(
                75,
                11,
                "Kompyuter ekranida paydo bo’ladigan tasvirlar  qaysi qurilma yordamida yaratiladi",
                listOf("Monitor", "Videoprotsessor", "Displey", "Video karta"),
                "Video karta"
            )
        )
        questions.add(
            Question(
                76,
                11,
                "Minitor so’zining ma’nosini  tiping",
                listOf(
                    "Tasvilamoq",
                    "Grafik qurilma",
                    "Ekran",
                    "Minitor so’zining ma’nosini  tiping"
                ),
                "Minitor so’zining ma’nosini  tiping"
            )
        )
        questions.add(
            Question(
                77,
                11,
                "Displey ekranidagi satrlar  va  ustunlar  kesishgan joy qanday ataladi?",
                listOf("Yacheyka", "Vector", "To’g’ri javob yo’q", "Piksel"),
                "Piksel"
            )
        )
        questions.add(
            Question(
                78,
                11,
                "Asosiy ranglar ko’rsatilgan  qatorni toping.",
                listOf(
                    "Qizil sariq ko’k",
                    "Ko’k, sariq, yashil",
                    "Qizil, sariq, yashil",
                    "Qizil, yashil, ko’k"
                ),
                "Qizil, yashil, ko’k"
            )
        )
        questions.add(
            Question(
                79,
                11,
                "Kompyuter grafikasi  nimaning tasvirini yaratishga qarab necha turga bo’linadi?",
                listOf("4", "2", "5", "3"),
                "3"
            )
        )
        questions.add(
            Question(
                80,
                11,
                "Yaratish  usuliga ko’ra kompyuter grafikasi necha  turga bo’linadi va qaysilar?",
                listOf("2 ga 3D va 4D", "3 ga 2D, 3D va 4D", "To’g’ri javob yo’q", "2 ga 2D va 3D"),
                "2 ga 2D va 3D"
            )
        )
        questions.add(
            Question(
                81,
                11,
                "Qog’ozga chop etiladigan xujjatlar qaysi guruhga mansub",
                listOf("3D", "4D", "5D", "2D"),
                "2D"
            )
        )
        questions.add(
            Question(
                82,
                11,
                "Virtual so’zining ma]nosi qanday?",
                listOf("Hayotiy", "Kelajak", "Real", "Xayoliy"),
                "Xayoliy"
            )
        )
        questions.add(
            Question(
                83,
                11,
                "Ikki o’lchamli kompyuter grafikasi necha turga bilinadi?",
                listOf("2", "4", "5", "3"),
                "3"
            )
        )
        questions.add(
            Question(
                84,
                11,
                "Lotin tilidan kirib kelgan bo’lib” xaskash, omoch” degan ma’noni anglatuvchi so’z  qaysi?",
                listOf("Vector", "Fractal", "Piksel", "rastr"),
                "rastr"
            )
        )
        return questions
    }
}