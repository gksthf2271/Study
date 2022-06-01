import 'package:dio/dio.dart';
import 'package:flutter/material.dart';
import 'package:flutter_study/network/model/document.dart';
import 'package:flutter_study/network/rest_client.dart';
import 'package:flutter_study/ui/searchListAdapter.dart';

class SearchPage extends StatefulWidget {
  const SearchPage({Key? key, required this.title}) : super(key: key);
  final String title;

  @override
  State<SearchPage> createState() => _SearchPageState();
}

class _SearchPageState extends State<SearchPage> {
  late RestClient kakaoClient;
  List<Document> searchResult = List.empty();

  @override
  void initState() {
    Dio dio = Dio();
    kakaoClient = RestClient(dio);
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    final myController = TextEditingController();

    Widget searchEdit = Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: <Widget>[
        Container(
            margin: EdgeInsets.all(8),
            child: TextField(
              controller: myController,
            )),
        FloatingActionButton(
            child: Icon(Icons.print),
            onPressed: () => {
                  //api 요청 test
                  Future.microtask(() async {
                    final resp =
                        await kakaoClient.searchKeywords(myController.text);
                    setState(() {
                      searchResult.clear();
                      searchResult = resp.documents;
                    });
                    print("result : ${searchResult}");
                  })
                })
      ],
    );

    Widget resultList = Container(
        child: Row(
            children: [
              searchEdit,
              Text("검색 결과 : ${myController.text}"),
              UsingSeparateListConstructing(searchResult)
            ]));

    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
        ),
        body: ListView(
          children: [resultList],
        ));
    // body: searchResult.length > 0
        //     ? ListView(
        //         children: [resultList],
        //       )
        //     : const Center(child: Text("No Items")));
  }
}

class UsingSeparateListConstructing extends StatelessWidget {
  UsingSeparateListConstructing(this.searchResultList);

  final List<Document> searchResultList;

  @override
  Widget build(BuildContext context) {
    return ListView.separated(
      itemCount: searchResultList.length + 1,
      itemBuilder: (context, index) {
        return SearchListAdapter(searchResultList[index - 1]);
      },
      separatorBuilder: (context, index) {
        if (index == 0) return SizedBox.shrink();
        return const Divider();
      },
    );
  }
}
