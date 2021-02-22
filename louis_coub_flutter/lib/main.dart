import 'package:flutter/material.dart';
import 'package:louis_coub_flutter/RandomWords.dart';
import 'package:provider/provider.dart';

void main() =>runApp(MyApp());

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    // return MultiProvider(
    //     providers:[
    //       ChangeNotifierProvider(create: (_)=>Counter(),)
    //
    // ],
    //   child: MaterialApp(
    //     title: "provider示例",
    //     home: FirstPage(),
    //   ),
    // );
    /**
     * 随机生成单词的一个主页
     */
    return MaterialApp(
      title: "welcome to flutter",
      home: Scaffold(
        appBar: AppBar(
          title: Text("第一个页面"),

        ),
        body: Center(
          child: RandomWords()

        ),
      ),
    );

  }
}

/**
 * 目前不算跑起来了，当点击按钮的时候还是会报错。
 */
class FirstPage extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("第一个页面"),
        actions: <Widget>[
          FlatButton(onPressed: ()=>Navigator.push(context, MaterialPageRoute(builder: (context){
            return SecondPage();
          })), child: Text("下一页"))
        ],
      ),
      body: Center(
        child: Text("${Provider.of<Counter>(context).count}"),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: (){
          Provider.of<Counter>(context).increment();
        },
        child: Icon(Icons.add),
      ),
    );
  }
}
class SecondPage extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      appBar: AppBar(
        title: Text("第二个页面"),

      ),
      body: Center(
        child: Text("${Provider.of<Counter>(context).count}"),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: (){
          Provider.of<Counter>(context).increment();

        },
        child: Icon(Icons.add),
      ),
    );
  }
}
class Counter with ChangeNotifier{
  int _count=0;
  int get count=>_count;
  void increment(){
    _count++;
    notifyListeners();
  }
}
