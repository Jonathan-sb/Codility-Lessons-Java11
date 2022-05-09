package lesson1_Iterations;

public class BinaryGapZeros {

	public static void main(String[] args) {
		System.out.println(getBinaryForm(145));
		System.out.println(getBinaryGaps(getBinaryForm(145)));

	}
	
	public static int getBinaryGaps(String binaryStr) {
		int lengthStr=binaryStr.length(),maxGap=0;
		int gapLength;
		boolean flag=false;
		for(int i=0;i<lengthStr;i++) {
			char bit = binaryStr.charAt(i);
			if(flag) {
				if(bit=='0') {
					gapLength=0;
					i++;
					for(int j=i;j<lengthStr;j++) {
						gapLength+=1;
						char innerBit = binaryStr.charAt(j);
						i++;
						if(innerBit=='1') {
							if(gapLength>maxGap) {
								maxGap = gapLength;
							}
							//totalGaps=totalGaps+1;
							i--;
							break;
						}
					}
				}
			}else if(bit=='1'){
				flag = true;
			}
			
		}
		// return totalGaps;
		return maxGap;
	}

	public static int solution(int binaryInt) {
		int res = 0;
		String binaryStr = getBinaryForm(binaryInt);
		return res;
	}

	public static String getBinaryForm(int decimal) {
		String res = "1";
		int sumaBinary = 0, i = 0, binaryExp;
		do {
			binaryExp = getBinaryExp(i);
			sumaBinary = sumaBinary + binaryExp;
			if (sumaBinary < decimal) {
				i++;
			}
		} while (sumaBinary < decimal);
		// dec=9, sumabinary=15, i=4
		// reemplazar binaryMaxPos por binaryExp
		if (sumaBinary != decimal) {
			int binaryMaxPos = getBinaryExp(i);
			if (binaryMaxPos == decimal) {
				if (i > 0) {
					for (; i > 0; i--) {
						res = res + "0";
					}
				}
			} else {
				sumaBinary = binaryMaxPos;
				int binExp = 0;
				while (sumaBinary < decimal || i>0) {
					//binExp = getBinaryExp(i - 1); // out of index 0-1
					binExp = i>0 ? getBinaryExp(i-1): getBinaryExp(0);
					sumaBinary =  sumaBinary +  binExp;
					if (sumaBinary == decimal) { // dec 6
						res = res + "1";
					} else { // puede ser menor o mayor
						if (sumaBinary > decimal) { // mayor
							res = res + "0";
							sumaBinary=sumaBinary-binExp;
						} else { // menor
							res = res + "1";
						}
						// decimal=5
					}
					i--;
				}

			}

		} else { 
			for (int j = 0; j < i; j++) {
				res += "1";
			}
		}
		return res;
	}

	public static String countBackwards(int sumaBinary, int maxIndex, int decimal) {
		int i = maxIndex;
		String binary = "1";
		do { // 31-8=23,
			sumaBinary = sumaBinary - getBinaryExp(i - 1);
			if (sumaBinary < decimal) {
				binary = binary + "1";
			} else if (sumaBinary > decimal) {
				binary = binary + "0";
			}
			i--;
		} while (sumaBinary > decimal | i > 0);
		// sumaBinary =19, i=2

		/*
		 * if(sumaBinary!=decimal) { int sumaLeft=getBinaryExp(maxIndex); do {
		 * sumaLeft=sumaLeft+getBinaryExp(i); if(sumaLeft<=decimal) { binary=binary+"1";
		 * }else { binary=binary+"0"; } i--; }while(sumaLeft<decimal|i>0); }else {
		 * if(i>0) { while(i>0) { binary=binary+"0"; i--; } } }
		 */

		return binary;
	}

	public static int getBinaryExp(int exp) {
		int res = 2;
		if (exp != 0) {
			for (int i = 0; i < exp - 1; i++) {
				res = res * 2;
			}
			return res;
		}
		return 1;
	}

}
