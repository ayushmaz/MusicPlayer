package android.example.musicplayer;

public class Songs {

    private String mSongName;
    private String mAlbumName;
    private String mSingers;

    public  Songs(String mSongName , String mAlbumName , String mSingers){
        this.mSongName = mSongName ;
        this.mAlbumName = mAlbumName;
        this.mSingers = mSingers;
    }

    public String getSongName(){return mSongName;}
    public String getAlbumName(){return mAlbumName;}
    public String getSingers(){return mSingers;}

}
