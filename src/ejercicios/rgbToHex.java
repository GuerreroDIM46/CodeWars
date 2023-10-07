package ejercicios;

public class rgbToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static String rgb(int r, int g, int b) {
      if (r < 0) r = 0; if (r > 255) r = 255;
      if (g < 0) g = 0; if (g > 255) g = 255;
      if (b < 0) b = 0; if (b > 255) b = 255;
      String rHex = Integer.toHexString(r);
      String gHex = Integer.toHexString(g);
      String bHex = Integer.toHexString(b);
      if(rHex.length() == 1) rHex = "0".concat(rHex);
      if(gHex.length() == 1) gHex = "0".concat(gHex);
      if(bHex.length() == 1) bHex = "0".concat(bHex);
      String result = rHex.concat(gHex).concat(bHex);
      result = result.toUpperCase();
      return result;
    }
}
