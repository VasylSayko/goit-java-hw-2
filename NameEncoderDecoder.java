public class NameEncoderDecoder {

        public String encode(String name) {
            String replace = name
                    .replace("e", "1")
                    .replace("u", "2")
                    .replace("i", "3")
                    .replace("o", "4")
                    .replace("a", "5");
            return "NOTFORYOU" + replace + "YESNOTFORYOU";
        }

        public String decode(String name) {
            String a1 = name.substring(9);
            String a2 = a1.replace ("YESNOTFORYOU","");
            String replace = a2
                    .replace("1", "e")
                    .replace("2", "u")
                    .replace("3", "i")
                    .replace("4", "o")
                    .replace("5", "a");
            return replace;
        }

        public static void main(String[] args) {
            NameEncoderDecoder names = new NameEncoderDecoder();

            String encode = names.encode("Crab");
            System.out.println(encode);

            String decode = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
            System.out.println(decode);
        }
}
