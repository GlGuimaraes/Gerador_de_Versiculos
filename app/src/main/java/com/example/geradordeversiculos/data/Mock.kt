package com.example.geradordeversiculos.data

import com.example.geradordeversiculos.infra.VerseConstants
import kotlin.random.Random

class Phrase(val description: String, val categoryId: Int, val lang: String)

class Mock {

    private val fortification = VerseConstants.FILTER.FORTIFICATION
    private val gratitude = VerseConstants.FILTER.GRATITUDE
    private val hope = VerseConstants.FILTER.HOPE
    private val wisdom = VerseConstants.FILTER.WISDOM
    private val courage = VerseConstants.FILTER.COURAGE
    private val humility = VerseConstants.FILTER.HUMILITY

    private val pt = VerseConstants.LANGUEGE.PORTUGUESE
    private val en = VerseConstants.LANGUEGE.ENGLISH


    val mListPhrase = listOf(

        Phrase("Posso todas as coisas naquele que me fortalece. Filipenses 4:13", fortification, pt),
        Phrase("Deus é o nosso refúgio e fortaleza, socorro bem presente na angústia. Salmos 46:1", fortification, pt),
        Phrase("O Deus que me reveste de força e torna perfeito o meu caminho. Salmos 18:32", fortification, pt),
        Phrase("Porque Deus não nos deu espírito de covardia, mas de poder, de amor e de moderação. 2 Timóteo 1:7", fortification, pt),
        Phrase("Não to mandei eu? Seja forte e corajoso! não temas, nem te espantes, porque o Senhor, teu Deus, é contigo por onde quer que andares. Josué 1:9", fortification, pt),
        Phrase("Mas os que esperam no Senhor renovarão as suas forças, subirão com asas como águias, correrão e não se cansarão, caminharão e não se fatigarão. Isaías 40:31", fortification, pt),
        Phrase("O Senhor é a minha força e o meu escudo; nele confiou o meu coração, e fui socorrido; pelo que o meu coração salta de prazer, e com o meu cântico o louvarei. Salmos 28:7" , fortification, pt),
        Phrase("No demais, irmãos meus, fortalecei-vos no Senhor e na força do seu poder. Efésios 6:10", fortification, pt),
        Phrase("E o Deus de toda a graça, que em Cristo Jesus vos chamou à sua eterna glória, depois de haverdes sofrido por um pouco, ele mesmo vos aperfeiçoará, confirmará, fortificará e fortalecerá. 1 Pedro 5:10", fortification, pt),
        Phrase("A minha carne e o meu coração desfalecem; mas Deus é a fortaleza do meu coração e a minha porção para sempre. Salmos 73:26", fortification, pt),
        Phrase("Dá vigor ao cansado e multiplica as forças ao que não tem nenhum vigor. Isaías 40:29", fortification, pt),
        Phrase("E disse-me: A minha graça te basta, porque o meu poder se aperfeiçoa na fraqueza. De boa vontade, pois, mais me gloriarei nas fraquezas, para que sobre mim repouse o poder de Cristo. 2 Coríntios 12:9", fortification,pt),
        Phrase("O Senhor é a minha luz e a minha salvação; a quem temerei? O Senhor é a força da minha vida; de quem me recearei? Salmos 27:1", fortification, pt),
        Phrase("Confia no Senhor de todo o teu coração e não te estribes no teu próprio entendimento. Reconhece-o em todos os teus caminhos, e ele endireitará as tuas veredas. Provérbios 3:5-6", fortification, pt),
        Phrase("Porque eu, o Senhor, teu Deus, te tomo pela tua mão direita e te digo: Não temas, que eu te ajudo. Isaías 41:13", fortification, pt),
        Phrase("Vigiai, estai firmes na fé, portai-vos varonilmente e fortalecei-vos. 1 Coríntios 16:13", fortification, pt),
        Phrase("O Senhor dará força ao seu povo; o Senhor abençoará o seu povo com paz. Salmos 29:11", fortification, pt),
        Phrase("Que diremos, pois, a estas coisas? Se Deus é por nós, quem será contra nós? Romanos 8:31", fortification, pt),
        Phrase("Tenho-vos dito isto, para que em mim tenhais paz; no mundo tereis aflições, mas tende bom ânimo; eu venci o mundo. João 16:33", fortification, pt ),
        Phrase("Não temas, porque eu sou contigo; não te assombres, porque eu sou o teu Deus; eu te fortaleço, e te ajudo, e te sustento com a minha destra fiel. Isaías 41:10",fortification, pt),
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you, I will help you, I will uphold you with my faithful right hand. Isaiah 41:10",fortification, en),
        Phrase("I can all things that strengthen me. Philippians 4:13", fortification, en),
        Phrase("God is our refuge and strength, a very present help in trouble. Psalm 46:1", fortification, en),
        Phrase("The God who gives me strength and makes my way perfect. Psalm 18:32", fortification, en),
        Phrase("For God has not given us a spirit of cowardice, but of power, of love and of a sound mind. 2 Timothy 1:7", fortification, en),
        Phrase("Didn't I send you? Be strong and brave! fear not, nor be dismayed, for the Lord your God is with you wherever you go. Joshua 1:9", fortification, en),
        Phrase("But those who hope in the Lord will renew their strength, they will mount up with wings like eagles, they will run and not be weary, they will walk and not be weary. Isaiah 40:31", fortification, en),
        Phrase("The Lord is my strength and my shield; my heart trusted in him, and I was helped; therefore my heart leaps for joy, and with my song I will praise him. Psalm 28:7", fortification, en),
        Phrase("Finally, my brothers, be strong in the Lord and in the power of his might. Ephesians 6:10", fortification, en),
        Phrase("Vigiai, estai firmes na fé, portai-vos varonilmente e fortalecei-vos. 1 Coríntios 16:13", fortification, en),


        Phrase("E o Deus da esperança vos encha de todo o gozo e paz no vosso crer, para que sejais ricos de esperança no poder do Espírito Santo. Romanos 15:13",hope, pt),
        Phrase("Agora, pois, Senhor, que espero eu? A minha esperança está em ti. Salmos 39:7",hope, pt),
        Phrase("Porque eu bem sei os pensamentos que tenho a vosso respeito, diz o Senhor; pensamentos de paz e não de mal, para vos dar o fim que esperais.Jeremias 29:11",hope, pt),
        Phrase("Porque tu és a minha esperança, Senhor Deus; tu és a minha confiança desde a minha mocidade. Salmos 71:5",hope, pt),
        Phrase("Mas os que esperam no Senhor renovarão as suas forças; subirão com asas como águias; correrão, e não se cansarão; andarão, e não se fatigarão. Isaías 40:31",hope, pt),
        Phrase("A qual temos como âncora da alma, segura e firme, e que penetra até ao interior do véu. Hebreus 6:19",hope, pt),
        Phrase("A minha alma espera somente no Senhor; porque dele vem a minha esperança. Salmos 130:5",hope, pt),
        Phrase("E a esperança não traz confusão, porquanto o amor de Deus está derramado em nossos corações pelo Espírito Santo que nos foi dado. Romanos 5:5",hope, pt),
        Phrase("As misericórdias do Senhor são a causa de não sermos consumidos, porque as suas misericórdias não têm fim. Lamentações 3:24",hope, pt),
        Phrase("Aos quais Deus quis fazer conhecer quais são as riquezas da glória deste mistério entre os gentios, que é Cristo em vós, esperança da glória. Colossenses 1:27",hope, pt),
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("Now may the God of hope fill you with all joy and peace in believing, that you may abound in hope by the power of the Holy Spirit. Romans 15:13",hope, en),
        Phrase("And now, Lord, what do I wait for? My hope is in You. Psalm 39:7",hope, en),
        Phrase("For I know the thoughts that I think toward you, says the Lord, thoughts of peace and not of evil, to give you a future and a hope. Jeremiah 29:11",hope, en),
        Phrase("For You are my hope, O Lord God; You are my trust from my youth. Psalm 71:5",hope, en),
        Phrase("But those who wait on the Lord shall renew their strength; they shall mount up with wings like eagles, they shall run and not be weary, they shall walk and not faint. Isaiah 40:31",hope, en),
        Phrase("This hope we have as an anchor of the soul, both sure and steadfast, and which enters the Presence behind the veil. Hebrews 6:19",hope, en),
        Phrase("I wait for the Lord, my soul waits, and in His word I do hope. Psalm 130:5",hope, en),
        Phrase("Now hope does not disappoint, because the love of God has been poured out in our hearts by the Holy Spirit who was given to us. Romans 5:5",hope, en),
        Phrase("The Lord's lovingkindnesses indeed never cease, for His compassions never fail. Lamentations 3:24",hope, en),
        Phrase("To them God willed to make known what are the riches of the glory of this mystery among the Gentiles: which is Christ in you, the hope of glory. Colossians 1:27",hope, en),


        Phrase("Em tudo, dai graças, porque esta é a vontade de Deus em Cristo Jesus para convosco. 1 Tessalonicenses 5:18", gratitude, pt),
        Phrase("Entrai pelas portas dele com gratidão e em seus átrios com louvor; dai-lhe graças e bendizei o seu nome. Salmos 100:4", gratitude, pt),
        Phrase("E tudo quanto fizerdes, seja por palavra ou por obra, fazei-o em nome do Senhor Jesus, dando por ele graças a Deus Pai. Colossenses 3:17 ", gratitude, pt),
        Phrase("Não estejais inquietos por coisa alguma; antes, as vossas petições sejam em tudo conhecidas diante de Deus pela oração e súplicas, com ação de graças. Filipenses 4:6", gratitude, pt),
        Phrase("Dando sempre graças por tudo a nosso Deus e Pai, em nome de nosso Senhor Jesus Cristo. Efésios 5:20", gratitude, pt),
        Phrase("Louvai ao Senhor, porque ele é bom, porque a sua benignidade é para sempre. Salmos 136:1", gratitude, pt),
        Phrase("Pelo que, tendo recebido um reino que não pode ser abalado, retenhamos a graça, pela qual sirvamos a Deus de modo agradável, com reverência e temor. Hebreus 12:28", gratitude, pt),
        Phrase("Aclamemos alegremente a presença dele com cânticos. Salmos 95:2", gratitude, pt),
        Phrase("Louvar-te-ei, Senhor, entre os povos; cantar-te-ei louvores entre as nações. Salmos 7:17", gratitude, pt),
        Phrase("Louvarei ao Senhor de todo o meu coração; contarei todas as tuas maravilhas. Salmos 9:1", gratitude, pt),
        Phrase("Para que a minha glória a ti cante louvores e não se cale. Senhor, Deus meu, eu te louvarei para sempre. Salmos 30:12", gratitude, pt),
        Phrase("Tu és o meu Deus, e eu te louvarei; tu és o meu Deus, e eu te exaltarei. Salmos 118:28", gratitude, pt),
        Phrase("Graças a Deus pelo seu dom inefável. 2 Coríntios 9:15", gratitude, pt),
        Phrase("Eu te louvarei, Senhor, de todo o meu coração; na presença dos deuses a ti cantarei louvores. Salmos 138:1", gratitude, pt),
        Phrase("Cantai ao Senhor com ações de graças; cantai louvores ao nosso Deus sobre a harpa. Salmos 147:7", gratitude, pt),
        Phrase("Louvai ao Senhor! Louvai ao Senhor, porque ele é bom, e a sua benignidade dura para sempre. Salmos 106:1", gratitude, pt),
        Phrase("Dizendo: Amém. Louvor, e glória, e sabedoria, e ação de graças, e honra, e poder, e força ao nosso Deus, para todo o sempre. Amém. Apocalipse 7:12", gratitude, pt),
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("Praise the lord! Praise the Lord, for he is good, and his kindness endures forever. Psalm 106:1", gratitude, en),
        Phrase("In everything give thanks; for this is the will of God in Christ Jesus for you. 1 Thessalonians 5:18", gratitude, en),
        Phrase("And let the peace of God rule in your hearts, to which also you were called in one body; and be thankful. Colossians 3:15", gratitude, en),
        Phrase("Do not be anxious about anything, but in every situation, by prayer and petition, with thanksgiving, present your requests to God. Philippians 4:6", gratitude, en),
        Phrase("Let the message of Christ dwell among you richly as you teach and admonish one another with all wisdom through psalms, hymns, and songs from the Spirit, singing to God with gratitude in your hearts. Colossians 3:16", gratitude, en),
        Phrase("Let us come before His presence with thanksgiving; let us shout joyfully to Him with psalms. Psalm 95:2", gratitude, en),

        Phrase("Porque o Senhor dá a sabedoria; da sua boca é que vem o conhecimento e o entendimento. Provérbios 2:6", wisdom, pt),
        Phrase("A sabedoria é a coisa principal; adquire, pois, a sabedoria; sim, com todos os teus bens, adquire o entendimento. Provérbios 4:7", wisdom, pt),
        Phrase("E, se algum de vós tem falta de sabedoria, peça-a a Deus, que a todos dá liberalmente e não o lança em rosto; e ser-lhe-á dada. Tiago 1:5", wisdom, pt),
        Phrase("Bem-aventurado o homem que acha sabedoria, e o homem que adquire conhecimento. Provérbios 3:13", wisdom, pt),
        Phrase("O temor do Senhor é o princípio da sabedoria, e o conhecimento do Santo a prudência. Provérbios 9:10", wisdom, pt),
        Phrase("Quanto melhor é adquirir a sabedoria do que o ouro! E quanto mais excelente, adquirir a prudência do que a prata! Provérbios 16:16", wisdom, pt),
        Phrase("Em quem estão escondidos todos os tesouros da sabedoria e da ciência. Colossenses 2:3", wisdom, pt),
        Phrase("O temor do Senhor é o princípio do conhecimento; os loucos desprezam a sabedoria e a instrução. Provérbios 1:7", wisdom, pt),
        Phrase("O sábio de coração aceita os mandamentos, mas o insensato de lábios ficará transtornado. Provérbios 10:8", wisdom, pt),
        Phrase("Pela soberba só se provoca a contenda, mas com os que se aconselham se acha a sabedoria. Provérbios 13:10", wisdom, pt),
        Phrase("No coração do prudente repousa a sabedoria, mas o que está no interior dos tolos se manifesta. Provérbios 14:33", wisdom, pt),
        Phrase("O homem de conhecimento usa bem as palavras, e o homem de entendimento é de animo sereno. Provérbios 17:27", wisdom, pt),
        Phrase("O coração do prudente adquire conhecimento, e o ouvido dos sábios busca a sabedoria. Provérbios 18:15", wisdom, pt),
        Phrase("Não há sabedoria, nem inteligência, nem conselho, contra o Senhor. Provérbios 21:30", wisdom, pt),
        Phrase("Assim será à tua alma; e haverá bom proveito para o teu pescoço. Provérbios 24:14", wisdom, pt),
        Phrase("Mas para os que são chamados, tanto judeus como gregos, lhes pregamos a Cristo, poder de Deus e sabedoria de Deus. 1 Coríntios 1:24", wisdom, pt),
        Phrase("Porque ao homem que lhe agrada, Deus dá sabedoria, e conhecimento, e alegria; mas ao pecador dá trabalho, para que ele ajunte e amontoe, a fim de dar ao que agrada a Deus. Também isso é vaidade e aflição de espírito. Eclesiastes 2:26", wisdom, pt),
        Phrase("Dá, pois, ao teu servo um coração entendido para julgar a teu povo, para que prudentemente discirna entre o bem e o mal; porque quem poderia julgar a este teu tão grande povo? 1 Reis 3:9", wisdom, pt),
        Phrase("O sábio é mais poderoso do que o forte, e o homem de conhecimento do que o que tem força. Provérbios 24:5", wisdom, pt),
        Phrase("Mas a sabedoria que vem do alto é, primeiramente, pura, depois, pacífica, moderada, tratável, cheia de misericórdia e de bons frutos, sem parcialidade, e sem hipocrisia. Tiago 3:17", wisdom, pt),
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("But the wisdom from above is first pure, then peaceable, gentle, and easy to be entreated, full of mercy and good fruits, without partiality, and without hypocrisy. James 3:17", wisdom, en),
        Phrase("For the Lord gives wisdom; from his mouth come knowledge and understanding. Proverbs 2:6", wisdom, en),
        Phrase("The fear of the Lord is the beginning of wisdom, and the knowledge of the Holy One is understanding. Proverbs 9:10", wisdom, en),
        Phrase("If any of you lacks wisdom, you should ask God, who gives generously to all without finding fault, and it will be given to you. James 1:5", wisdom, en),
        Phrase("For wisdom is better than rubies, and all the things one may desire cannot be compared with her. Proverbs 8:11", wisdom, en),
        Phrase("The wise in heart are called discerning, and gracious words promote instruction. Proverbs 16:21", wisdom, en),


        Phrase("Não to mandei eu? Esforça-te, e tem bom ânimo; não pasmes, nem te espantes; porque o Senhor teu Deus é contigo, por onde quer que andares. Josué 1:9", courage, pt),
        Phrase("Espera pelo Senhor, tem bom ânimo, e fortifique-se o teu coração; espera, pois, pelo Senhor. Salmos 27:14", courage, pt),
        Phrase("Esforçai-vos, e animai-vos; não temais, nem vos espanteis diante deles; porque o Senhor teu Deus é o que vai contigo; não te deixará nem te desamparará. Deuteronômio 31:6", courage, pt),
        Phrase("Vigiai, estai firmes na fé; portai-vos varonilmente, e fortalecei-vos. 1 Coríntios 16:13", courage, pt),
        Phrase("Esforçai-vos, e fortaleça-se o vosso coração, vós todos que esperais no Senhor. Salmos 31:24", courage, pt),
        Phrase("Porque Deus não nos deu o espírito de temor, mas de fortaleza, e de amor, e de moderação. 2 Timóteo 1:7", courage, pt),
        Phrase("Não temas, porque eu sou contigo; não te assombres, porque eu sou o teu Deus; eu te fortaleço, e te ajudo, e te sustento com a minha destra fiel. Isaías 41:10", courage, pt),
        Phrase("Então eles, vendo a ousadia de Pedro e João, e informados de que eram homens sem letras e indoutos, maravilharam-se e reconheceram que eles haviam estado com Jesus. Atos 4:13", courage, pt),
        Phrase("Tão somente esforça-te e tem mui bom ânimo, para teres o cuidado de fazer conforme a toda a lei que meu servo Moisés te ordenou; dela não te desvies, nem para a direita nem para a esquerda, para que prudentemente te conduzas por onde quer que andares. Josué 1:7", courage, pt),
        Phrase("No dia em que eu temer, hei de confiar em ti. Salmos 56:3", courage, pt),
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("Have I not commanded you? Be strong and of good courage; do not be afraid, nor be dismayed, for the Lord your God is with you wherever you go. Joshua 1:9", courage, en),
        Phrase("Wait on the Lord; be of good courage, and He shall strengthen your heart; wait, I say, on the Lord! Psalm 27:14", courage, en),
        Phrase("Be strong and of good courage, do not fear nor be afraid of them; for the Lord your God, He is the One who goes with you. He will not leave you nor forsake you. Deuteronomy 31:6", courage, en),
        Phrase("Watch, stand fast in the faith, be brave, be strong. 1 Corinthians 16:13", courage, en),
        Phrase("Wait on the Lord; be of good courage, and He shall strengthen your heart; wait, I say, on the Lord! Psalm 31:24", courage, en),

        Phrase("Mas dá maior graça. Portanto, diz: Deus resiste aos soberbos, mas dá graça aos humildes. Tiago 4:6", humility, pt),
        Phrase("O temor do Senhor é a instrução da sabedoria, e a humildade precede a honra. Provérbios 15:33", humility, pt),
        Phrase("E o que a si mesmo se exaltar será humilhado; e o que a si mesmo se humilhar será exaltado. Mateus 23:12", humility, pt),
        Phrase("Revesti-vos, pois, como eleitos de Deus, santos e amados, de entranhas de misericórdia, de benignidade, humildade, mansidão, longanimidade. Colossenses 3:12", humility, pt),
        Phrase("Nada façais por contenda ou por vanglória, mas por humildade; cada um considere os outros superiores a si mesmo. Filipenses 2:3", humility, pt),
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("But he gives us more grace. That is why Scripture says: God opposes the proud but shows favor to the humble. James 4:6", humility, en),
        Phrase("The fear of the Lord teaches wisdom, and humility comes before honor. Proverbs 15:33", humility, en),
        Phrase("For those who exalt themselves will be humbled, and those who humble themselves will be exalted. Matthew 23:12", humility, en),
        Phrase("Therefore, as God's chosen people, holy and dearly loved, clothe yourselves with compassion, kindness, humility, gentleness, and patience. Colossians 3:12", humility, en),
        Phrase("Do nothing out of selfish ambition or vain conceit. Rather, in humility value others above yourselves. Philippians 2:3", humility, en),


    )

    fun getPhrase(value: Int, lang: String): String{

        //codigo para salvar a categoria que vier ex: veio happy este código irá salvar todas as frases HAPPY
        val filtred = mListPhrase.filter {(it.categoryId == value) && it.lang == lang }
        //codigo que vai pegar um valor aleatório começando do 0 até o final do listOf do valor selecionado
        return filtred[Random.nextInt(filtred.size)].description
    }



}