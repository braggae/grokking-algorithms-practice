int? binary_search(List highstack, int needle, [int low = 0, int? high]) {
  if (high == null) {
    high = highstack.length - 1;
  }

  if (high < low) {
    return null;
  }

  int mid = ((low + high) / 2).round();
  int guess = highstack[mid];

  if (guess == needle) {
    return mid;
  } else if (guess > needle) {
    return binary_search(highstack, needle, low, mid - 1);
  } else {
    return binary_search(highstack, needle, mid + 1, high);
  }
}

main(List<String> args) {
  print(binary_search([1, 3, 5, 7, 9, 11, 13, 17], 13));
}
