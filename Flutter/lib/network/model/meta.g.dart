// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'meta.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

Meta _$MetaFromJson(Map<String, dynamic> json) => Meta(
      total_count: json['total_count'] as int,
      pageable_count: json['pageable_count'] as int,
      is_end: json['is_end'] as bool,
      items:
          RegionInfoModel.fromJson(json['same_name'] as Map<String, dynamic>),
    );

Map<String, dynamic> _$MetaToJson(Meta instance) => <String, dynamic>{
      'total_count': instance.total_count,
      'pageable_count': instance.pageable_count,
      'is_end': instance.is_end,
      'same_name': instance.items,
    };
