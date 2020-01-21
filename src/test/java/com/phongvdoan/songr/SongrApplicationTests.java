package com.phongvdoan.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAlbumClass(){
		Album[] albumList = new Album[]{new Album("ABC","Jackson 5", 11, 1000, "http://mjlyricsonly.com/wp-content/uploads/2011/11/ABC-album-cover.jpg"), new Album("Arrival", "ABBA", 12, 999, "https://media.pitchfork.com/photos/5929bf51abf31b7dc71562bd/1:1/w_320/aaa1a875.jpg"), new Album("BAD", "Michael Jackson", 12, 2000, "https://www.rollingstone.com/wp-content/uploads/2018/06/rs-144691-449419e5c92e0ca199f3ca3d8a3be6acb31ec21e.jpg")};
		assertTrue( albumList != null);

	}

}
