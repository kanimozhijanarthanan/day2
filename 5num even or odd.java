import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int countEvensOdds(int input1,int input2,int input3,int input4,int input5,String input6){
  int count=0;
  if(input1%2==0)
   count++;
  if(input2%2==0)
   count++;
  if(input3%2==0)
   count++;
  if(input4%2==0)
   count++;
  if(input5%2==0)
   count++;
  if(input6.equals("even"))
   return count;
  else
   return 5-count;
 }

}
