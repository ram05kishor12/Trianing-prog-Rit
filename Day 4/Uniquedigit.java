import java.io.*;
import  java.util.*;
class UserMainCode{
public int uniqueDigitsCount(int input1){

int count[]={0,0,0,0,0,0,0,0,0,0};
        int unique=1;
        while(input1>0){
            int n=input1%10;
            count[n]++;
            input1=input1/10;
        }
        for(int i=0;i<10;i++){
            if(count[i]==1){
                unique=unique+1;
            }
        }
		// throw new UnsupportedOperationException("uniqueDigitsCount(int input1)");
        return unique;
	}
}








