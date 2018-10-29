package com.gstar.blogx;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class BloggerAPI {

    private static final String key = "AIzaSyBihbr0c_aAdjcUr4Y28RQRunApGpdFiZM";
    private static final String url = "https://www.googleapis.com/blogger/v3/blogs/5675338057094210044/posts/";


    public static PostService postService = null;

    public static PostService getPostService()
    {
        if(postService == null)
        {
            //Create
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService
    {
        @GET("?key="+key)
        Call<PostList> getPostList();

        //@GET("(postId)/?key="+key)
        //Call<Item> getPostById(@Path("postId") String id);
        // ****We commented this because we need to access all posts asnthis method is used for accessing any specific post
    }

}
