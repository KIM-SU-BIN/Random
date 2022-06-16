package random;

import java.util.HashSet;
import java.util.Set;


public class lunchmenuRandom {
	  public static void main(String[] args) {
	      
	      Set<Integer> lotto = new HashSet<Integer>();
	      
	      while(true) {
	      
	         if(lotto.size() < 1) {
	            
	            lotto.add((int) ((Math.random()*24)+1));
	            
	         } else {
	            
	            break;
	            
	         }
	      }
	      
	      
	      for(Integer num:lotto) {
	         System.out.print(num.toString() + "\t");
	      }
	            
	   }
	   
	   /*
	   1.라공방(마라탕/라화쿵푸)
	   2.이삭버거
	   3.버거킹
	   4.라멘
	   5.삼겹살정식
	   6.본죽
	   7.북촌손만두(칼국수)
	   8.나주곰탕
	   9.돈까스
	   10.홍콩반점
	   11.(지옥의)텐동
	   12.롯데리아
	   13.모리돈부리(덮밥)
	   14.어메이징디(퓨전샐러드)
	   15.샐러디
	   16.모다모다(카레)
	   17.서브웨이
	   18.역전우동
	   19.분식집
	   20.도스타코스(타코)
	   21.보승회관(국밥)
	   22.하우림(도토리묵밥)
	   23.애슐리
	   24.지구당(규동&생맥)
	   25.아로이팟타이
	   26.8층 무언가..
	   27.행복은간장밥(간장새우덮밥)
	   28.소년주막(그냥 가보고싶은 술집...)
	   29.마차이짬뽕
	   30.장수우렁불백
	   */

	}
	
	
