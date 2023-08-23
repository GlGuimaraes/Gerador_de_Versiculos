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

        Phrase("Esperança",hope, pt), // INSERIR VERSICULOS DE ESPERANÇA

        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //

        Phrase("teste em esperança",hope, en), // INSERIR VERSICULOS DE ESPERANÇA EM INGLES

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
        Phrase("Praise the lord! Praise the Lord, for he is good, and his kindness endures forever. Psalm 106:1", gratitude, en), // INSERIR VERSICULOS EM INGLES

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
        // INSERIR EM INLÊS WISDOM


        Phrase("Coragem", courage, pt), // INSERIR VERSÍCULOS SOBRE CORAGEM
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("Teste em coragem", courage, en), // INSERIR VERSÍCULOS SOBRE CORAGEM EM INGLES

        Phrase("Humildade", humility, pt), // INSERIR VERSÍCULOS SOBRE HUMILDADE
        //  ------------------------------------------- EM INGLÊS ------------------------------------------- //
        Phrase("teste em humildade", humility, en), // INSERIR VERSÍCULOS SOBRE HUMILDADE EM INGLES


    )

    fun getPhrase(value: Int, lang: String): String{

        //codigo para salvar a categoria que vier ex: veio happy este código irá salvar todas as frases HAPPY
        val filtred = mListPhrase.filter {(it.categoryId == value) && it.lang == lang }
        //codigo que vai pegar um valor aleatório começando do 0 até o final do listOf do valor selecionado
        return filtred[Random.nextInt(filtred.size)].description
    }



}