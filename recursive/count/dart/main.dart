int count(List list) {
  if (list.isEmpty) {
    return 0;
  }

  return 1 + count(list.sublist(1));
}

main(List<String> args) {
  print(count([1, 2, 3, 4, 69]));
}
