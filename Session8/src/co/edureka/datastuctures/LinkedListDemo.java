package co.edureka.datastuctures;

// Object Song Structure
// Link as reference for our Program: https://gaana.com/playlist/gaana-dj-bollywood-top-50-1
class Song{
	
	// Attributes
	String title;
	String artist;
	double duration;
	
	// Reference to the Song Object in the Same Song Object, but to some other Song Object
	// Self Referencing :)
	Song nextSong;
	Song previousSong;
	
	public Song(String title, String artist, double duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	
	void showSong() {
		System.out.println("--------------------------------");
		System.out.println(title+"\t"+artist+"\t"+duration);
		System.out.println("--------------------------------");
	}
	
}

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Song song1 = new Song("Ek Toh Zindagi", "Neha", 3.20);
		Song song2 = new Song("Akhiyon Se", "Mika", 4.20);
		Song song3 = new Song("Ruk Zara", "Stebin", 3.50);
		Song song4 = new Song("Chandigarh", "Badshah", 4.55);
		Song song5 = new Song("Munna", "Badshah", 11.51);
		
		System.out.println(">> song1 is: "+song1);
		System.out.println(">> song2 is: "+song2);
		System.out.println(">> song3 is: "+song3);
		System.out.println(">> song4 is: "+song4);
		System.out.println(">> song5 is: "+song5);
		
		song1.nextSong = song2;
		song2.nextSong = song3;
		song3.nextSong = song4;
		song4.nextSong = song5;
		song5.nextSong = song1; 	// last song has next song as first song
		
		song1.previousSong = song5; // first song has previous song as last song
		song2.previousSong = song1;
		song3.previousSong = song2;
		song4.previousSong = song3;
		song5.previousSong = song4;
		
		// 5 Objects Above are basically connected to each other with reference linking
		
		song1.showSong();
		song1.nextSong.showSong();
		song1.nextSong.nextSong.showSong();
		
		// Introduction -> Data Structure | How we can store data efficiently in our program so that our algo takes less time :)
		
		

	}

}
