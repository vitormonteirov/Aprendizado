package Aprendizado.UseTheHeadJAVA;
import java.util.*;
import java.util.stream.Collectors;

public class RockStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("The list of Rock music are: " + rockSongs);

        List<Song> electroSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Electronic"))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("The list of Electro music are: " + electroSongs);
    }
}
