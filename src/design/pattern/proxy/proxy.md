Proxy

远程代理：一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象在不同地址的事实
虚拟代理：根据需要创建开销很大的对象，通过它来存放实力化需要很久的真实对象。将真是对象与外界联系的部分实例化代理出来，外界可以继续实例化之后的动作，真实对象也可以继续实例化直到完成
安全代理：用来控制真实对象访问时的权限，当不同访问对象的权限不同的时候，用代理模式来处理
智能引用：调用真实对象的时候，代理处理另外一些事情