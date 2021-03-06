public class BaseConvert{
  public static void main(String[] args){
    while(true){
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.print("Base:");
    long base = Long.parseLong(s.next());
    System.out.print("Number:");
    String instr = s.next();
    System.out.print("Target Base:");
    long target = Long.parseLong(s.next());
    long bin = 0;
    for(int place = 0; place < instr.length(); place++){
      long c = instr.charAt(instr.length()-1-place)-((char)'0');
      if(c > 9)
        c-='A'-':';
      if(c > 9)
        c-='a'-'A';
      bin+=c*Math.pow(base,place);
    }
//    System.out.println("\n"+bin);
    String str = "";
    for(int digit = 0; bin>1; digit++){
      long temp = ((long)(bin/Math.pow(target,digit)))%target;
      bin-=Math.pow(target,digit)*temp;
//      System.out.println(temp+"\n"+bin);
      str=getChar(temp)+str;
    }
    System.out.println(str+" base"+target);
    }
  }
  public static char getChar(long num){
    if(num < 10)
      return (char)(num+'0');
    return (char)(num-10+'A');
  }
}