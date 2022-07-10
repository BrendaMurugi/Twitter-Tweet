package dev.murugi.tweet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter (var tweetList: List<Tweet>):
    RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item, parent, false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvName.text = currentTweet.name
        holder.tvHandle.text = currentTweet.handle
        holder.tvTime.text = currentTweet.time
        holder.tvTweet.text = currentTweet.tweet
        holder.tv200.text = currentTweet.comment
        holder.tv100.text = currentTweet.retweet
        holder.tv500.text = currentTweet.like
    }

    override fun getItemCount(): Int {
         return tweetList.size
    }
}

class TweetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var ivProfile = itemView.findViewById<ImageView>(R.id.ivProfile)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var ivComment = itemView.findViewById<ImageView>(R.id.ivComment)
    var tv200 = itemView.findViewById<TextView>(R.id.tv200)
    var ivRetweet = itemView.findViewById<ImageView>(R.id.ivRetweet)
    var tv100 = itemView.findViewById<TextView>(R.id.tv100)
    var ivLike = itemView.findViewById<ImageView>(R.id.ivLike)
    var tv500 = itemView.findViewById<TextView>(R.id.tv500)
    var ivAnalytic = itemView.findViewById<ImageView>(R.id.ivAnalytic)
    var ivInsight = itemView.findViewById<ImageView>(R.id.ivInsight)
}