package com.koalatea.thehollidayinn.softwareengineeringdaily.network.response;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Kurian on 25-Sep-17.
 */
@AutoValue
public abstract class PostResponse {
    @SerializedName("_id")
    public abstract String id();
    @SerializedName("date")
    public abstract Date date();
    @SerializedName("link")
    public abstract String episodeLink();
    @SerializedName("upvoted")
    public abstract boolean upVoted();
    @SerializedName("downvoted")
    public abstract boolean downVoted();
    @SerializedName("mp3")
    public abstract String audioLink();
    @SerializedName("featuredImage")
    public abstract String featuredImageLink();
    @SerializedName("content")
    public abstract ContentResponse content();
    @SerializedName("title")
    public abstract TitleResponse title();

    public static TypeAdapter<PostResponse> typeAdapter(Gson gson) {
        return new AutoValue_PostResponse.GsonTypeAdapter(gson);
    }

    @AutoValue
    public abstract static class TitleResponse {
        @SerializedName("rendered")
        public abstract String renderedTitle();

        public static TypeAdapter<TitleResponse> typeAdapter(Gson gson) {
            return new AutoValue_PostResponse_TitleResponse.GsonTypeAdapter(gson);
        }
    }

    @AutoValue
    public abstract static class ContentResponse {
        @SerializedName("rendered")
        public abstract String renderedContent();

        public static TypeAdapter<ContentResponse> typeAdapter(Gson gson) {
            return new AutoValue_PostResponse_ContentResponse.GsonTypeAdapter(gson);
        }
    }
}
