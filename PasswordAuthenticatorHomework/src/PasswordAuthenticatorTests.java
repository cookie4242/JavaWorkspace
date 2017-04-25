//import static org.junit.Assert.*;
//import java.lang.Math;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//public class PasswordAuthenticatorTests {
//
//	private PasswordAuthenticatorHomework practice = new PasswordAuthenticatorHomework();
//	
//	@Test
//	public void verifyPasswordReturnsFalseWhenPasswordIsLessThanEightCharactersLong() {
//		assertFalse(practice.VerifyPassword("pass"));
//	}
//	
//	@Test
//	public void verifyPasswordSucceedsWhenItMeetsAllCriteria() {
//		assertTrue(practice.VerifyPassword("Q1eeeee!"));
//	}
//	
//	@Test
//	public void verifyPasswordFailsWhenItDoesNotContainASpecialCharacter() {
//		assertFalse(practice.VerifyPassword("Q1eeeeegas"));
//	}
//
//	@Test
//	public void verifyPasswordFailsWhenItDoesNotContainACapitalizedCharacter() {
//		assertFalse(practice.VerifyPassword("1eeeee!"));
//	}
//	
//	@Test
//	public void returnsTrueWhenStringContainsSpecialCharacter() {
//		String s = "123$%^";
//		assertTrue(practice.HasASpecialCharacter(s));
//	}
//	
//	@Test
//	public void returnsFalseWhenStringDoesNotContainSpecialCharacter() {
//		String s = "123aaa";
//		assertFalse(practice.HasASpecialCharacter(s));
//	}
//}
