package co.edureka.threads;

/*class DownloadSongTask{
	
	void download() {	
		for(int i=1;i<=10;i++) {
			
			try {
				// 1sec
				Thread.sleep(1000); // CheckedException
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println(">> #Downloading# Song | Byte["+i+"]");
		}
	}	
}*/

// IS-A Relationship
// DownloadSongTask is now Child of Thread or IS-A Thread
class DownloadSongTask extends Thread{
	
	// We need to override method of Parent i.e. run in child
	// What task should be executed must be written in the run method
	public void run() {	
		for(int i=1;i<=10;i++) {
			
			try {
				// 1sec
				Thread.sleep(1000); // CheckedException
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println(">> #Downloading# Song | Byte["+i+"]");
		}
	}	
}

// We can either extend Thread or implement Runnable
class SongListTask implements Runnable{
	public void run() {	
		// Assuming we have to show a list of 10 mp3 songs 
		for(int i=1;i<=10;i++) {
			try {
				// 1sec
				Thread.sleep(1000); // CheckedException
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(">> *Displaying* MP3 Song["+i+"]");
		}
	}
}


//When to use Runnable Interface
class CA{
	
}


// if a class is already extending another class we will not be able to extend Thread
//class CB extends CA, Thread{ // error : Multiple Inheritance Not Supported in Java

// So we can implement Runnable as a solution :)
class CB extends CA implements Runnable{
	public void run() {
	
		
	}
}


public class MusicApp {
	
	// main method -> represents main thread | Whatever we write in main is executed by main thread
	// if main thread is blocked heavily i.e. somewhere 5 seconds or so | Your App may seem to be HUNG !! Its in a Hang State !!
	// we as user will get an error message from OS/JVM | App is not Responding. Would you like to wait or kill App !!
	public static void main(String[] args) {
		// T1
		System.out.println(">> Music App Started");
		// T2
		System.out.println(">> Welcome to ==MusicWorld==");
		// T3
		//DownloadSongTask downloadTask = new DownloadSongTask();
		//downloadTask.download();
		
		DownloadSongTask downloadTask = new DownloadSongTask();
		
		Runnable r = new SongListTask(); 		// RTP Statement
		Thread songListTask = new Thread(r);	// Create a Thread Object and pass runnable to it
		
		downloadTask.setName("DownloadThread");
		songListTask.setName("SongListThread");
		Thread.currentThread().setName("MusicAppThread");
		
		// Priority is all about requesting JVM in some occupied state to execute the threads according to priority
		downloadTask.setPriority(Thread.MAX_PRIORITY); // 10
		songListTask.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		downloadTask.start(); // start method is from Thread class which will internally execute run method which we have overrided
	
		// Immediately after starting a thread, we can execute join method on the Thread
		try {
			downloadTask.join(); // Command to JVM. Let this thread finish all its operations and other must wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Till time T3 is not finished T4 and T5 will be blocked
		
		// T4
		songListTask.start();
		
		System.out.println(">> downloadTask name is: "+downloadTask.getName()+" and Priority is: "+downloadTask.getPriority());
		System.out.println(">> songListTask name is: "+songListTask.getName()+" and Priority is: "+songListTask.getPriority());
		System.out.println(">> main name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		//T5
		System.out.println(">> Welcome, John. This is Your Premium Account !!");
	}

}
