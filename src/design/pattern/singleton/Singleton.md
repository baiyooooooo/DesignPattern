Singleton
Singleton的每个类都需要把构造器私有化，这样可以disable类本身默认的构造器，避免外部可以通过 new 这个关键字来创建对象。

Synchronized:
- 修饰代码块：被装饰的代码块为“同步语句块”，作用范围是大括号内的代码，作用对象是掉用这代码块的对象
	一个对象调用这个代码块时，必须等到之前线程执行完这段代码块后才会释放对象锁，下个线程才能执行并锁定该线程
	多个对象调用时，对象直接互不干扰，A对象线程还没执行结束，B对象也可以调用该代码块
	
	public void method(){
		synchronized(this){
			//TODO
		}
	}
	
- 修饰方法：被修饰的方法为“同步方法”，作用范围是整个方法，作用对象是调用这个方法的对象
	synchronized关键字不能继承
	在定义接口方法时不能使用synchronized关键字。
	构造方法不能使用synchronized关键字，但可以使用synchronized代码块来进行同步。 
	
	public synchronized void method(){
		// TODO
	}
	
- 修饰一个静态方法：作用范围是整个静态方法，作用对象是这个类的所有对象

	public synchronized static void method(){
		// TODO
	}
	
- 修饰一个类：作用范围是synchronized后面扩起来的部分，作用主的对象是这个类的所有对象

	class ClassName{
		public void method(){
			synchronized(ClassName.class){
			// TODO
			}
		}
	}
	
	
Class Loader:
Load class files into JVM machine