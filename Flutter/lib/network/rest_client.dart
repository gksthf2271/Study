import 'package:dio/dio.dart';
import 'package:flutter_study/network/token.dart';
import 'package:retrofit/retrofit.dart';

part 'rest_client.g.dart';

@RestApi(baseUrl: "http://localhost:8080")
abstract class RestClient {
  factory RestClient(Dio dio, {String baseUrl}) = _RestClient;

  @POST('/login')
  Future<Token> getAccessToken(@Body() Token token);
}