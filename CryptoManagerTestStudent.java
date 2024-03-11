/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: JUnit test for the CryptoManager Class. Tests each of
 * the methods in the class. 
 * Due: 03/11/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Michael Walsh
*/

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsStringInBounds() 
	{
		assertTrue(CryptoManager.isStringInBounds("HELLO WORLD"));
		assertTrue(CryptoManager.isStringInBounds("MICHAEL WALSH"));
	}

	@Test
	void testCaesarEncryption() 
	{
		assertEquals("IFMMP!XPSME", CryptoManager.caesarEncryption("HELLO WORLD", 1));
		assertEquals("\\(/]P\\T/X\"/\\XRWPT[/&P[\"W", CryptoManager.caesarEncryption("MY NAME IS MICHAEL WALSH", 15));
		assertEquals("H<9TG?MT=GT6@I9", CryptoManager.caesarEncryption("THE SKY IS BLUE", 500));
	}

	@Test
	void testBellasoEncryption() 
	{
		assertEquals("PJXX^(\\[^[L", CryptoManager.bellasoEncryption("HELLO WORLD", "HELLO"));
		assertEquals("N[#RBOH$JU#QJEKEFN#[BNVL", CryptoManager.bellasoEncryption("MY NAME IS MICHAEL WALSH", "ABCD"));
		assertEquals("UJH$XQ (R]+CNXI", CryptoManager.bellasoEncryption("THE SKY IS BLUE", "ABCDEFGHIJK"));
	}

	@Test
	void testCaesarDecryption() 
	{
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("IFMMP!XPSME", 1));
		assertEquals("WHAT TIME IS IT", CryptoManager.caesarDecryption(",]V)5)^\"Z5^(5^)", 21));
		assertEquals("THE CIRCUS IS COMING TO TOWN", CryptoManager.caesarDecryption(" TQ,OU^O!_,U_,O[YUZS, [, [#Z", 12));
	}

	@Test
	void testBellasoDecryption() 
	{
		assertEquals("HELLO WORLD", CryptoManager.bellasoDecryption("IGOMQ#XQUMF", "ABC"));
		assertEquals("MICHAEL", CryptoManager.bellasoDecryption("UNOTPMQ", "HELLO"));
		assertEquals("MY NAME IS MICHAEL WALSH", CryptoManager.bellasoDecryption("N[#RFNG#MX!OLGMBGO$\\BNVL", "ABCDE"));
	}

}
