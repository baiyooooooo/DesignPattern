Decorator
动态的给一个对象添加职责

Component： 原本类（主要职责所在类）

Decorator：装饰类，通过setComponent来添加职责，添加的职责内需要先完成父类的职责

客户端最终实例化component，然后通过decorator setComponent添加职责，调用最后一个装饰返回的对象
