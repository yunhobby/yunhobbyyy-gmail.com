public class Gugudan {
	public static void main(String[] args) {
		
		int[] result = new int[8];
		
		for(int k = 0; k < result.length; k++) {
		for(int i = 0 ; i < result.length; i++) {
			result[i] = (k + 2) * (i + 1);
					//배열의 첫 시작은 0부터 시작함.
		}
		   }
		for(int k = 0; k < result.length; k++) {
			for(int i = 0 ; i < result.length; i++) {
				result[i] = (k + 2) * (i + 1);
			System.out.println(result[i]);
			}
		}
	}
}
	
//단락 복사 블락 지정 후 옵션 커맨드 아래 화살표 

// 중복되는 단락을 제거하기 위해 반복문 사용. 이중 for문 사용해보기.

