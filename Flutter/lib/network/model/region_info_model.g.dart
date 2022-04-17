// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'region_info_model.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

RegionInfoModel _$RegionInfoModelFromJson(Map<String, dynamic> json) =>
    RegionInfoModel(
      region:
          (json['region'] as List<dynamic>).map((e) => e as String).toList(),
      keyword: json['keyword'] as String,
      selected_region: json['selected_region'] as String,
    );

Map<String, dynamic> _$RegionInfoModelToJson(RegionInfoModel instance) =>
    <String, dynamic>{
      'region': instance.region,
      'keyword': instance.keyword,
      'selected_region': instance.selected_region,
    };
