package com.comer.citri.utils;

import java.awt.image.BufferedImage;

public class Barcode128 {
  private String[] BARS = new String[] { 
      "212222", "222122", "222221", "121223", "121322", "131222", "122213", "122312", "132212", "221213", 
      "221312", "231212", "112232", "122132", "122231", "113222", "123122", "123221", "223211", "221132", 
      "221231", "213212", "223112", "312131", "311222", "321122", "321221", "312212", "312212", "322112", 
      "322211", "212123", "232121", "111323", "131123", "131321", "112313", "132113", "132311", "211313", 
      "231113", "231311", "112133", "112331", "132131", "113123", "113321", "133121", "313121", "211331", 
      "231131", "213113", "213311", "213131", "311123", "311321", "331121", "312113", "312311", "332111", 
      "314111", "221411", "431111", "111224", "111422", "121124", "121421", "141122", "141221", "112214", 
      "112412", "122114", "122411", "142112", "142211", "241211", "221114", "413111", "241112", "134111", 
      "111242", "131142", "121241", "114212", "124112", "124211", "411212", "421112", "421211", "212141", 
      "214121", "412121", "111143", "111341", "131141", "114113", "114311", "411113", "411311", "113141", 
      "114131", "311141", "411131" };
  
  private char[] letters = new char[] { 
      ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', 
      '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', 
      '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', 
      '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 
      'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
      'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', 
      '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 
      'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 
      'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 
      'z', '{', '|', '}', '~' };
  
  public BufferedImage createCodeBar(String barcode, int h) {
    int chksum = 104;
    String code = barcode;
    int m = 1;
    for (int i = 0; i < barcode.length(); i++) {
      int v = -1;
      for (int i1 = 0; i1 < this.letters.length; i1++) {
        if (this.letters[i1] == barcode.charAt(i))
          v = i1; 
      } 
      chksum += m * v;
      m++;
    } 
    chksum %= 103;
    barcode = barcode + this.letters[chksum];
    String wstr = "";
    for (int j = 0; j < barcode.length(); j++) {
      int v = -1;
      for (int i1 = 0; i1 < this.letters.length; i1++) {
        if (this.letters[i1] == barcode.charAt(j))
          v = i1; 
      } 
      wstr = wstr + this.BARS[v];
    } 
    wstr = "211214" + wstr + "2331112";
    int w = 0;
    int tam = 0;
    for (int k = 0; k < wstr.length(); k++) {
      int c = Integer.parseInt(wstr.substring(k, k + 1));
      for (int i1 = 0; i1 < c; i1++)
        tam++; 
    } 
    w = tam;
    tam = 0;
    BufferedImage image = new BufferedImage(w, h, 1);
    for (int n = 0; n < wstr.length(); n++) {
      int c = Integer.parseInt(wstr.substring(n, n + 1));
      for (int i1 = 0; i1 < c; i1++) {
        int point = 1 - n % 2;
        if (point == 0) {
          for (int d = 0; d < h; d++)
            image.setRGB(tam, d, 16777215); 
        } else if (point == 1) {
          for (int d = 0; d < h; d++)
            image.setRGB(tam, d, 0); 
        } 
        tam++;
      } 
    } 
    return image;
  }
  
  static void fillRect(int x0, int y0, int x1, int y1, int color, BufferedImage image) {
    for (int x = x0; x < x1; x++) {
      for (int y = y0; y < y1; y++)
        image.setRGB(x, y, color); 
    } 
  }
  
  public static void main(String[] args) {
    Barcode128 b = new Barcode128();
    BufferedImage image = b.createCodeBar("123456789", 40);
  }
}
