int? binary_search(List highstack, int needle) {
  int low = 0;
  int high = highstack.length - 1;

  while (low <= high) {
    int mid = ((low + high) / 2).round();
    int guess = highstack[mid];

    if (guess == needle) {
      return mid;
    } else if (guess > needle) {
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }
  return null;
}

main(List<String> args) {
  print(binary_search([1, 3, 5, 7, 9, 11, 13, 17], 1));
}
