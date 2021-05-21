int sum(List list) {
  if (list.isEmpty) {
    return 0;
  }

  return list.first + sum(list.sublist(1));
}

main() {
  print(sum([1, 2, 3, 4]));
}
