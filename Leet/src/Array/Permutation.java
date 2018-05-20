package Array;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String arg[]) {
		int[] arr = { 1, 2, 3 };
		Permutation perm = new Permutation();
		System.out.println(perm.permute(arr));
	}

	public List<List<Integer>> permute(int[] arr) {

		List<List<Integer>> list = new ArrayList<>();
		backTrack(arr, new ArrayList<>(), list);
		return list;
	}

	private void backTrack(int[] arr, List<Integer> tempList, List<List<Integer>> list) {

		if (tempList.size() == arr.length) {
			list.add(new ArrayList<>(tempList));
		} else {

			for (int i = 0; i < arr.length; i++) {
				if (tempList.contains(arr[i]))
					continue;
				tempList.add(arr[i]);
				backTrack(arr, tempList, list);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
