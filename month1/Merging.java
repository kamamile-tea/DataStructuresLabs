class Merging{
  //Program to merge two already sorting ascending arrays without actually sorting them, just plaacing them into the correct spot i a new array
  public static void main(String[] args){
    int[] arr1 = {1,5,8};
    int[] arr2 = {2,3,6,9,13,14};
    int[] mine = merge(arr1,arr2);
    for(int k: mine){
      System.out.println(k);
    }
  }

  static int[] merge(int[] arr1, int[] arr2){
	int[] mergedArr = new int[arr1.length + arr2.length];
	int alpha = 0, comparee = 0;
	

	for(int i = 0; i < arr1.length + arr2.length; i++){
		if(alpha >= arr1.length){
			mergedArr[i] = arr2[comparee];
      comparee++;
		}
		else if(comparee >= arr2.length){
			mergedArr[i] = arr1[alpha];
      alpha++;
		}
    else{
      if(arr1[alpha] < arr2[comparee]){
        mergedArr[i] = arr1[alpha];
        alpha++;
      }
      else if(arr2[comparee] < arr1[alpha]){
        mergedArr[i] = arr2[comparee];
        comparee++;
      }
      else if(arr1[alpha] == arr2[comparee]){
        mergedArr[i] = arr1[alpha];
        i++;
        mergedArr[i] = arr2[comparee];
        alpha++;
        comparee++;
      }
    }
		
	}
  return mergedArr;
}
}