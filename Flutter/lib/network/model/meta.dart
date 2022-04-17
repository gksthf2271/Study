import 'dart:core';

import 'package:json_annotation/json_annotation.dart';
import 'package:flutter_study/network/model/region_info_model.dart';
part 'meta.g.dart';

@JsonSerializable()
class Meta {
  @JsonKey(name: "total_count")
  int total_count;           // Integer  검색어에 검색된 문서 수

  @JsonKey(name: "pageable_count")
  int pageable_count;        // Integer  total_count 중 노출 가능 문서 수 (최대: 45)

  @JsonKey(name: "is_end")
  bool is_end;            // 현재 페이지가 마지막 페이지인지 여부

  @JsonKey(name: "same_name")
  RegionInfoModel items;      // 질의어의 지역 및 키워드 분석 정보

  Meta({
    required this.total_count,
    required this.pageable_count,
    required this.is_end,
    required this.items
  });

  factory Meta.fromJson(Map<String, dynamic> json) => _$MetaFromJson(json);

  Map<String, dynamic> toJson() => _$MetaToJson(this);
}