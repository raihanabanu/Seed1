# Seed1
public class Seeeed{
public static void main (String args[]){
int j=Integer.parseInt(args[0]);
int k=j;
int mod=0;
int output=1;
while(j>0){
mod=j%10;
output*=mod;
j=j/10;
}
System.out.println(output*k);
}
}

