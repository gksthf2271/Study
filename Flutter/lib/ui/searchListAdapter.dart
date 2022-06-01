import 'package:flutter/material.dart';
import 'package:flutter_study/network/model/document.dart';

class SearchListAdapter extends StatelessWidget {
  SearchListAdapter(this._searchResult);

  final Document _searchResult;

  @override
  Widget build(BuildContext context) {
    return ListTile(
      leading: Icon(Icons.place),
      title: Text(_searchResult.place_name),
      subtitle: Text(_searchResult.phone)
    );
  }
}