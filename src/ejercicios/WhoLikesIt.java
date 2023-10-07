package ejercicios;

public class WhoLikesIt {

	public static void main(String[] args) {
		String[] names = new String [] { "zone", "abigail", "theta", "form", "libe", "theta", "zas", "abigail", "tetas" };
		System.out.println(whoLikesIt(names));

	}
  public static String whoLikesIt(String... names) {
  	String result = "holaquetal";
  	if (names.length == 0) {
  		result = "no one likes this";
 		} else if (names.length == 1) {
 			result = names[0].concat(" likes this");
		} else if (names.length == 2) {
			result = names[0].concat(" and ").concat(names[1]).concat(" like this");
		} else if (names.length == 3) {
			result = names[0].concat(", ").concat(names[1]).concat(" and ").concat(names[2]).concat(" like this");
		} else if (names.length >= 4) {
			result = names[0].concat(", ").concat(names[1]).concat(" and ").concat(Integer.toString(names.length - 2)).concat(" others like this");
		}
  	
    return result;
}
	
	
}
