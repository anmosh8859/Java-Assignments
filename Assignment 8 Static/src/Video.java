public class Video {
    private int videoId, views, likes;
    private static int totalVideos;
    private String title;
    void setVideoId(int id){
        videoId=id;
    }
    public void setViews(int v){
        views=v;
    }
    public void setLikes(int l){
        likes=l;
    }
    public static void setTotalVideos(int t){
        totalVideos=t;
    }
    public int getVideoId(){
        return videoId;
    }
    public int getViews(){
        return views;
    }
    public int getLikes(){
        return likes;
    }
    public String getTitle(){
        return title;
    }
}
