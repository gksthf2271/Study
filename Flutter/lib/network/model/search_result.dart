import 'dart:core';

import 'package:json_annotation/json_annotation.dart';
import 'package:flutter_study/network/model/document.dart';
import 'package:flutter_study/network/model/meta.dart';
part 'search_result.g.dart';

@JsonSerializable()
class SearchResult {
  @JsonKey(name: "meta")
  Meta meta;

  @JsonKey(name: "documents")
  List<Document> documents;

  SearchResult({
    required this.meta,
    required this.documents
  });

  factory SearchResult.fromJson(Map<String, dynamic> json) => _$SearchResultFromJson(json);

  Map<String, dynamic> toJson() => _$SearchResultToJson(this);
}