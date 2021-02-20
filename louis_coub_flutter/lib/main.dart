import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}


class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    print("===========================");
    final appName='自定义主题';
    print(context);
    return MaterialApp(
      title: "welcome to flutter",
      theme: ThemeData(
        brightness: Brightness.light,
        primaryColor: Colors.lightGreen[600],

        accentColor:Colors.orange[600]
      ),
      home: MyHomePage(
        title: appName,
      ),
    );

  }

}
class MyHomePage extends StatelessWidget{

  final String title;
  MyHomePage({Key key,@required this.title}): super(key: key);
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      appBar: AppBar(
        title: Text(title),

      ),
      body: Center(
        child: Container(
          color: Theme.of(context).accentColor,
          child: Text(
            "zhangsan"
          ),

        ),

      ),
      floatingActionButton: Theme(
        data: Theme.of(context).copyWith(accentColor: Colors.grey),
        child: FloatingActionButton(
          onPressed: null,
          child: Icon(Icons.computer),
        ),

      ),

    );
  }

}