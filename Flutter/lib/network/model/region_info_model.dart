import 'dart:core';
import 'package:json_annotation/json_annotation.dart';
part 'region_info_model.g.dart';

@JsonSerializable()
class RegionInfoModel {
  @JsonKey(name: "region")
  List<String> region;           // 질의어에서 인식된 지역의 리스트

  @JsonKey(name: "keyword")
  String keyword;            // 질의어에서 지역 정보를 제외한 키워드

  @JsonKey(name: "selected_region")
  String selected_region;     // 인식된 지역 리스트 중, 현재 검색에 사용된 지역 정보

  RegionInfoModel({
    required this.region,
    required this.keyword,
    required this.selected_region
  });

  factory RegionInfoModel.fromJson(Map<String, dynamic> json) => _$RegionInfoModelFromJson(json);

  Map<String, dynamic> toJson() => _$RegionInfoModelToJson(this);
}
