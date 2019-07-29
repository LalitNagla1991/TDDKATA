package stringKata

import com.ecw.stringKata.NegativeNotAllowedException
import com.ecw.stringKata.StringCalculator

import spock.lang.Specification

class StringCalculatorSpec extends Specification{
	
		def 'string calculator'(){
			given:
				def stringCalculator = new StringCalculator();
				def result;
			when: 
				result=stringCalculator.add(numbers);
			then:
				expectedResult == result;
			where:
				numbers | expectedResult
				 "1,2"	| 3	
				 "1,2,3" | 6
				 "1\n2,3" | 6
				 "1,1001,3"| 4
		}
		def "Negative Not Allowed"(){
			given:
				def stringCalculator=new StringCalculator();
				def err
			when:
				result=stringCalculator.add(numbers)
				 
			then:
				err= thrown(NegativeException);
				err.message==message;
			where:
				numbers|NegativeException|message
				"1,-2,3"| NegativeNotAllowedException|"negatives not allowed -2"
		}
}
