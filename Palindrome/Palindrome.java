class palindrome {
  public static void main(String[] args) {
    String name = "madam";

    char[] ch = name.toCharArray();
    boolean boo = false;

    for (int i = 0; i < (name.length() / 2); i++) {
      char start = ch[i];
      char end = ch[name.length() - 1 - i];

      if (start != end) {
        boo = true;
        break;
      }

    }

    if(boo == false){
      System.out.println("this is a pali");
    }else{
      System.out.println("this is not a pali");
    }
  }
}