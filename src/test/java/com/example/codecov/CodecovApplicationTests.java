package com.example.codecov;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodecovApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("test!");
		Assertions.assertThat(1L).isEqualTo(1L);
	}

}
