package com.phongvdoan.songr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SongrApplicationTests {

	Album testAlbum;

	@Test
	void contextLoads() {
	}

	@Test
	public void testAlbumClass(){
		Album[] albumList = new Album[]{new Album("ABC","Jackson 5", 11, 1000, "http://mjlyricsonly.com/wp-content/uploads/2011/11/ABC-album-cover.jpg"), new Album("Arrival", "ABBA", 12, 999, "https://media.pitchfork.com/photos/5929bf51abf31b7dc71562bd/1:1/w_320/aaa1a875.jpg"), new Album("BAD", "Michael Jackson", 12, 2000, "https://www.rollingstone.com/wp-content/uploads/2018/06/rs-144691-449419e5c92e0ca199f3ca3d8a3be6acb31ec21e.jpg")};
		assertTrue( albumList != null);

	}

	@BeforeEach
	public  void setUP(){
		testAlbum = new Album("testTitle","testArtist", 5, 50, "https");
	}

	@Test
	public void testAlblumClass_setterSongCount(){
		testAlbum.setSongCount(10);
		assertEquals(10, testAlbum.songCount, "The setter did not work for songCount");
	}
	@Test
	public void testAlblumClass_setterTitle(){
		testAlbum.setTitle("Boom");
		assertEquals("Boom", testAlbum.title, "The setter did not work for title");
	}
	@Test
	public void testAlblumClass_setterArtist(){
		testAlbum.setArtist("DOGGY");
		assertEquals("DOGGY", testAlbum.artist, "The setter did not work for Artist");
	}
	@Test
	public void testAlblumClass_setterLength(){
		testAlbum.setLengthInSeconds(100);
		assertEquals(100, testAlbum.lengthInSeconds, "The setter did not work for length");
	}

	@Test
	public void testAlblumClass_setterImageURL(){
		testAlbum.setImageUrl("https://google.com");
		assertEquals("https://google.com", testAlbum.imageUrl, "The setter did not work for imageUrl");
	}
	@Test
	public void testAlblumClass_getterImageURL(){
		String result = testAlbum.getImageUrl();
		assertEquals("https", result, "The getter did not work for imageUrl");
	}
	@Test
	public void testAlblumClass_getterTitle(){
		String result = testAlbum.getTitle();
		assertEquals("testTitle", result, "The getter did not work for title");
	}
	@Test
	public void testAlblumClass_getterArtist(){
		String result = testAlbum.getArtist();
		assertEquals("testArtist", result, "The getter did not work for artist");
	}
	@Test
	public void testAlblumClass_getterSongCount(){
		int result = testAlbum.getSongCount();
		assertEquals(5, result, "The getter did not work for songCount");
	}
	@Test
	public void testAlblumClass_getterLength(){
		int result = testAlbum.getLengthInSeconds();
		assertEquals(50, result, "The getter did not work for length");
	}

}
