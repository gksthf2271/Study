// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'document.dart';

// **************************************************************************
// JsonSerializableGenerator
// **************************************************************************

Document _$DocumentFromJson(Map<String, dynamic> json) => Document(
      id: json['id'] as String,
      place_name: json['place_name'] as String,
      category_name: json['category_name'] as String,
      category_group_code: json['category_group_code'] as String,
      category_group_name: json['category_group_name'] as String,
      phone: json['phone'] as String,
      address_name: json['address_name'] as String,
      road_address_name: json['road_address_name'] as String,
      x: json['x'] as String,
      y: json['y'] as String,
      place_url: json['place_url'] as String,
      distance: json['distance'] as String,
    );

Map<String, dynamic> _$DocumentToJson(Document instance) => <String, dynamic>{
      'id': instance.id,
      'place_name': instance.place_name,
      'category_name': instance.category_name,
      'category_group_code': instance.category_group_code,
      'category_group_name': instance.category_group_name,
      'phone': instance.phone,
      'address_name': instance.address_name,
      'road_address_name': instance.road_address_name,
      'x': instance.x,
      'y': instance.y,
      'place_url': instance.place_url,
      'distance': instance.distance,
    };
