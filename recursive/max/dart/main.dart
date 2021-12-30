int max(List list, [int maxNum = 0]) {
  if (list.isEmpty) {
    return maxNum;
  }
  int currentItem = list.first;
  maxNum = currentItem > maxNum ? currentItem : maxNum;

  return max(list.sublist(1), maxNum);
}

main(List<String> args) {
  print(max([1, 3, 9, 2, 8]));
}
