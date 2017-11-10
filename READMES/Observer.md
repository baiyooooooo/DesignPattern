Observer (Publish/Subscribe):

定义一对多的依赖关系
观察者对象监听主题对象，一旦主题对象变化，能通知到所有观察者来更新自己

Subject: 定义notify方法，增加／删除观察者
Observer:为所有观察者定义接口，来接受和update subject的变化

当一个对象改变时需要同时改变多个其他对象的时候，而且具体有多少变量被改变也不确定的时候，可以使用观察者模式

事务委托
Event
定义事务，和事务调用的方法

EventHandler
添加listener， notify（invoke）所有event的事件

Subject
添加observer --> 等同于添加listener
notify -- 拿到eventhandler，然后notify 所有event


