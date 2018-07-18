Prototype class have a clone() method.

The certain class can extends the Prototype and implement clone() method.

deep clone:
have to clone all the reference object in object

shallow clone:
only copy the non static object variables, but the reference is keep the same.

JAVA clone() method is shallow clone
we do deep clone in the sample, so we implements Cloneable interface and call father
clone() method
If we have reference object in resume object, and we want to deep clone this resume
object, then reference class should implements Cloneable interface, implement clone()
method and call father clone() method as well 