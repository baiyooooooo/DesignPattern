Visitor

Visitor: 为每一个具体的accepter类声明一个visit操作 （操作）

具体访问者：实现每个visitor声明过的操作

Accepter： 定义一个accept操作，操作参数为 一个visitor （数据）

具体接受者：具体元素，实现accept操作

ObjectStructure:枚举所有accepter，依次被visitor visit。相当于一个高层接口，允许访问者访问他的元素

操作与数据分离，增加操作容易（只需要继承visitor，然后实现新的算法即可），增加数据困难（需要更该包括accept的所有类）
