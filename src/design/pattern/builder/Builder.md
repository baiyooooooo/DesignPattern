Builder

创建复杂对象的算法 独立于该对象的组成部分 以及 它们的装配方式时，可用该模式

Builder类： 定义创建对象所需所有步骤
concreteBuilder： 定义每步骤独特的逻辑和数据
Director：组合所有创建步骤，然后创建对象