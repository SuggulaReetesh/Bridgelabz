
public class OldMacDonald {
	public static void generate_poem(String animal,String sound) {
		String stanza1="Old MacDonald had a farm, \nE-I-E-I-O.\nAnd on his farm he had ANIMAL,";
		String stanza2="E-I-E-I-O.\nWith a SOUND,SOUND here,\nAnd a SOUND,SOUND there,\nHere a SOUND,there a SOUND,\nEverywhere a SOUND,SOUND";
		System.out.println(stanza1.replace("ANIMAL",animal));
		System.out.println(stanza2.replace("SOUND", sound));
		System.out.println();

	}
	public static void main(String[] args) {
		generate_poem("Chicks","chick");
		generate_poem("Duck","quack");
		generate_poem("Turkey","gobble");
		generate_poem("Cat","meow, meow");
		generate_poem("Mule","Hehaw");
		generate_poem("Dog","bow wow");
		generate_poem("Pig","ooink, oink");	
		generate_poem("Turtle","nerp, nerp");
		generate_poem("Cow","moo moo");
	}

}
