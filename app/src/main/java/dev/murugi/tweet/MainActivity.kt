package dev.murugi.tweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.murugi.tweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet1 = Tweet("", "Brenda Murugi", "@murugibree009", "-50m", "Day 10 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Made a Python program that takes in user input and returns a response stating whether that year is a leap or not..✌️\uD83E\uDD70", "300", "45", "500", "", "")
        var tweet2 = Tweet("", "Chep Chepkoech", "@missChekko", "-20m", "Day 9 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Made a password generator using Python.✌️\uD83E\uDD70", "200", "56", "700", "", "")
        var tweet3 = Tweet("", "Esther Owiti", "@ewiiiii", "-30m", "Day 8 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Learning Python arguments.✌️\uD83E\uDD70\n", "100", "36", "300", "", "")
        var tweet4 = Tweet("", "Susan Nakimuli", "@pinkie panther", "-July 11", "Day 8 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Learning Python arguments.✌️\uD83E\uDD70\n", "230", "78", "600", "", "")
        var tweet5 = Tweet("", "Cudra Mohamed", "@ncudra", "-July 23", "Day 8 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Learning Python arguments.✌️\uD83E\uDD70\n", "150", "49", "125", "", "")
        var tweet6 = Tweet("", "Sharon Mwangi", "@shar", "-July 24", "Day 8 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Learning Python arguments.✌️\uD83E\uDD70\n", "100", "36", "300", "", "")
        var tweet7 = Tweet("", "Effence Kamau", "@kababy", "-30m", "Day 8 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Learning Python arguments.✌️\uD83E\uDD70\n", "100", "36", "300", "", "")
        var tweet8 = Tweet("", "Akuot Philip", "@akuotssss", "-30m", "Day 8 of #100DaysOfCode #codeHive2022 \n" +
                "#IAmAkirachix #Python \n" +
                "Learning Python arguments.✌️\uD83E\uDD70\n", "100", "36", "300", "", "")
        var tweetsList = listOf(tweet1, tweet2, tweet3, tweet4, tweet5, tweet6, tweet7, tweet8)
        var tweetsadapter = TweetRvAdapter(tweetsList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = tweetsadapter
    }
}