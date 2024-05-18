package uz.datalife.compyutersavvy.data

object Sources {
    private val lectures: MutableList<Lecture> by lazy { mutableListOf() }

    fun fillLecture() {
        lectures.apply {
            add(
                Lecture(
                    0,
                    "Matnli hujjat bilan ishlashni boshlash",
                    "Matnli hujjat bilan ishlashni boshlash\n\nMatn bilan ishlash, bu matn yozish yoki hujjatdagi matnni oʻzgartirish orqali" +
                            "elektron hujjatlar yaratish jarayonidir. Matn bilan ishlash oʻrganish kerak boʻlgan" +
                            "juda kerakli ko‘nikma hisoblanadi." +
                            "Ushbu ko‘nikmadan maktab vazifalarini bajarishdan boshlab, orzuingizdagi kasb" +
                            "egasi bo‘lgunga qadar ko‘plab maqsadlarda foydalanasiz." +
                            "Matn bilan ishlash ko‘nikmasidan asosan elektron hujjatlarni email yoki boshqa" +
                            "elektron aloqa vositalari orqali boshqalarga yuborish jarayonida foydalaniladi." +
                            "Shuningdek, bu ko‘nikmalarga ega boʻlish, ushbu hujjat nusxasini xohlagan" +
                            "vaqtingizda oʻzgartira olishingiz uchun saqlay olishingizni anglatadi." +
                            "Microsoft Word – ushbu modulda foydalaniladigan matn bilan ishlash dasturi" +
                            "hisoblanadi. Matn bilan ishlovchi boshqa dasturlar ham mavjud, ularning ixtiyoriy" +
                            "turlaridan foydalanishingiz mumkin. Ushbu dasturlarda juda ko‘p oʻxshash" +
                            "tugmalar va ikonkalar bor. Kompyuterdan foydalanish vaqtida xavfsizlik yo‘riqnomalariga rioya" +
                            "qilishingiz kerak. Undan foydalanayotganingizda yoningizda biror yegulik" +
                            "yoki ichimlik boʻlmasligi kerak. Ichimlikni kompyuterga osongina toʻkib" +
                            "yuborishingiz natijasida elektr toki urishi mumkin." +
                            "Shuningdek, yegulikni klaviaturaga tushirib yuborishingiz va bu tugmalar" +
                            "orasiga kirishi hamda ularning ishini toʻxtatib qoʻyishi mumkin." +
                            "Kompyuteringizga ulanadigan simlarga hech qachon tegmasligingiz" +
                            "kerak. Agar kompyuterda biror muammo paydo boʻlsa, bu haqida doim" +
                            "oʻqituvchingizga aytishingiz zarur.Matnli hujjat bilan ishlashni boshlash",
                    5
                )
            )
            add(
                Lecture(
                    1, "Tasvirlar bilan ishlashni boshlash",
                    "Tasvirlar bilan ishlashni boshlash\n\nKirish\n" +
                            "Tasvirlar yaratish va ularni tahrirlash juda qiziq mashg‘ulot hisoblanadi. Ushbu" +
                            "ko‘nikma sizga boshqalar tomonidan yaratilgan tasvirlardan foydalanib chizishni" +
                            "emas, balki oʻzingiz xohlagandek o‘z tasvirlaringizni yaratish imkoniyatini beradi." +
                            "Ko‘nikmalaringizni ishga solgan holda yaratgan tasviringizni tomosha qilish" +
                            "zavqlanish his-tuyg‘usini hosil qiladi.Bu modulda dasturiy taʼminot sifatida Microsoft Paintdan foydalanishingiz" +
                            "mumkin. Bu grafik materiallar yaratish va tahrirlash uchun foydalaniladigan" +
                            "dasturiy taʼminot. Ushbu dasturda tasvirlar yaratishda yordam beruvchi juda" +
                            "koʻplab uskunalar mavjud." +
                            "Tasvir bilan ishlovchi turli boshqa dasturiy taʼminotlar ham bor, ularning ixtiyoriy" +
                            "turlaridan foydalanishingiz mumkin. Ushbu dastur interfeyslarida bir-biriga" +
                            "o‘xshash tugmalar, ikonkalar va uskunalar mavjud.Toʻgʻri chiziq chizish uchun toʻgʻri chiziq uskunasidan foydalanishingiz kerak.\n" +
                            "Toʻgʻri chiziq chizishni o‘rganib olsangiz, tasviringiz uchun koʻplab ajoyib shakllar" +
                            "yaratishingiz mumkin." +
                            "Agar chizga chiziq yoki shaklingiz yoqmasa, oxirgi qilgan amalingizni bekor qilish" +
                            "vositasi yordamida olib tashlashingiz mumkin. Undo tugmasini bossangiz, oxirgi" +
                            "chizgan chiziqni yoki bajargan ishingizni ortga qaytaradi." +
                            "Undo tugmasini bosishda davom etsangiz, oxirgi qilgan amallaringiz birin-ketin" +
                            "siz bajargan tartibda ortga qaytadi.Toʻgʻri chiziq chizish uchun Line uskunasini faollashtiring." +
                            "Sichqoncha koʻrsatkichini kanvasga, chiziq chizishni boshlamoqchi boʻlgan" +
                            "joyingizga joylashtiring." +
                            "Chiziq chizishni boshlash uchun sichqonchaning chap tugmasini bosib ushlab" +
                            "turing." +
                            "Sichqonchani kanvas bo‘ylab chiziq chizmoqchi boʻlgan tomonga" +
                            "harakatlantiring." +
                            "Chiziqni yakunlamoqchi boʻlgan joyingizda sichqonchaning tugmasini qoʻyib" +
                            "yuboring. Endi kanvasda chizilgan chiziqni koʻrishingiz mumkin." +
                            "Toʻgʻri chiziqlar singari egri chiziqlar ham chizishingiz mumkin. Curved line" +
                            "uskunasi uskunalar panelida Line uskunasidan so‘ng joylashgan.", 5
                )
            )
            add(
                Lecture(
                    2,
                    "Diagrammalar bilan ishlashni boshlash",
                    "Diagrammalar bilan ishlashni boshlash\n\n" +
                            "Bu modulda maʼlumotlar bilan ishlash ko‘nikmalaringizni rivojlantiribgina" +
                            "qolmay, balki Microsoft Excel deb ataluvchi dasturdan foydalanib maʼlumotlarni" +
                            "jamlash va ular yordamida diagramma, grafik yasashni oʻrganib borasiz. Yakuniy" +
                            "loyihada o‘rgangan ko‘nikmalaringizdan foydalanib, doʻstlaringiz qiziqishi haqidagi" +
                            "maʼlumotni jamlagan grafik yaratasiz.\n" +
                            "Shuningdek, quyidagilarni ham bilib olasiz:\n" +
                            "• maʼlumotlarni guruhlarga ajratish (tasniflash);" +
                            "• grafik yoki diagramma yaratish;\n" +
                            "• grafik yoki diagrammani formatlash;\n" +
                            "• grafik yoki diagrammaga oʻq belgisini qoʻshish;\n" +
                            "• grafik yoki diagrammadan xulosalar chiqarish.\n" +
                            "Boshlashingizdan avval\n" +
                            "Quyidagilarni bilishingiz kerak:\n" +
                            "• maʼlumotlarni kiritish uchun klaviaturadan hamda variantlardan birini tanlash" +
                            "uchun sichqonchadan (yoki sensorli ekrandan) foydalana olishingiz kerak;\n" +
                            "• maʼlumotlar jadvalining nomi (sarlavhasi) mavjud ekanligini;\n" +
                            "• jadvalda foydalanilayotgan maʼlumotlar sarlavhalar boʻyicha tartiblangan" +
                            "ekanligini.\n" +
                            "Kirish\n" +
                            "Diagramma – raqamli axborotni namoyish etuvchi grafik (turli qiymatlarni\n" +
                            "tasvirlovchi axborot) bo‘lib, uning koʻplab turlari mavjud.\n" +
                            "Keyingi sahifaning yuqori qismida joylashgan ustunli diagrammada eng baland\n" +
                            "ko‘rsatkich yashil ustun bo‘lib, bu uning ko‘rsatkichi eng katta ekanini bildiradi.\n" +
                            "Ustunli diagrammaning quyi qismida doiraviy diagramma joylashgan, unda eng\n" +
                            "kattasi yashil boʻlak hisoblanib, bu uning ko‘rsatkichi eng katta ekanini bildiradi.",
                    5
                )
            )

            add(
                Lecture(
                    3, "Dasturlashni boshlash", "Dasturlashni boshlash\n" +
                            "Bu modulda yakuniy loyiha tayyorlash uchun dasturlash ko‘nikmalaringizni" +
                            "rivojlantirasiz. Bu loyiha Scratch dasturi imkoniyatlaridan foydalanib Clip Clop" +
                            "nomli otning hayvonot bogʻiga tashrif buyurish hamda barcha hayvonlarni koʻrish" +
                            "vazifasidan iborat.\n" +
                            "Shuningdek, quyidagilarni ham bilib olasiz:\n" +
                            "• algoritm nima ekanligi, uni tuzish va tuzatish(sozlash);\n" +
                            "• koʻrsatmalar ketma-ketligi berilganida Sprayt qanday harakatlarni amalga" +
                            "oshirishini bashorat qilish;\n" +
                            "• Scratch dasturida Spraytni harakatlantira olish;\n" +
                            "• Scratch dasturida Spraytni aylantira olish.\n Labirint boʻylab yurish uchun koʻrsatmalar yozib chiqdingiz. Endi uni bajarish\n" +
                            "uchun Scratch yordamida kompyuter dasturi yozishingiz mumkin." +
                            "Scratch dasturi Spraytlarni boshqarish imkonini beruvchi dasturdir." +
                            "Dastur kodi yordamida Spraytni harakatga keltirishingiz mumkin.Agar topshiriqni xato bajarsangiz yoki yana boshidan boshlamoqchi bo‘lsangiz," +
                            "Sprayt obyektini xohlagan joyingizga olib boring, keyin ko‘rsatilgan" +
                            "kod blokini yarating." +
                            "“Yashil bayroq”ni tanlaganingiz dastur" +
                            "kodi ishga tushishini anglatadi. “Point in" +
                            "direction 90” bloki Sprayt yuzini oʻng tomonga" +
                            "buradi." + "Yakuniy loyiha – “Taq-tuq” ismli ot\n" +
                            "Oʻqituvchingiz sizga bergan “Zoo.sb2” faylini oching.\n" +
                            "Taq-tuq ismli ot hayvonot bogʻiga keldi va bu yerdagi barcha hayvoniarni\n" +
                            "koʻrmoqchi. U harakatlanishni oq quti ichida boshlaydi.\n" +
                            "U faqat qizil doiralarga tegib turgandagina hayvonlarni ko‘ra oladi. Taq-tuq birinchi\n" +
                            "bo‘lib yoʻlbarslarni ko‘rmoqchi.\n" + "Butunjahon internet tarmog‘i (WWW) qiziqarli va koʻngilochar sahifalarga\n" +
                            "boydir. Shuningdek, undan foydalnish jarayonida ayrim xavflarga duch\n" +
                            "kelishingiz mumkin. Internetdan foydalanayotganda bu xavflarni oldindan bila\n" +
                            "olishingiz va oʻzingizning xavfsizligingizni taʼminlashingiz kerak. Bu elektron\n" +
                            "xavfsizlik (e-safety) deyiladi.\n" +
                            "Axborot topish uchun qidiruv tizimlaridan foydalanganda tahqirli yoki\n" +
                            "noqonuniy (qonunga zid) axborotlar paydo bo‘lishi mumkin. Bu maʼlumotlarga\n" +
                            "diqqatingizni qaratmasligingiz kerak. Zararli maʼlumotlarga duch kelmaslik\n" +
                            "uchun quyidagi koʻrsatmalarga amal qiling:\n" +
                            "Qidiruv soʻzlarini ehtiyotkorlik bilan tanlang. Yetarli maʼlumot bermaydigan\n" +
                            "har qanday xato yoki umumiy qidiruv soʻzlari sizga foydasiz yoki zararli\n" +
                            "bo‘lishi mumkin bo‘lgan natijalarni berishi mumkin.\n" +
                            "• Veb-sahifani ochish jarayonida unda zararli maʼlumotlar boʻlishi mumkinligi\n" +
                            "haqida ogohlantirishlarga eʼtibor bering.\n" +
                            "• Barcha qidiruv natijalari ishonchli boʻlmasligini unutmang. Faqat mashhur\n" +
                            "va ishonchli saytlarning havolalariga kiring.\n" +
                            "• Qidiruvning birinchi natijalari hamisha ham eng yaxshisi boʻlmasligi\n" +
                            "mumkinligini yodda tuting. Ayrim kompaniyalar qidiruv natijalarida yuqori\n" +
                            "o‘rinlarda bo‘lishlari uchun pul toʻlashadi. Bunday natijalar yonida Ad yoki\n" +
                            "Sponsored degan yozuvi boʻladi.\n" +
                            "•\n" +
                            "Internetdan foydalanganda xavfsizligingizga qattiq e’tibor bering. Qidiruv\n" +
                            "natijalari havolasini tanlaganingizda ehtiyot boʻlishingiz kerak. Hosil qilingan\n" +
                            "natijalarni aql bilan tanlang!\n" +
                            "Zararli maʼlumot mavjud sahifani topsangiz, darhol oʻqituvchingizga ayting.\n" +
                            "Shunda muammoga duch kelmaysiz.", 5
                )
            )
            add(
                Lecture(
                    4, "Qidiruv tizimlarida ishlashni boshlash", "Kirish\n" +
                            "Qidiruv tizimidan qanchalik yaxshi foydalana olasiz?\n" +
                            "Butunjahon internet tarmog‘idan (WWW) maʼlumotlar qidirish, yangi va qiziqarli" +
                            "mavzular haqida bilib olish juda qiziqarli mashg‘ulot hisoblanadi." + "Vazifalaringizni yakunlash uchun kerak boʻladigan axborotlarni tez va oson\n" +
                            "topishingiz mumkin.Butunjahon internet tarmog‘ida (WWW) axborot qidirish uchun sizga 2 ta dasturiy" +
                            "vosita kerak boʻladi: veb-brauzer va qidiruv tizimi." +
                            "Qidiruv tizimidan samarali foydalana olish va kerakli maʼlumot uchun eng yaxshi" +
                            "qidiruv natijalarini tanlay bilish juda muhim ko‘nikmadir." + "Veb-brauzerlar\n" +
                            "Veb-brauzer–butunjahon internet tarmog‘ida joylashgan veb-sahifalarni\n" +
                            "koʻrsatuvchi dasturiy taʼminot.\n" +
                            "Veb-sahifalar internetga gipermatnli belgilash tili (HTML) kabi kompyuter tilida\n" +
                            "yuboriladi. Veb-brauzer uni siz oʻqiy oladigan tilga tarjima qilb beradi.\n" +
                            "Mashhur veb-brauzerlarga quyidagilar kiradi:\n" +
                            "Google Chrome\n" +
                            "Safari\n" +
                            "Microsoft Edge\n" +
                            "Firefox.\n" +
                            "Har bir veb-brauzerda foydalanishingiz mumkin boʻlgan toʻrtta asosiy qism bor.\n" +
                            "Ular quyidagilar:\n" +
                            "Manzil paneli\n" +
                            "• Oldinga tugmasi\n" +
                            "• Ortga tugmasi\n" +
                            "• Yangilash tugmasi\n" + "Ortga tugmasi qaytish lozim boʻlgan har qanday veb-sahifaga oʻtish imkonini" +
                            "beradi." +
                            "Veb-sahifaga qaytish uchun Ortga tugmasidan foydalangan boʻlsangiz," +
                            "Oldinga tugmasi bilan hozirgina kirgan veb-sahifangizga oʻtish mumkin." +
                            "Yangilash tugmasi sahifani qayta yuklash imkonini beradi. Sahifa toʻliq" +
                            "yuklanmay qolganida foyda beradi. Saytda oʻzgargan va yangilangan" +
                            "maʼlumot boʻlsa ham, ushbu tugmadan foydalanish kerak. Yangilash" +
                            "tugmasidan foydalanganda, u siz joylashgan veb-sahifani qayta yuklaydi va" +
                            "yangilanganini koʻrsatadi." +
                            "Manzil paneli – siz kirishni xohlagan veb-sayt manzili yoziladigan maydon." +
                            "Har bir veb-saytning oʻz takrorlanmaydigan nomi bor. Masalan: NASA uchun" +
                            "veb manzil: www.nasa.gov. Uni “www” deb yozmasdan (yozishga oson boʻlishi" +
                            "uchun) qisqartirish mumkin.", 5
                )
            )
            add(
                Lecture(
                    5,
                    "Hujjatga qayta ishlov berish",
                    "Bu modulda siz yakuniy loyihangizda ishlashga yordam beradigan koʻplab qiziqarli" +
                            "koʻnikmalarni rivojlantirasiz. Ularning aksariyati sizga turli xil auditoriyalarga mos" +
                            "keladigan matnlarni har xil usulda tahrirlash va takomillashtirishni oʻrganishga" +
                            "yordam beradi." +
                            "Yakuniy loyihangiz sogʻlom ovqatlanish haqida maqolani yozib tugatish boʻladi." +
                            "Biroz tadqiqot oʻtkazib bir nechta mavzuga mos matn hamda rasmlarni tanlaysiz." +
                            "Xulosalaringizni ikki guruh odamlari uchun yozish kerak boʻladi: maktabingiz" +
                            "oʻquvchilari hamda ota-onalar va vasiylar." +
                            "Shuningdek, quyidagilarni bilib olasiz:" +
                            "hujjatga hoshiya joylash;" +
                            "rasmga hoshiya qoʻshish;" +
                            "rasmni aylantirish;" +
                            "hujjatga SmartArt qoʻshish.\n" + "Boshlashdan avval\n" + "Quyidagilarni bajara olishingiz kerak:\n" +
                            "• klaviatura yordamida hujjatga soʻz va jumlalar kiritishni;\n" +
                            "• klaviaturada harflar, raqamlar, tinish belgilari, SHIFT, CAPS LOCK, BACKSPACE\n" +
                            "va ENTER kabi tugmalardan foydalanishni;\n" +
                            "• siz kiritgan soʻzlarni tanlab olish va ularga oʻzgartirish kiritishni;\n" +
                            "• sichqoncha yordamida Save, Print va Spelling & Grammar checker kabi\n" +
                            "oddiy buyruqlardan foydalana olishni;\n" +
                            "• matnda imlo xatolar mavjudligini tekshirish uchun imlo tekshiruvidan\n" +
                            "foydalanish tartibini;\n" +
                            "• oʻzingiz yaratgan hujjat uchun mos nomni tanlashni;\n" +
                            "• hujjat xatolarini tuzatishni.\n" + "Kirish\n" +
                            "Hujjat yaratish va matn kiritish koʻnikmalari juda muhimdir. Bu koʻnikmalarga ega\n" +
                            "boʻlsangiz, ma’lumotga boy, aniq va e’tiborni tortadigan asar yarata olasiz.\n" +
                            "Hujjat yaratishda oʻylash kerak boʻlgan muhim narsalardan biri, bu – sizning\n" +
                            "auditoriyangiz. Bu modulda siz hujjatlarni yaratish va ularni turli auditoriyalarga\n" +
                            "moslashtirish uchun oʻzgartirishni oʻrganasiz.",
                    6
                )
            )

            add(
                Lecture(
                    6, "Tasvirga qayta ishlov berish",
                    "Bu modulda quyidagilarni oʻrganasiz:\n" +
                            "1Shtamp uskunasi kabi nusxa koʻchirish uskunalaridan foydalangan holda\n" +
                            "takroriy naqshlarni yaratish\n" +
                            "2Turli xil uskunalar va effektlardan foydalangan holda tasvirlar yaratish\n" +
                            "3Tasvirning kerakli qismlarini tanlash, nusxa olish va uning oʻlchamlarini\n" +
                            "oʻzgartirish\n" +
                            "4Tasvir dizaynining shakllanish bosqichini koʻrsatuvchi qoralamalarni\n" +
                            "saqlash\n" + "Bu modulda barcha uchun sevimli kitobingiz haqida hikoya qiluvchi qiziqarli" +
                            "tasvirni hosil qilish mavzusidagi yakuniy loyihangizni bajarishga yordam beradigan" +
                            "koʻnikmalarni rivojlantirasiz." +
                            "Kitoblar qiziqarli, koʻngilochar, ajoyib va juda ma’lumotga boy boʻlishi mumkin." +
                            "Siz oʻrganadigan ba’zi yangi koʻnikmalar orqali ijodingizni kitob tasvirini hosil" +
                            "qilish orqali namoyish etishingiz mumkin. Ushbu koʻnikmalar sizga tasvirni burish," +
                            "aylantirish va oʻlchamlarini oʻzgartirish orqali tahrirlashga yordam beradi." +
                            "Moʻyqalam uskunasini ishlatish, shuningdek, juda koʻp turli xil uskunalar va" +
                            "effektlardan foydalangan holda tasvir yaratish mumkinligini koʻrsatadi. Shu" +
                            "bilan birga, tasvirlarni yaratishda versiya nazorati va undan nima maqsadda" +
                            "foydalanishni bilib olasiz.\n" + "Kirish\n" +
                            "San’at asarlari va tasvirlarni yaratish hamda ularni tahrirlashda kompyuterlardan" +
                            "foydalanish qiziqarli va ijodiy qobiliyatlardan hisoblanadi." +
                            "Raqamli san’at asarlari va tasvirlarni yaratish uchun kompyuterlardan 50 yildan" +
                            "ortiq vaqt davomida foydalanib kelinmoqda." +
                            "Zamonaviy raqamli san’at asarlari juda murakkab boʻladi va tasvirlarni yaratish" +
                            "uchun katta mahorat talab etadi. Keyingi sahifadagi ajoyib raqamli tasvirga" +
                            "qarang. Garchi siz bu modulda ancha sodda narsalarni yaratishni oʻrgansangiz" +
                            "ham, keyinchalik katta sinflarda o‘qish davomida, shunday tasvirlarni yaratishingiz" +
                            "mumkin. Hamma ham nimadandir boshlashi kerak!" +
                            "Bu modulda siz tasvir yaratish va tahrirlash uchun Microsoft Paint dasturidan" +
                            "foydalanasiz. Microsoft Paint – foydalanish uchun sodda dasturiy ta’minot" +
                            "bo‘lib, u juda ko’p turli xil vositalarga ega, bu sizga tasvirlar bilan ishlashda" +
                            "juda kreativ va ijodkor boʻlishga imkon beradi (Oʻqituvchingiz dasturni maktab" +
                            "kompyuterining qayeridan topish hamda yangi faylni qanday yaratishni koʻrsatib" +
                            "beradi). Endilikda siz tasvirlarni aylantirish, burish va oʻlchamlarini oʻzgartirish" +
                            "koʻnikmalaridan foydalangan holda yangi tasvirlar yaratib, ulardan zavqlanasiz." +
                            "Buning uchun avval Select uskunasi yordamida tasvirlarni qanday belgilab olishni" +
                            "bilishingiz kerak. Toʻrtburchak shaklda belgilash uskunasi yordamida tasvirni yoki" +
                            "uning bir qismini belgilab olish mumkin. Shuningdek, erkin shaklda belgilash" +
                            "uskunasi yordamida ham tasvir yoki uning qismini belgilash mumkin", 6
                )
            )
            add(
                Lecture(
                    7,
                    "Elektron jadvalga qayta ishlov berish",
                    "Bu modulda yakuniy loyiha sari intilishda yordam beradigan koʻnikmalarni" +
                            "rivojlantirasiz. Ushbu loyiha Techno kompyuter muzeyiga maktab tomonidan" +
                            "sayohat uyushtirish haqida boʻladi. Maktab tomonidan sayohat uyushtirishda" +
                            "juda koʻp narsalarga ahamiyat qilish kerak! Siz oʻqituvchilaringizga elektron jadval" +
                            "yordamida barcha tafsilotlarni rejalashtirishda yordam berasiz." + "Shuningdek, quyidagilarni bilib olasiz:" +
                            "• oʻquvchilarni maktab tomonidan sayohat tashkil etishga ketadigan xarajatlarini" +
                            "hisoblash uchun elektron jadval yaratish" +
                            "• har bir oʻquvchi sayohat uchun qancha mablag‘ sarflashi kerakligini aniqlash" +
                            "uchun formulalar kiritish va funksiyalardan foydalanish" +
                            "• grafik va diagrammalar yasash hamda “agar” so‘zi bilan boshlanadigan" +
                            "savollarga javob berish, masalan “Agar murabbiyning xarajati oshsa nima" +
                            "boʻladi?” kabi." +
                            "• AVERAGE, MIN va MAX funksiyalaridan foydalanish.\n" + "Kirish\n" +
                            "Elektron jadval - matn va raqamlarni kiritish hamda formulalar yordamida" +
                            "hisob-kitoblarni amalga oshirishga imkon beradigan jadvaldan tashkil topgan" +
                            "dasturiy ta’minot. Bundan tashqari, undan grafik va diagrammalar tuzishda" +
                            "foydalanish mumkin. Elektron jadvallar butun dunyoda odamlar va kompaniyalar tomonidan" +
                            "ma’lumotlarni saqlash va ular ustida hisob-kitoblarni amalga oshirish uchun," +
                            "masalan, qancha daromad qilgan, qancha harajat qilganlarini hisob-kitob qilish" +
                            "uchun foydalaniladi." +
                            "Oʻqituvchingiz elektron jadvallardan foydalanib maktab tomonidan" +
                            "uyushtiriladigan sayohatga qancha harajat boʻlishini (murabbiy yollash, chipta," +
                            "tushlik) aniqlab berishi mumkin. Natijada har bir o‘quvchi uchun sayohat uchun" +
                            "sarf-xarajat miqdori kelib chiqadi.Ushbu modulda foydalaniladigan elektron jadval Microsoft Excel dasturidir, ammo" +
                            "Numbers va Google Sheets kabi foydalanish mumkin boʻlgan koʻplab boshqa" +
                            "dasturlar ham mavjud",
                    6
                )
            )
            add(
                Lecture(
                    7,
                    "Matnli hujjatdan maqsadli foydalanish",
                    "Ushbu modulda oʻzingizning yakuniy loyihangizda yordam beradigan aniq maqsadlar uchun" +
                            "hujjatlar yaratish boʻyicha koʻnikmalaringizni rivojlantirasiz. Loyihaning maqsadi maktabning" +
                            "internetdan foydalanishga oid qoʻllanmasining koʻrinishini yaxshilashdir. Qoʻllanma maktabdagi" +
                            "internet orqali tashkil etiladigan tadbirlardan birida foydalaniladi. Shuning uchun uni yaxshi" +
                            "ko‘rinishda taqdim etish kerak." +
                            "Buni amalga oshirish uchun aniq va yaxshi dizaynga ega hujjatlarni yaratishda foydalaniladigan" +
                            "zamonaviy formatlash usullari kerak. Modul orqali siz hujjatni auditoriyangiz uchun yanada" +
                            "jozibali taqdim etish uchun siz ham matnni, ham sahifani formatlashni oʻrganib olasiz. Bunday" +
                            "formatlashga hujjat ichiga jadvallar va belgili ro‘yxatlarni joylashtirish kiradi." +
                            "Shuningdek, quyidagilarni ham bilib olasiz:" +
                            "•• topish va almashtirish uskunalaridan foydalanish;\n" +
                            "•• hujjatga giperhavolalar qoʻshish;\n" +
                            "•• hujjatga muqova (cover page) qoʻshish.\n Kirish\n" +
                            "Rasmiy ko‘rinishdagi hujjatni yaratish muhim va oʻta foydali ko‘nikmadir. Matnli formatlarni" +
                            "samarali yaratishni o‘rganish katta tajriba va ko‘p mehnatni talab etadi. Masalan, hujjatning" +
                            "kerakli qismiga tasvirni joylashtirish yoki bo‘sh maydonlardan maqsadli foydalanish jarayoni" +
                            "bilim va tajribaga tayanadi. Agar siz rasmiy koʻrinishda hujjat yarata olsangiz, o‘qituvchingiz va" +
                            "hatto kelajakda ish beruvchilarda ham katta taassurot qoldirishingiz mumkin. Buning uchun" +
                            "hujjatingizni tayyorlashda ahamiyatli va diqqatli bo‘lishingiz, hujjatga mos uslub va maketni" +
                            "topishingiz uchun, turli matn uslubi va tasvirlardan foydalanib ko‘rishingiz kerak boʻladi. Siz" +
                            "tanlagan uslub va maket auditoriyaga, shuningdek, hujjatning maqsadiga bevosita bogʻliq bo‘lishi" +
                            "lozim.",
                    7
                )
            )

        }
    }

    fun getLectureList(): MutableList<Lecture> = lectures
}