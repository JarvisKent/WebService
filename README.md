# WebService基础框架


这是一个基于CXF+Spring+Maven+log4j搭建的WebService基础框架，可以在此基础上轻易的开发WebService。

## WebService添加接口

在com.jarvis.webservice.service中的Service中添加WebService接口，然后再到ServiceImpl实现方法即可。

## 调用其他WebService的方法

使用可参照com.jarvis.webservice.clent中的写法来调用其他WebService接口。调用代码如下
```
RequestUtils request = new RequestUtils();
request.SendToWebService(url,method, param, new SendMessageListener() {
	public void success(Object[] result) {
		//调用成功获取到的数据
	}
	});
```

发布方法，与普通web项目一致。
