int? binary_search(List haystack, int needle, [int low = 0, int? high]) {
  if (high == null) {
    high = haystack.length - 1;
  }

  if (high < low) {
    return null;
  }

  int mid = ((low + high) / 2).round();
  int guess = haystack[mid];

  if (guess == needle) {
    return mid;
  } else if (guess > needle) {
    return binary_search(haystack, needle, low, mid - 1);
  } else {
    return binary_search(haystack, needle, mid + 1, high);
  }
}

main(List<String> args) {
  print(binary_search([1, 3, 5, 7, 9, 11, 13, 17], 13));
}
