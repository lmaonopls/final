package com.example.final_exam.Fragments

import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.final_exam.R

class MainCardsFragment : Fragment(R.layout.fragment_main_cards) {

    private lateinit var aceHeart : ImageButton
    private lateinit var kingHeart : ImageButton
    private lateinit var queenHeart : ImageButton
    private lateinit var jackHeart : ImageButton
    private lateinit var tenHeart : ImageButton
    private lateinit var nineHeart : ImageButton
    private lateinit var eightHeart : ImageButton
    private lateinit var sevenHeart : ImageButton
    private lateinit var sixHeart : ImageButton

    private lateinit var aceSpades : ImageButton
    private lateinit var kingSpades : ImageButton
    private lateinit var queenSpades : ImageButton
    private lateinit var jackSpades : ImageButton
    private lateinit var tenSpades : ImageButton
    private lateinit var nineSpades : ImageButton
    private lateinit var eightSpades : ImageButton
    private lateinit var sevenSpades : ImageButton

    private lateinit var jokerOne : Button

    private lateinit var aceClubs : ImageButton
    private lateinit var kingClubs : ImageButton
    private lateinit var queenClubs : ImageButton
    private lateinit var jackClubs : ImageButton
    private lateinit var tenClubs : ImageButton
    private lateinit var nineClubs : ImageButton
    private lateinit var eightClubs : ImageButton
    private lateinit var sevenClubs : ImageButton

    private lateinit var jokerTwo : Button

    private lateinit var aceDiamonds : ImageButton
    private lateinit var kingDiamonds : ImageButton
    private lateinit var queenDiamonds : ImageButton
    private lateinit var jackDiamonds : ImageButton
    private lateinit var tenDiamonds : ImageButton
    private lateinit var nineDiamonds : ImageButton
    private lateinit var eightDiamonds : ImageButton
    private lateinit var sevenDiamonds : ImageButton
    private lateinit var sixDiamonds : ImageButton

    private lateinit var resetButton : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aceHeartRed = R.drawable.ace_of_hearts
        val kingHeartRed = R.drawable.king_of_hearts
        val queenHeartRed = R.drawable.queen_of_hearts
        val jackHeartRed = R.drawable.jack_of_hearts
        val tenHeartRed = R.drawable.ten_of_hearts
        val nineHeartRed = R.drawable.nine_of_hearts
        val eightHeartRed = R.drawable.eight_of_hearts
        val sevenHeartRed = R.drawable.seven_of_hearts
        val sixHeartRed = R.drawable.six_of_hearts

        val aceSpadesBlack = R.drawable.ace_of_spades
        val kingSpadesBlack = R.drawable.king_of_spades
        val queenSpadesBlack = R.drawable.queen_of_spades
        val jackSpadesBlack = R.drawable.jack_of_spades
        val tenSpadesBlack = R.drawable.ten_of_spades
        val nineSpadesBlack = R.drawable.nine_of_spades
        val eightSpadesBlack = R.drawable.eight_of_spades
        val sevenSpadesBlack = R.drawable.seven_of_spades

        val aceClubsBlack = R.drawable.ace_of_clubs
        val kingClubsBlack = R.drawable.king_of_clubs
        val queenClubsBlack = R.drawable.queen_of_clubs
        val jackClubsBlack = R.drawable.jack_of_clubs
        val tenClubsBlack = R.drawable.ten_of_clubs
        val nineClubsBlack = R.drawable.nine_of_clubs
        val eightClubsBlack = R.drawable.eight_of_clubs
        val sevenClubsBlack = R.drawable.seven_of_clubs

        val aceDiamondsRed = R.drawable.ace_of_diamonds
        val kingDiamondsRed = R.drawable.king_of_diamonds
        val queenDiamondsRed = R.drawable.queen_of_diamonds
        val jackDiamondsRed = R.drawable.jack_of_diamonds
        val tenDiamondsRed = R.drawable.ten_of_diamonds
        val nineDiamondsRed = R.drawable.nine_of_diamonds
        val eightDiamondsRed = R.drawable.eight_of_diamonds
        val sevenDiamondsRed = R.drawable.seven_of_diamonds
        val sixDiamondsRed = R.drawable.six_of_diamonds


        val aceHeartGrey = R.drawable.ace_of_hearts_grey
        val kingHeartGrey = R.drawable.king_of_hearts_grey
        val queenHeartGrey = R.drawable.queen_of_hearts_grey
        val jackHeartGrey = R.drawable.jack_of_hearts_grey
        val tenHeartGrey = R.drawable.ten_of_hearts_grey
        val nineHeartGrey = R.drawable.nine_of_hearts_grey
        val eightHeartGrey = R.drawable.eight_of_hearts_grey
        val sevenHeartGrey = R.drawable.seven_of_hearts_grey
        val sixHeartGrey = R.drawable.six_of_hearts_grey

