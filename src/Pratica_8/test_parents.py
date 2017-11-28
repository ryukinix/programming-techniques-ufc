#!/usr/bin
# coding: utf-8

from inheritance import Parents

obj2 = Parents("Maria", 1, "Eduarda")
obj1 = Parents("João", 0, "Eduarda")
print()
print("{name}:{sex} -> {child}".format(name=obj1.name,
                                       sex=obj1.sex,
                                       child=obj1.get_child()))
print("{name}:{sex} -> {child}".format(name=obj2.name,
                                       sex=obj2.sex,
                                       child=obj2.get_child()))
