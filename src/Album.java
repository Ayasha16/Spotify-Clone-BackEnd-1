import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
   private String name;
   private String artist;
   private List<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public boolean findSong(String title){
        for(Song s: songs){
            if(s.getTitle().equals(title))
                return true;
        }
        return false;
    }

    void addSong(String title, double duration) {
        Song s = new Song(title, duration);
        if (findSong((String) s.getTitle()) == true) {
            System.out.println("Song already present in album");
        } else {
            songs.add(s);
            System.out.println("New Song has been added to the album");
        }
    }
    public void addtoPlayListviaAlbum(String title, LinkedList<Song> playlist){
        if(findSong(title)==true){
            for(Song song: songs){
                if(song.getTitle().equals(title)){
                    playlist.add(song);
                    System.out.println("Song has been added to playlist");
                    break;
                }
            }

        }
        else{
            System.out.println("Song is not present in this album");
        }
        return;
    }
    public void addtoPlayListviaAlbum(int trackNo, LinkedList<Song> playList){
        int index = trackNo-1;
        if(index>=0 && index<songs.size()){
            playList.add(songs.get(index));
        }
        else{
            System.out.println("Invalid track number");
        }
        return;
    }
}