        val aceSpadesGrey = R.drawable.ace_of_spades_grey
        val kingSpadesGrey = R.drawable.king_of_spades_grey
        val queenSpadesGrey = R.drawable.queen_of_spades_grey
        val jackSpadesGrey = R.drawable.jack_of_spades_grey
        val tenSpadesGrey = R.drawable.ten_of_spades_grey
        val nineSpadesGrey = R.drawable.nine_of_spades_grey
        val eightSpadesGrey = R.drawable.eight_of_spades_grey
        val sevenSpadesGrey = R.drawable.seven_of_spades_grey

        val aceClubsGrey = R.drawable.ace_of_clubs_grey
        val kingClubsGrey = R.drawable.king_of_clubs_grey
        val queenClubsGrey = R.drawable.queen_of_clubs_grey
        val jackClubsGrey = R.drawable.jack_of_clubs_grey
        val tenClubsGrey = R.drawable.ten_of_clubs_grey
        val nineClubsGrey = R.drawable.nine_of_clubs_grey
        val eightClubsGrey = R.drawable.eight_of_clubs_grey
        val sevenClubsGrey = R.drawable.seven_of_clubs_grey

        val aceDiamondsGrey = R.drawable.ace_of_diamonds_grey
        val kingDiamondsGrey = R.drawable.king_of_diamonds_grey
        val queenDiamondsGrey = R.drawable.queen_of_diamonds_grey
        val jackDiamondsGrey = R.drawable.jack_of_diamonds_grey
        val tenDiamondsGrey = R.drawable.ten_of_diamonds_grey
        val nineDiamondsGrey = R.drawable.nine_of_diamonds_grey
        val eightDiamondsGrey = R.drawable.eight_of_diamonds_grey
        val sevenDiamondsGrey = R.drawable.seven_of_diamonds_grey
        val sixDiamondsGrey = R.drawable.six_of_diamonds_grey

        fun viewById() {

            aceHeart = view.findViewById(R.id.aceHeart)
            kingHeart = view.findViewById(R.id.kingHeart)
            queenHeart = view.findViewById(R.id.queenHeart)
            jackHeart = view.findViewById(R.id.jackHeart)
            tenHeart = view.findViewById(R.id.tenHeart)
            nineHeart = view.findViewById(R.id.nineHeart)
            eightHeart = view.findViewById(R.id.eightHeart)
            sevenHeart = view.findViewById(R.id.sevenHeart)
            sixHeart = view.findViewById(R.id.sixHeart)

            aceSpades = view.findViewById(R.id.aceSpades)
            kingSpades = view.findViewById(R.id.kingSpades)
            queenSpades = view.findViewById(R.id.queenSpades)
            jackSpades = view.findViewById(R.id.jackSpades)
            tenSpades = view.findViewById(R.id.tenSpades)
            nineSpades = view.findViewById(R.id.nineSpades)
            eightSpades = view.findViewById(R.id.eightSpades)
            sevenSpades = view.findViewById(R.id.sevenSpades)

            jokerOne  = view.findViewById(R.id.jokerOne)

            aceClubs = view.findViewById(R.id.aceClubs)
            kingClubs = view.findViewById(R.id.kingClubs)
            queenClubs = view.findViewById(R.id.queenClubs)
            jackClubs = view.findViewById(R.id.jackClubs)
            tenClubs = view.findViewById(R.id.tenClubs)
            nineClubs = view.findViewById(R.id.nineClubs)
            eightClubs = view.findViewById(R.id.eightClubs)
            sevenClubs = view.findViewById(R.id.sevenClubs)

            jokerTwo = view.findViewById(R.id.jokerTwo)

            aceDiamonds = view.findViewById(R.id.aceDiamonds)
            kingDiamonds = view.findViewById(R.id.kingDiamonds)
            queenDiamonds = view.findViewById(R.id.queenDiamonds)
            jackDiamonds = view.findViewById(R.id.jackDiamonds)
            tenDiamonds = view.findViewById(R.id.tenDiamonds)
            nineDiamonds = view.findViewById(R.id.nineDiamonds)
            eightDiamonds = view.findViewById(R.id.eightDiamonds)
            sevenDiamonds = view.findViewById(R.id.sevenDiamonds)
            sixDiamonds = view.findViewById(R.id.sixDiamonds)

            resetButton = view.findViewById(R.id.resetButton)
        }

        viewById()

        fun setClick(card: ImageButton, resource: Int) {
            card.setOnClickListener() {

                card.setImageResource(resource)
                card.setBackgroundResource(R.drawable.button_grey)

            }

            jokerOne.setOnClickListener() {

                jokerOne.setTextColor(Color.parseColor("#FF777777"))
                jokerOne.setBackgroundResource(R.drawable.button_grey)

            }

            jokerTwo.setOnClickListener() {

                jokerTwo.setTextColor(Color.parseColor("#FF777777"))
                jokerTwo.setBackgroundResource(R.drawable.button_grey)

            }

        }

