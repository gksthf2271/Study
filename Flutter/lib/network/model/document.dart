import 'dart:core';

import 'package:json_annotation/json_annotation.dart';
part 'document.g.dart';

@JsonSerializable()
class Document {
  @JsonKey(name : "id")
  String id;                // 장소 ID

  @JsonKey(name : "place_name")
  String place_name;        // 장소명, 업체명

  @JsonKey(name : "category_name")
  String category_name;     // 카테고리 이름

  @JsonKey(name : "category_group_code")
  String category_group_code;// 중요 카테고리만 그룹핑한 카테고리 그룹 코드

  @JsonKey(name : "category_group_name")
  String category_group_name;// 중요 카테고리만 그룹핑한 카테고리 그룹명

  @JsonKey(name : "phone")
  String phone;             // 전화번호

  @JsonKey(name : "address_name")
  String address_name;      // 전체 지번 주소

  @JsonKey(name : "road_address_name")
  String road_address_name; // 전체 도로명 주소

  @JsonKey(name : "x")
  String x;                // X 좌표값, 경위도인 경우 longitude (경도)

  @JsonKey(name : "y")
  String y;                 // Y 좌표값, 경위도인 경우 latitude(위도)

  @JsonKey(name : "place_url")
  String place_url;        // 장소 상세페이지 URL

  @JsonKey(name : "distance")
  String distance;         // 중심좌표까지의 거리 (단, x,y 파라미터를 준 경우에만 존재), 단위 meter

  Document({
    required this.id,
    required this.place_name,
    required this.category_name,
    required this.category_group_code,
    required this.category_group_name,
    required this.phone,
    required this.address_name,
    required this.road_address_name,
    required this.x,
    required this.y,
    required this.place_url,
    required this.distance
  });

  factory Document.fromJson(Map<String, dynamic> json) => _$DocumentFromJson(json);

  Map<String, dynamic> toJson() => _$DocumentToJson(this);
}