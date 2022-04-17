import 'package:dio/dio.dart';
import 'package:flutter_study/network/model/search_result.dart';
import 'package:retrofit/retrofit.dart';

part 'rest_client.g.dart';

@RestApi(baseUrl: "https://dapi.kakao.com")
abstract class RestClient {
  factory RestClient(Dio dio, {String baseUrl}) = _RestClient;

  @GET('/v2/local/search/keyword.json')
  Future<SearchResult> searchKeywords(@Query("query") String qeury);
}