        setClick(aceHeart, aceHeartGrey)
        setClick(kingHeart, kingHeartGrey)
        setClick(queenHeart, queenHeartGrey)
        setClick(jackHeart, jackHeartGrey)
        setClick(tenHeart, tenHeartGrey)
        setClick(nineHeart, nineHeartGrey)
        setClick(eightHeart, eightHeartGrey)
        setClick(sevenHeart, sevenHeartGrey)
        setClick(sixHeart, sixHeartGrey)

        setClick(aceSpades, aceSpadesGrey)
        setClick(kingSpades, kingSpadesGrey)
        setClick(queenSpades, queenSpadesGrey)
        setClick(jackSpades, jackSpadesGrey)
        setClick(tenSpades, tenSpadesGrey)
        setClick(nineSpades, nineSpadesGrey)
        setClick(eightSpades, eightSpadesGrey)
        setClick(sevenSpades, sevenSpadesGrey)

        setClick(aceClubs, aceClubsGrey)
        setClick(kingClubs, kingClubsGrey)
        setClick(queenClubs, queenClubsGrey)
        setClick(jackClubs, jackClubsGrey)
        setClick(tenClubs, tenClubsGrey)
        setClick(nineClubs, nineClubsGrey)
        setClick(eightClubs, eightClubsGrey)
        setClick(sevenClubs, sevenClubsGrey)

        setClick(aceDiamonds, aceDiamondsGrey)
        setClick(kingDiamonds, kingDiamondsGrey)
        setClick(queenDiamonds, queenDiamondsGrey)
        setClick(jackDiamonds, jackDiamondsGrey)
        setClick(tenDiamonds, tenDiamondsGrey)
        setClick(nineDiamonds, nineDiamondsGrey)
        setClick(eightDiamonds, eightDiamondsGrey)
        setClick(sevenDiamonds, sevenDiamondsGrey)
        setClick(sixDiamonds, sixDiamondsGrey)

        fun setUnClickRed(card: ImageButton, resource: Int) {


            card.setImageResource(resource)
            card.setBackgroundResource(R.drawable.button_red)


        }

        fun setUnClickBlack(card: ImageButton, resource: Int) {


            card.setImageResource(resource)
            card.setBackgroundResource(R.drawable.button_black)


        }

        resetButton.setOnClickListener() {

            setUnClickRed(aceHeart, aceHeartRed)
            setUnClickRed(kingHeart, kingHeartRed)
            setUnClickRed(queenHeart, queenHeartRed)
            setUnClickRed(jackHeart, jackHeartRed)
            setUnClickRed(tenHeart, tenHeartRed)
            setUnClickRed(nineHeart, nineHeartRed)
            setUnClickRed(eightHeart, eightHeartRed)
            setUnClickRed(sevenHeart, sevenHeartRed)
            setUnClickRed(sixHeart, sixHeartRed)

            setUnClickRed(aceDiamonds, aceDiamondsRed)
            setUnClickRed(kingDiamonds, kingDiamondsRed)
            setUnClickRed(queenDiamonds, queenDiamondsRed)
            setUnClickRed(jackDiamonds, jackDiamondsRed)
            setUnClickRed(tenDiamonds, tenDiamondsRed)
            setUnClickRed(nineDiamonds, nineDiamondsRed)
            setUnClickRed(eightDiamonds, eightDiamondsRed)
            setUnClickRed(sevenDiamonds, sevenDiamondsRed)
            setUnClickRed(sixDiamonds, sixDiamondsRed)

            setUnClickBlack(aceSpades, aceSpadesBlack)
            setUnClickBlack(kingSpades, kingSpadesBlack)
            setUnClickBlack(queenSpades, queenSpadesBlack)
            setUnClickBlack(jackSpades, jackSpadesBlack)
            setUnClickBlack(tenSpades, tenSpadesBlack)
            setUnClickBlack(nineSpades, nineSpadesBlack)
            setUnClickBlack(eightSpades, eightSpadesBlack)
            setUnClickBlack(sevenSpades, sevenSpadesBlack)

            setUnClickBlack(aceClubs, aceClubsBlack)
            setUnClickBlack(kingClubs, kingClubsBlack)
            setUnClickBlack(queenClubs, queenClubsBlack)
            setUnClickBlack(jackClubs, jackClubsBlack)
            setUnClickBlack(tenClubs, tenClubsBlack)
            setUnClickBlack(nineClubs, nineClubsBlack)
            setUnClickBlack(eightClubs, eightClubsBlack)
            setUnClickBlack(sevenClubs, sevenClubsBlack)



            jokerOne.setTextColor(Color.parseColor("#FFFFFFFF"))
            jokerOne.setBackgroundResource(R.drawable.button_white)


            jokerTwo.setTextColor(Color.parseColor("#FFFFFFFF"))
            jokerTwo.setBackgroundResource(R.drawable.button_white)


        }


        }


    }










