# coding: utf-8

from inheritance import Person

obj2 = Person("Joana", 0)
obj1 = Person("João", 1)
print()
print("{name}:{sex}".format(name=obj1.name, sex=obj1.sex))
print("{name}:{sex}".format(name=obj2.name, sex=obj2.sex))
